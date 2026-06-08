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
            isUpdated = true; // if the email are different
            System.out.println("Original Email: " + currentEmailAddress);
            System.out.println("\nEmail updated successfully.");
            System.out.println("\nUpdate Email: " + newEmailAddress);
            System.out.println("\nUpdate Status " + isUpdated);


        } else {
            isUpdated = false;// If the email are same
            System.out.println("Original Email: " + currentEmailAddress);
            System.out.println("\nNo update required. Email address is already current.");
            System.out.println("\nUpdate Email: " + newEmailAddress);
            System.out.println("\nUpdate Status " + isUpdated);


        }


    }
}