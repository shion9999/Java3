package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByAuthorId(Integer authorId);
    List<Book> findByCategoryId(Integer categoryId);
}
