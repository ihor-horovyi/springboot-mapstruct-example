package com.example.springbootmapstructexample.book.repository;

import com.example.springbootmapstructexample.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
