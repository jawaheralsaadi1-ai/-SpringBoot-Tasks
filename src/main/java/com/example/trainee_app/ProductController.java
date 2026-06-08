package com.example.trainee_app;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ProductController {
    // Store product data using HashMap
    private HashMap<Integer, Product> productMap = new HashMap<>();

}
