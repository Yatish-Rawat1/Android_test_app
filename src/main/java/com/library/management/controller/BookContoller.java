package com.library.management.controller;

import com.library.management.entity.Book;
import com.library.management.service.BookInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class BookContoller {

    @Autowired
    BookInter bookService;

    @PostMapping(value = "/book")
   public ResponseEntity<Book>addBook(@RequestBody Book book){

        return new ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED);
    }

    @GetMapping(value="getById/{id}")
    public ResponseEntity<Book>findByBookId(@PathVariable Integer id){
        Book book1= bookService.getBook(id);
        return new ResponseEntity(book1,HttpStatus.OK);
    }

    @GetMapping(value="getByName/{name}")
    public ResponseEntity<Book>findByBookName(@PathVariable String name){
       List< Book> book1= bookService.getBookByName(name);
        return new ResponseEntity(book1,HttpStatus.OK);
    }

    @GetMapping(value="getAll")
    public ResponseEntity<Book>findAllBook(){
       List<Book> book1= bookService.getAllBook();
        return new ResponseEntity(book1,HttpStatus.OK);
    }
}

