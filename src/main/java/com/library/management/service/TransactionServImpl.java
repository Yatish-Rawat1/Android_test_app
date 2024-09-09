package com.library.management.service;

import com.library.management.entity.Book;
import com.library.management.entity.Transactional;
import com.library.management.entity.User;
import com.library.management.repo.BookRepo;
import com.library.management.repo.TransRepo;
import com.library.management.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class TransactionServImpl implements TansactionServ{
    @Autowired
    BookRepo bookRepo;
    @Autowired
    TransRepo transRepo;
    @Autowired
    UserRepo userRepo;
    @Override
    public Transactional borrowBook(int userId, int bookId) {
        Book book=new Book();
        Optional<Book>op=bookRepo.findById(bookId);
        if(op.isPresent() && op.get().getStatus()==true){
            book= op.get();
            book.setStatus(false);
        }
        else{
            System.out.println("Book is not available");
        }
        bookRepo.save(book);
        User user=new User();
        Optional<User>op1=userRepo.findById(userId);
        if(op1.isPresent()){
            user=op1.get();
        }
        else{
            System.out.println("User is not Present");
        }
        Transactional transactional=new Transactional();
        transactional.setBook(book);
        transactional.setUser(user);// user bnega

        transactional.setBorrowDate(LocalDate.now());
        return  transRepo.save(transactional);
    }

}
