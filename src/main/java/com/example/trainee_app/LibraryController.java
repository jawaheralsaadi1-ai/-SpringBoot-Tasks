package com.example.trainee_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


public class LibraryController {
    private static List<Author> authorList = new ArrayList<>();
    private static List<Book> bookList = new ArrayList<>();

    @GetMapping("/addAuthor")
    public String addAuthor(@RequestParam int id, @RequestParam String name, @RequestParam String biography) {
        authorList.add(new Author(id, name, biography));
        return "Author " + name + " added successfully!";

}

}
