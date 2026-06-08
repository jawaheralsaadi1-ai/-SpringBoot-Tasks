package com.example.trainee_app;

public class UpdateEmailDemo {

    public static void main(String[] args) {

        //Declaring Variables
        String currentEmailAddress = "ahmed@example.com";
        String newEmailAddress = "ali@example.com";
        boolean isUpdated = false;


      //Display the original email before any update
        System.out.println("\n--- Original Email Data ---");
        System.out.println("Current Email Address: " + currentEmailAddress);
        System.out.println("New Email Address: " + newEmailAddress);
        System.out.println("---------------------------");

        // Compare two email address using -equalsIgnoreCase()-
        if(!currentEmailAddress.equalsIgnoreCase(newEmailAddress)) {
            isUpdated = true; // If emails different
        } else {
            isUpdated = false; // If emails the same


        }


    }
}