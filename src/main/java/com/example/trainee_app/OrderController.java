package com.example.trainee_app;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class OrderController {
    //  storage a  database using HashMap
    private HashMap<Integer, Order> orderMap = new HashMap<>();

    // Preload sample data
    public OrderController() {
        orderMap.put(101, new Order(101, "Muscat", "Pending"));
        orderMap.put(102, new Order(102, "Sohar", "Pending"));
        orderMap.put(103, new Order(103, "Salalah", "Shipped"));
    }
    // PUT endpoint — updates fields
    @PutMapping("/updateOrder/{orderId}")
    public String updateOrder(@PathVariable int orderId,
                              @RequestParam String address,
                              @RequestParam String status) {

        return address;
    }
}
