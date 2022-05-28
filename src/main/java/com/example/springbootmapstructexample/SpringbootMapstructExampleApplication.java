package com.example.springbootmapstructexample;

import com.example.springbootmapstructexample.book.entity.Book;
import com.example.springbootmapstructexample.book.mapper.BookMapper;
import com.example.springbootmapstructexample.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.ZonedDateTime;

@SpringBootApplication
public class SpringbootMapstructExampleApplication implements CommandLineRunner {
  @Autowired
  private BookMapper bookMapper;

  @Autowired
  private BookRepository bookRepository;

  public static void main(String[] args) {
    SpringApplication.run(SpringbootMapstructExampleApplication.class, args);
  }

  @Override
  public void run(String... args) {

    System.out.println("__________Start__________");

    bookRepository.save(
        Book.builder()
            .title("Spring Boot in Action")
            .author("Craig Walls")
            .genre("Programming")
            .publisher("Manning")
            .publicationDate(ZonedDateTime.now())
            .version(1)
            .numberOfPages(500)
            .build()
    );


    System.out.println(
        bookMapper.toBookDto(bookRepository.findAll().get(0))
    );


    System.out.println("__________End__________");

  }
}
