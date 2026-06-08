package com.example.trainee_app;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

public class Order {
    @RestController
    public class ProductController {

        // storage data using HashMap
        private HashMap<Integer, Product> productMap = new HashMap<>();
    }

}