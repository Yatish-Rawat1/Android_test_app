package com.library.management.service;

import com.library.management.entity.Book;

import java.util.List;

public interface BookInter {
    Book addBook(Book book);   //save()
    List<Book> getAllBook();     // findByAll()
    Book getBook(int id);         // findById()
    List<Book>  getBookByName(String name);     // findByName()
}
