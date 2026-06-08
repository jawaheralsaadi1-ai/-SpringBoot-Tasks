package com.example.trainee_app;

public class UserProfile {

    //Declaring variables
    // private - to enforce encapsulation and prevent direct modification.
    private int userID;
    private String phoneNumber;
    private String address;

    // Constructor to initialize all fields
    public UserProfile(int userID, String phoneNumber, String address) {
        this.userID = userID;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

}
