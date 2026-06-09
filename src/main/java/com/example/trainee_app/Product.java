package com.example.trainee_app;

public class Product {

    //Declaring variables
    private int    productId;
    private String productName;
    private double price;

    // Constructor (to initialize all fields)
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    // Getter methods
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
