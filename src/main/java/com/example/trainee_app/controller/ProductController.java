package com.example.trainee_app.controller;

import com.example.trainee_app.entities.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;

@RestController
public class ProductController {

    // Store database using HashMap
    private ConcurrentHashMap<Integer, Product> productMap = new ConcurrentHashMap<>();

    // Preload sample data
    public ProductController() {
        productMap.put(1, new Product(1, "Laptop",  10));
        productMap.put(2, new Product(2, "Monitor", 25));
        productMap.put(3, new Product(3, "Keyboard", 50));
    }

    // PUT endpoint — updates stock quantity for a product by id
    @PutMapping("/updateStock/{id}")
    public String updateStock(@PathVariable int id,
                              @RequestParam int quantity) {

        // Check if product exists in the HashMap
        if (!productMap.containsKey(id)) {
            return "Product not found.";
        }

        // Retrieve product and save previous stock before update
        Product product       = productMap.get(id);
        int     previousStock = product.getStockQuantity();

        // Update only the stockQuantity field using setter method
        product.setStockQuantity(quantity);

        return "Product Updated Successfully\n"
                + "Product Name  : " + product.getName()    + "\n"
                + "Previous Stock: " + previousStock         + "\n"
                + "Updated Stock : " + product.getStockQuantity();
    }
}