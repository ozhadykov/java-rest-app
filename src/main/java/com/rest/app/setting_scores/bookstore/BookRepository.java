package com.rest.app.setting_scores.bookstore;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// in JpaRepository we are defining what are we going to manage and which ID it has
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByAuthor(String author);

    List<Book> findByTitleContaining(String keyword);

    List<Book> findByPriceBetween(double minPrice,double maxPrice);

    //Book updateBookById(int id, Book book);
}
