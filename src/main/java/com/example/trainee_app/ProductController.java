package com.example.trainee_app;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ProductController {
    // Store product data using HashMap
    private HashMap<Integer, Product> productMap = new HashMap<>();

    // Preload sample product data
    public ProductController() {
        productMap.put(1, new Product(1, "Laptop", 10));
        productMap.put(2, new Product(2, "Monitor", 25));
        productMap.put(3, new Product(3, "Keyboard", 50));
    }

    // PUT endpoint
    @PutMapping("/updateStock{Id}")
    //Configure the method
    public String updateStock(@PathVariable int id,
                              @RequestParam int quantity) {
        // Check if product exists in the HashMap
        if (!productMap.containsKey(id)) {
            return "Product not found.";
        }
        // Retrieve product and save previous stock before update
        Product product = productMap.get(id);
        int previousStock = product.getStockQuantity();

        // Update only the stockQuantity field using setter method
        product.setStockQuantity(quantity);

        return "Product Updated Successfully\n"
                + "Product Name  : " + product.getName() + "\n"
                + "Previous Stock: " + previousStock + "\n"
                + "Updated Stock : " + product.getStockQuantity();
    }
}