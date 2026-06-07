package com.example.trainee_app;

public class InventoryBook {
    // Declaring Variables
    private int bookId;
    private String title;
    private double price;
    private int stockCount;

//constructor - that initializes all four values when a new book object is created.
    public InventoryBook(int bookId, String title, double price, int stockCount) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.stockCount = stockCount;
    }

//Getter methods for controller to read properties later.
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getStockCount() {
        return stockCount;
    }
}

