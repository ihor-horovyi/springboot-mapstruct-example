package com.example.springbootmapstructexample.book.mapper;

import com.example.springbootmapstructexample.book.dto.BookDto;
import com.example.springbootmapstructexample.book.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class MyBookMapper {

  public static BookDto toBookDto(Book book) {
    BookDto bookDto = new BookDto();

    bookDto.setId(book.getId());
    bookDto.setTitle(book.getTitle());

    return bookDto;
  }

}
