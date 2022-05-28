package com.example.springbootmapstructexample.book.mapper;

import com.example.springbootmapstructexample.book.dto.AuthorPublisherDto;
import com.example.springbootmapstructexample.book.dto.BookDto;
import com.example.springbootmapstructexample.book.entity.Book;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Mapper(uses = Book.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BookMapper {

  Book toBook(BookDto source);

  @Mapping(source = "numberOfPages", target = "pages", qualifiedByName = "numberOfPagesToPages")
  BookDto toBookDto(Book source);

  @Named("numberOfPagesToPages")
  static List<Integer> numberOfPagesToPages(int numberOfPages) {
    return IntStream
        .rangeClosed(1, numberOfPages)
        .boxed()
        .collect(Collectors.toList());
  }

  @Mapping(target = "myAuthor", source = "author")
  @Mapping(target = "myPublisher", source = "publisher")
  AuthorPublisherDto toAuthorPublisherDto(Book source);
}
