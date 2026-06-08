package com.example.trainee_app;

public class UpdateEmailDemo {

    public static void main(String[] args) {

        //Declaring Variables
        String currentEmailAddress = "Ahmed@example.com";
        String newEmailAddress = "ahmed@example.com";
        boolean isUpdated = false;


      //Display the original email before any update
        System.out.println("\n--- Original Email Data ---");
        System.out.println("Current Email Address: " + currentEmailAddress);
        System.out.println("New Email Address: " + newEmailAddress);
        System.out.println("---------------------------");

        // Compare two email address using -equalsIgnoreCase()-
        if(!currentEmailAddress.equalsIgnoreCase(newEmailAddress)) {
            isUpdated = true; // if the email are different
            System.out.println("---  Update is required---");
            System.out.println("Original Email: " + currentEmailAddress);
            System.out.println("Email updated successfully.");
            System.out.println("Update Email: " + newEmailAddress);
            System.out.println("Update Status " + isUpdated);


        } else {
            isUpdated = false;// If the email are same
            System.out.println("---No update is required---");
            System.out.println("Original Email: " + currentEmailAddress);
            System.out.println("No update required. Email address is already current.");
            System.out.println("Update Email: " + newEmailAddress);
            System.out.println("Update Status " + isUpdated);


        }


    }
}