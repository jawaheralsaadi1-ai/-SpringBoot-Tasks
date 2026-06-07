package com.example.trainee_app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
public class BookstoreController {

    // Initialize a static in-memory List to store the book catalog
    private static final List<InventoryBook> catalog = new ArrayList<>();

   // Mapping : GET endpoint
    @GetMapping("/addBook")//   //Web Path: /add-book
    public String addBook(
            @RequestParam int id,
            @RequestParam String title,
            @RequestParam double price,
            @RequestParam int stock) {

        //  Create a new object using the constructor
        InventoryBook newBook = new InventoryBook(id, title, price, stock);

        //  Add to list
        catalog.add(newBook);

        //  Return a confirmation message.
        return "Success: The book '" + title + "' (ID: " + id + ") has been successfully added to the bookstore's catalog.";
    }
    // Optional endpoint to review all books added
    @GetMapping("/viewCatalog")
    public List<InventoryBook> viewCatalog() {
        return catalog;
    }
    @GetMapping("/checkStock")
    // Use a request parameter to get the target book ID.
    public String checkStock(@RequestParam int id) {
        //Loop through to find the matching book.
       for(InventoryBook book : catalog) {
         if(book.getBookId() == id) {
             if(book.getStockCount() > 0){
                 return "Success: '" +  book.getTitle()  + "' is available! Price: $"
                         + book.getPrice() + " | Units remaining: " + book.getStockCount();

             } else{
                 return "Sold Out: '" + book.getTitle() + "' is currently out of stock.";

             }

         }
       }
        return "Not Found: The bookstore does not carry a title matching ID " + id + ".";    }
}