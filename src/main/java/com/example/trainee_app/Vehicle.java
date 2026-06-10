package com.example.trainee_app;

public class Vehicle {

    private String vehicleId;
    private String vehicleModel;
    private int rentalPricePerDay;

    // Constructor - Initialize all fields when object is created
    public Vehicle(String vehicleId, String vehicleModel, int rentalPricePerDay) {
        this.vehicleId = vehicleId;
        this.vehicleModel = vehicleModel;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    //Getter methods — safe read access from outside the class

    public String getVehicleId() {
        return vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public int getRentalPricePerDay() {
        return rentalPricePerDay;
    }
}
