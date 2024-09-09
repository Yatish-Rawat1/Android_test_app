package com.library.management.service;

import com.library.management.entity.User;

public interface UserServ {
    User createUser(User user);

    User findUser(int id);
}
