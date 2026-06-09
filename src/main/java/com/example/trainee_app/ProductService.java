package com.example.trainee_app;

import java.util.HashMap;

public class ProductService {
    // Private collection — simulates database using HashMap
    private HashMap<Integer, Product> productMap = new HashMap<>();

    // Initialize sample data
    public ProductService() {
        loadSampleProducts();
    }

    // Load at least 3 sample products into the map
    private void loadSampleProducts() {
        productMap.put(1, new Product(1, "Laptop", 500));
        productMap.put(2, new Product(2, "Phone", 300));
        productMap.put(3, new Product(3, "Tablet", 200));
    }

    // Core DELETE logic — checks existence then removes safely
    public String deleteProductById(int productId) {

        // Check if product exists in the map
        if (!productMap.containsKey(productId)) {
            return "Product not found.\n"
                    + "No deletion performed.";
        }

        // Retrieve product name before removing
        Product product = productMap.get(productId);
        productMap.remove(productId);

        return "Product Deleted Successfully\n"
                + "Product ID   : " + product.getProductId() + "\n"
                + "Product Name : " + product.getProductName() + "\n"
                + "Status       : Removed from inventory";
    }
}