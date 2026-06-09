package com.example.trainee_app.entities;

public class LibraryMember {
    // Declaring Variables
    private String memberId;
    private String fullName;
    private String membersshipType;

// constructor to initialize all fields.
    public LibraryMember(String memberId, String fullName, String membersshipType) {
        this.memberId = memberId;
        this.fullName = fullName;
        this.membersshipType = membersshipType;
    }
    // Getter methods - safe read access from outside the class
    public String getMemberId() {
        return memberId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getMembersshipType() {
        return membersshipType;
    }
}
