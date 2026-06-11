package com.example.trainee_app.service;

import com.example.trainee_app.entities.Student;

public class UpdateDemoOOP {

    public static void main(String[] args) {

        // Create a Student object with initial values
        Student student = new Student(101, "Ahmed", "A");

        //Display original student details using getters
        System.out.println("--- Original Student Data ---");
        System.out.println("Student ID   : " + student.getStudentId());
        System.out.println("Student Name : " + student.getStudentName());
        System.out.println("Grade        : " + student.getGrade());
        System.out.println("-----------------------------");

        // Perform update — save old value, apply new value via setter
        String previousName = student.getStudentName();
        student.setStudentName("Ali");

        System.out.println("\nUpdate Performed:");
        System.out.println("Student name changed from \""
                + previousName + "\" to \""
                + student.getStudentName() + "\".");

        //  Display updated student details
        System.out.println("\n--- Updated Student Data ---");
        System.out.println("Student ID   : " + student.getStudentId());
        System.out.println("Student Name : " + student.getStudentName());
        System.out.println("Grade        : " + student.getGrade());
        System.out.println("----------------------------");

        //  Verify — unchanged fields stay the same
        System.out.println("\nVerification:");
        System.out.println("Student ID is unchanged : " + student.getStudentId());
        System.out.println("Grade is unchanged      : " + student.getGrade());
        System.out.println("Name was updated        : " + student.getStudentName());

    // Result
     System.out.println("\nResult");
    System.out.println("Only the student name is updated.\n"+
    "Student ID and grade remain unchanged.\n"+
   "The update is performed through a setter method \n" +
            "rather than direct field access.");
}
}