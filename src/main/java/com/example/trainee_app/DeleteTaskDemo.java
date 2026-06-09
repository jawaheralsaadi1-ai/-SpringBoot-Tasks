package com.example.trainee_app;

import java.util.ArrayList;

public class DeleteTaskDemo {
    public static void main(String[] args) {

    // Initialize task list with sample data
    ArrayList<String> tasks1 = new ArrayList<>();
                    tasks1.add("Buy groceries");
                    tasks1.add("Call doctor");
                    tasks1.add("Finish report");

        // Display initial task list before deletion
        System.out.println("\n--- Initial Task List ---");
        for (String task : tasks1) {
            System.out.println("  - " + task);
        }

    }
}