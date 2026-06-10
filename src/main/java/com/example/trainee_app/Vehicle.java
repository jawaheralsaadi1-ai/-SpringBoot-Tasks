package com.example.trainee_app;

public class Vehicle {

    private int vehicleId;
    private String vehicleModel;
    private String rentalPricePerDay;

    // Constructor - Initialize all fields when object is created
    public Vehicle(int vehicleId, String vehicleModel, String rentalPricePerDay) {
        this.vehicleId = vehicleId;
        this.vehicleModel = vehicleModel;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    //Getter methods — safe read access from outside the class

    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public String getRentalPricePerDay() {
        return rentalPricePerDay;
    }
}
