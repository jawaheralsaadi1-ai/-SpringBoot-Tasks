package com.example.trainee_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    private static List<Book> bookShelf = new ArrayList<Book>();
    @GetMapping("/addBook")
    public String addBook(@RequestParam int id, @RequestParam String name) {
        Book book = new Book(id, name);
        bookShelf.add(book);
        return "Book added successfully!";
    }

    @GetMapping("/allBooks")
    public List<Book> getAllBooks() {
        return bookShelf;
    }

    @GetMapping("/findById")
    public Book findById(@RequestParam int id) {
        for (Book b : bookShelf) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }
    @GetMapping("/findByName")
    public Book findByName(@RequestParam String name) {
        for (Book b : bookShelf) {
            if (b.getName().equalsIgnoreCase(name)) {
                return b;
            }
        }
        return null;
    }
    @GetMapping("/search-msg")
    public String searchMsg(@RequestParam int id) {
        for (Book b : bookShelf) {
            if (b.getId() == id) {
                return "Found: " + b.getName();
            }
        }
        return "Sorry, that book ID is not available.";
    }
}
