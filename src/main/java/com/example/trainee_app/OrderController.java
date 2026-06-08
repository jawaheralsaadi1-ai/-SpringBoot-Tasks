package com.example.trainee_app;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class OrderController {
    //  storage a  database using HashMap
    private HashMap<Integer, Order> orderMap = new HashMap<>();

}
