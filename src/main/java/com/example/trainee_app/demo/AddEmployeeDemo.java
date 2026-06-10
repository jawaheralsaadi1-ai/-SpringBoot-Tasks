package com.example.trainee_app.demo;

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

        // Validation — check if employee ID already exists
        boolean isDuplicate1 = false;
        for (String[] emp : employees1) {
            if (emp[0].equalsIgnoreCase(newEmployee1[0])) {
                isDuplicate1 = true;

            }
        }

        // Perform POST operation if no duplicate found
        if (!isDuplicate1) {
            employees1.add(newEmployee1);
            System.out.println("\nEmployee Added Successfully.");
            System.out.println("Employee ID   : " + newEmployee1[0]);
            System.out.println("Employee Name : " + newEmployee1[1]);
            System.out.println("Department    : " + newEmployee1[2]);
            System.out.println("Status        : Created");
        } else {
            System.out.println("\nEmployee ID already exists.");
            System.out.println("No employee was created.");
        }

        // Display updated employee list after POST operation
        System.out.println("\n--- Final Employee List ---");
        for (String[] emp : employees1) {
            System.out.println("  - " + emp[0] + " → " + emp[1] + " → " + emp[2]);
        }
        System.out.println("-----------------------------");
    }
}