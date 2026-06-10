package com.example.trainee_app;

public class Vehicle {

    private int vehicleId;
    private String vehicleModel;
    private String rentalPricePerDay;

    // Constructor - Initialize all fields.
    public Vehicle(int vehicleId, String vehicleModel, String rentalPricePerDay) {
        this.vehicleId = vehicleId;
        this.vehicleModel = vehicleModel;
        this.rentalPricePerDay = rentalPricePerDay;
    }
}
