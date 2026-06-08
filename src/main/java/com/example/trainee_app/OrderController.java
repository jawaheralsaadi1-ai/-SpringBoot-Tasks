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

        // Check if order exists in the HashMap
        if (!orderMap.containsKey(orderId)) {
            return "Order not found.";
        }

        // Retrieve order and save previous values before update
        Order  order           = orderMap.get(orderId);
        String previousAddress = order.getShippingAddress();
        String previousStatus  = order.getOrderStatus();

        // Update both fields using setter methods
        order.setShippingAddress(address);
        order.setOrderStatus(status);

        return "Order Updated Successfully\n"
                + "Order ID                 : " + order.getOrderId()         + "\n"
                + "Previous Shipping Address: " + previousAddress            + "\n"
                + "Updated Shipping Address : " + order.getShippingAddress() + "\n"
                + "Previous Order Status    : " + previousStatus             + "\n"
                + "Updated Order Status     : " + order.getOrderStatus();
    }
}
