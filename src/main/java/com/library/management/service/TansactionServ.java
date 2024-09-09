package com.library.management.service;

import com.library.management.entity.Transactional;


public interface TansactionServ {
    Transactional borrowBook(int userId, int bookId);
}
