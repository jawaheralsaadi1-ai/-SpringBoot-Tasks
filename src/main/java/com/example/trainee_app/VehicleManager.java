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

    //  Create addVehicle method ,
    public String addVehicle(Vehicle vehicle) {

        // Check if vehicle ID already exists
        for (Vehicle v : vehicles) {
            if (v.getVehicleId().equalsIgnoreCase(vehicle.getVehicleId())) {
                return "Vehicle ID already exists.\n"
                        + "No vehicle was added.";
            }
        }

        // No duplicate found — add vehicle to collection
        vehicles.add(vehicle);

        return "Vehicle Added Successfully.\n"
                + "Vehicle ID          : " + vehicle.getVehicleId()         + "\n"
                + "Vehicle Model       : " + vehicle.getVehicleModel()       + "\n"
                + "Rental Price Per Day: " + vehicle.getRentalPricePerDay()  + " OMR\n"
                + "Status              : Created";
    }

        // Display all available vehicles in the collection
        public void displayVehicles() {
            if (vehicles.isEmpty()) {
                System.out.println("  No vehicles found.");
                return;
            }
            for (Vehicle vehicle : vehicles) {
                System.out.println("  - " + vehicle.getVehicleId()
                        + " → " + vehicle.getVehicleModel()
                        + " → "  + vehicle.getRentalPricePerDay() + " OMR/day");
            }
        }
    }

