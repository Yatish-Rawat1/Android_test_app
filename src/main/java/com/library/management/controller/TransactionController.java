package com.library.management.controller;

import com.library.management.entity.Transactional;
import com.library.management.service.TansactionServ;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class TransactionController {
    @Autowired
    TansactionServ tansactionServ;

    @PostMapping("/borrow")
    ResponseEntity<Transactional>borrowBook(@RequestParam Integer userId, @RequestParam Integer bookId){
        return new ResponseEntity<>(tansactionServ.borrowBook(userId, bookId), HttpStatus.CREATED);

    }
}
