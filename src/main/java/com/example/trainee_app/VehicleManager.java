package com.example.trainee_app;

import java.util.ArrayList;


//--This class will manage all vehicle-related operations--
public class VehicleManager {


    //  Create a Vehicle Collection
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    // Initialize collection with sample vehicles
    public VehicleManager() {
        vehicles.add(new Vehicle("V101", "Toyota Corolla",   20));
        vehicles.add(new Vehicle("V102", "Nissan Sunny",     18));
        vehicles.add(new Vehicle("V103", "Hyundai Elantra",  22));
    }

}