package com.example.trainee_app.service;

import com.example.trainee_app.entities.Vehicle;
import com.example.trainee_app.controller.VehicleManager;

public class AddVehicleService {
    public static void main(String[] args) {
        VehicleManager manager1 = new VehicleManager();

// Display existing vehicles before POST operation
        System.out.println("\n--- Existing Vehicles ---");
        manager1.displayVehicles();
        System.out.println("-------------------------");

        // New vehicle to add
        Vehicle newVehicle1 = new Vehicle("V104", "Kia Sportage", 30);
        System.out.println("\nNew Vehicle : "
                + newVehicle1.getVehicleId()
                + " → " + newVehicle1.getVehicleModel()
                + " → " + newVehicle1.getRentalPricePerDay() + " OMR/day");

    // Perform POST operation via manager
        System.out.println("\n" + manager1.addVehicle(newVehicle1));

        // Display updated vehicle list after POST operation
        System.out.println("\n--- Updated Vehicle List ---");
        manager1.displayVehicles();
        System.out.println("----------------------------");


    }
}
