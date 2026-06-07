package com.example.trainee_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController {
    private static List<Author> authorList = new ArrayList<>();
    private static List<Book> bookList = new ArrayList<>();

    @GetMapping("/addAuthor")
    public String addAuthor(@RequestParam int id, @RequestParam String name, @RequestParam String biography) {
        authorList.add(new Author(id, name, biography));
        return "Author " + name + " added successfully!";

}
    @GetMapping("/allAuthors")
    public List<Author> getAllAuthors() {
        return authorList;
    }
    @GetMapping("/addRelationalBook")
    public String addRelationalBook(@RequestParam int id, @RequestParam String name, @RequestParam int authorId) {
        boolean authorExists = false;

        // Check if the author exists in our registry
        for (Author a : authorList) {
            if (a.getId() == authorId) {
                authorExists = true;
                break;
            }
        }

        if (authorExists) {
            bookList.add(new Book(id, name, authorId));
            return "Success: Book '" + name + "' linked to Author ID " + authorId + " and saved.";
        } else {
            return "Error: Author registry failed. No author found with ID " + authorId + ". Book not saved.";
        }
    }

    @GetMapping("/authorReport")
    public String getAuthorReport(@RequestParam String authorName) {
        Author foundAuthor = null;

        //  get the Author
        for (Author a : authorList) {
            if (a.getName().equalsIgnoreCase(authorName)) {
                foundAuthor = a;
                break;
            }
        }

        if (foundAuthor == null) {
            return "Error: Author '" + authorName + "' not found in our records.";
        }

        // get all books belonging to this author
        String booksWritten = "";
        for (Book b : bookList) {
            if (b.getAuthorId() == foundAuthor.getId()) {
                booksWritten += "- " + b.getName() + " ";
            }
        }

        if (booksWritten.equals("")) {
            booksWritten = "None";
        }

        // final report
        return "--- Author Report --- " +
                "Name: " + foundAuthor.getName() + " | " +
                "Bio: " + foundAuthor.getBiography() + " | " +
                "Books Written: " + booksWritten;
    }
}
