package com.example.trainee_app.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "products")
public class Product {

    //Declaring variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int    productId;
    @NotBlank (message = "Product name is required")
    @Column(nullable = false)
    private String productName;

    @Min(value = 0, message = "price cannot be negative")
    @Column(nullable = false)
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

    // Setter methods

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
