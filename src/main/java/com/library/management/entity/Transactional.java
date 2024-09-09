package com.library.management.entity;

import jakarta.persistence.*;


import java.time.LocalDate;
@Entity

public class Transactional {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="bookId")
    Book book;
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="userId")
    User user;

    LocalDate borrowDate;
    LocalDate returnDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
