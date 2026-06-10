package com.example.trainee_app;

import java.util.ArrayList;

public class AddEmployeeDemo {
    public static void main(String[] args) {

//
        // Initialize employee list with sample data
        ArrayList<String[]> employees1 = new ArrayList<>();//Create  collection to store employee records.
        employees1.add(new String[]{"E101", "Sara", "HR"});
        employees1.add(new String[]{"E102", "Ahmed", "Finance"});
        employees1.add(new String[]{"E103", "John", "Marketing"});

// Display existing employees before POST operation
        System.out.println("\n--- Existing Employees ---");
        for (String[] emp : employees1) {
            System.out.println("  - " + emp[0] + " → " + emp[1] + " → " + emp[2]);
        }
        System.out.println("--------------------------");

        // New employee data to add
        String[] newEmployee1 = {"E104", "Ali", "IT"};
        System.out.println("\nNew Employee : "
                + newEmployee1[0] + " → "
                + newEmployee1[1] + " → "
                + newEmployee1[2]);



    }
}