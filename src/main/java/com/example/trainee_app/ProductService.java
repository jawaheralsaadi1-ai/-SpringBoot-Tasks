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
            productMap.put(2, new Product(2, "Phone",  300));
            productMap.put(3, new Product(3, "Tablet", 200));
    }
}
