package com.example.trainee_app;

import java.util.ArrayList;

public class LibraryManager {

    //Declaring a private collection
    private ArrayList<LibraryMember> members = new ArrayList<>();

    // Initialize collection with sample members
    public void initializeMembers() {
        members.add(new LibraryMember("M101", "Ahmed", "Standard"));
        members.add(new LibraryMember("M102", "Sara", "Premium"));
        members.add(new LibraryMember("M103", "John", "Standard"));
    }

    // Add a new member to the collection
    public void addMember(LibraryMember member) {
        members.add(member);
    }
    // Display all members in the collection
    public void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("  No members found.");
            return;
        }
        for (LibraryMember member : members) {
            System.out.println("  - " + member.getMemberId()
                    + " → " + member.getFullName()
                    + " → " + member.getMembersshipType());
        }
    }
}