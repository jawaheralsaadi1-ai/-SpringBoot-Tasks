package com.example.trainee_app.service;

import com.example.trainee_app.controller.LibraryManager;

public class DeleteMemberService {
    public static void main(String[] args) {

        LibraryManager manager1 = new LibraryManager();
        manager1.initializeMembers();

        System.out.println("\n--- Initial Member List ---");
        manager1.displayMembers();
        System.out.println("---------------------------");

        String targetId1 = "M102";
        System.out.println("\nTarget Member ID : " + targetId1);

         boolean isDeleted1 = manager1.deleteMemberById(targetId1);

        if (isDeleted1) {
            System.out.println("Member \"" + targetId1 + "\" deleted successfully.");
        } else {
            System.out.println("Member not found. No deletion performed.");
        }

        System.out.println("\n--- Updated Member List ---");
        manager1.displayMembers();
        System.out.println("---------------------------");



    }

    }
