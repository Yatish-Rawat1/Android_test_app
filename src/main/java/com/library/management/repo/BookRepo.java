package com.library.management.repo;

import com.library.management.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;
import java.util.Optional;

public interface BookRepo extends JpaRepository<Book, Integer> {
   @Query("select m from Book m where m.BookName=?1")
   List<Book> findByName(String name);
}
