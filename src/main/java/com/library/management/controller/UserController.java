package com.library.management.controller;

import com.library.management.entity.Book;
import com.library.management.entity.User;
import com.library.management.service.BookInter;
import com.library.management.service.UserServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServ userServ;

    @PostMapping(value = "/add")
    public ResponseEntity<User> addBook(@RequestBody User user){

        return new ResponseEntity<>(userServ.createUser(user), HttpStatus.CREATED);
    }

    @GetMapping(value="getById/{id}")
    public ResponseEntity<User>findByUserId(@PathVariable Integer id){
        User user1= userServ.findUser(id);
        return new ResponseEntity(user1,HttpStatus.OK);
    }
}
