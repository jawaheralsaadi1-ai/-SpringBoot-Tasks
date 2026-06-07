package com.example.trainee_app;



public class UpdateDemo {
    public static void main(String[] args) {

        //  Declaring variables
        String currentStudentName = "Ali";
        String newStudentName     = "Ali";
        String updateStatus;

        // Display original state before any update logic runs
        System.out.println("--- Original State ---");
        System.out.println("Current Student Name : " + currentStudentName);
        System.out.println("New Student Name     : " + newStudentName);
        System.out.println("----------------------");

        //  Compare names using .equals() (never == for Strings)
        if (!currentStudentName.equals(newStudentName)) {

            // Names differ → perform the update
            String previousName   = currentStudentName; // save before overwriting
            currentStudentName    = newStudentName;      // assign new value
            updateStatus          = "Successful";

            System.out.println("\nResult: Names are different. Update is performed.");
            System.out.println("Student name changed from \"" + previousName
                    + "\" to \"" + currentStudentName + "\".");

        } else {

            // Names are identical → skip the update
            updateStatus = "No Change Required";

            System.out.println("\nResult: Names are identical. No update is performed.");
            System.out.println("The student name remains \"" + currentStudentName + "\".");
        }

        // Steps 8-9: Always print final name and status AFTER the if-else block
        System.out.println("\n--- Final State ---");
        System.out.println("Student Name  : " + currentStudentName);
        System.out.println("Update Status : " + updateStatus);
        System.out.println("-------------------");
    }
}