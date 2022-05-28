package com.example.springbootmapstructexample.book.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class AuthorPublisherDto {
  private String myAuthor;
  private String myPublisher;

}
