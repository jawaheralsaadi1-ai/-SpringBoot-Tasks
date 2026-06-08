package com.example.trainee_app;

public class Product {

    // declaring variables.
    private int    id;
    private String name;
    private int    stockQuantity;

   // constructor to initialize all fields
    public Product(int id, String name, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.stockQuantity = stockQuantity;
    }
    // getter methods for id, name and stockQuantity
    public int getId() {return id;}
    public String getName() {return name;}
    public int getStockQuantity() {return stockQuantity;}

    //setter methods for id, name and stockQuantity
    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;}
}
