package com.example.trainee_app;

public class UpdateUserProfileDemo {
    public static void main(String[] args) {

        //Create object &  initialize it with sample data using the constructor
        UserProfile profile1 = new UserProfile(1001, "+968 00000", "Muscat, Oman");

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
        profile1.setPhoneNumber("+968 11111");
        profile1.setAddress("Ruwi, Muscat");

    }
}