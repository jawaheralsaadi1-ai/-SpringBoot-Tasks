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
//Implement getter methods
// used so values can be safely accessed from outside the class:
    public int getUserID() {
        return userID;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    //Implement setter methods
    // used for fields that should be updated:

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
