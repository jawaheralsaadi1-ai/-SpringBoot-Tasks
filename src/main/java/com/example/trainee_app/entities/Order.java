package com.example.trainee_app.entities;

public class Order {

    //Declaring Variables
    private int orderId;
    private String shippingAddress;
    private String orderStatus;

    //Constructor
    public Order(int orderId, String shippingAddress, String orderStatus) {
        this.orderId = orderId;
        this.shippingAddress = shippingAddress;
        this.orderStatus = orderStatus;
    }
    // Getter methods — safe read access from outside the class
    public int getOrderId() {
        return orderId;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

   // Setter methods — controlled update access
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}