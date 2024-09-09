package com.library.management.service;

import com.library.management.entity.User;
import com.library.management.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServImpl implements UserServ{
@Autowired
    UserRepo userRepo;

    @Override
    public User createUser(User user) {
        return  userRepo.save(user);
    }

    @Override
    public User findUser(int id) {
        Optional<User>op=userRepo.findById(id);
        User user=new User();
        user= op.get();

        return user;
    }


}
