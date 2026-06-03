package com.example.trainee_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    private static List<Book> bookShelf = new ArrayList<Book>();
    @GetMapping("/add-book")
    public String addBook(@RequestParam int id, @RequestParam String name) {
        Book book = new Book(id, name);
        bookShelf.add(book);
        return "Book added successfully!";
    }

    @GetMapping("/all-books")
    public List<Book> getAllBooks() {
        return bookShelf;
    }

    @GetMapping("/find-by-id")
    public Book findById(@RequestParam int id) {
        for (Book b : bookShelf) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }
    @GetMapping("/find-by-name")
    public Book findByName(@RequestParam String name) {
        for (Book b : bookShelf) {
            if (b.getName().equalsIgnoreCase(name)) {
                return b;
            }
        }
        return null;
    }
}
