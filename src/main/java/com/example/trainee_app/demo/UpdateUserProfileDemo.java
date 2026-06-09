package com.example.trainee_app.demo;

import com.example.trainee_app.entities.UserProfile;

public class UpdateUserProfileDemo {
    public static void main(String[] args) {

        //Create object &  initialize it with sample data using the constructor
        UserProfile profile1 = new UserProfile(1001, "0712345678", "Muscat, Oman");

        //Display  original data using getter methods
        System.out.println("\n--- Initial User Profile ---");
        System.out.println("User ID      : " + profile1.getUserID());
        System.out.println("Phone Number : " + profile1.getPhoneNumber());
        System.out.println("Address      : " + profile1.getAddress());
        System.out.println("----------------------------");

        // Save old values before update
        String oldPhone1 = profile1.getPhoneNumber();
        String oldAddress1 = profile1.getAddress();

       // Perform update via setter methods
        profile1.setPhoneNumber("0798765432");
        profile1.setAddress("Ruwi, Muscat");

        //Display updated Data
        System.out.println("\nUpdate Operation:");
        System.out.println("Phone Number changed from \"" + oldPhone1   + "\" to \"" + profile1.getPhoneNumber() + "\".");
        System.out.println("Address changed from \""      + oldAddress1 + "\" to \"" + profile1.getAddress()     + "\".");

        //Display Verification
        System.out.println("\nVerification:");
        System.out.println("User ID      : " + profile1.getUserID());
        System.out.println("Phone Number : " + profile1.getPhoneNumber());
        System.out.println("Address      : " + profile1.getAddress());
    }
}