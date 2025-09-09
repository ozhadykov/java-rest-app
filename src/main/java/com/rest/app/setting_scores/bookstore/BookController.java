package com.rest.app.setting_scores.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @PostMapping("/book")
    public Book createBook(@RequestBody Book book) {
        Book newBook = bookRepository.save(book);
        return newBook;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return bookRepository.save(book);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable int id, @RequestBody Book book) {
        book.setId(id);
        bookRepository.delete(book);
        return ResponseEntity.ok().build();
    }
}
