package com.library.management.service;

import com.library.management.entity.Book;
import com.library.management.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BookService implements BookInter {
    @Autowired
    BookRepo bookRepo;

    @Override
    public Book addBook(Book book) {

        return  bookRepo.save(book);
    }

    @Override
    public List<Book> getAllBook() {
     Iterable<Book> bookList=bookRepo.findAll();

        return (List<Book>) bookList;
    }

    @Override
    public Book getBook(int id) {
        Book bk=new Book();
       Optional< Book> b=bookRepo.findById(id);
        if(b.isPresent()){
            bk=b.get();}
        return bk;
    }
@Override
    public List<Book> getBookByName(String name){

       List<Book>bookList=bookRepo.findByName(name);
        return bookList;


    }
}
