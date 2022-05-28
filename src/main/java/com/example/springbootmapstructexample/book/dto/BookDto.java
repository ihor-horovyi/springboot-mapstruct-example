package com.example.springbootmapstructexample.book.dto;

import lombok.Data;
import java.util.List;

@Data
public class BookDto {
  private Long id;
  private String title;
  private List<Integer> pages;
}
