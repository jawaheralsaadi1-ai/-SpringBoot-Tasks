package com.example.trainee_app;

public class UpdateDemoOOP {

    public static void main(String[] args) {
// Create a Student object with initial values
        Student student = new Student(101, "Ahmed", "A");

        //Display original student details using getters
        System.out.println("--- Initial Student Data ---");
        System.out.println("Student ID   : " + student.getStudentId());
        System.out.println("Student Name : " + student.getStudentName());
        System.out.println("Grade        : " + student.getGrade());
        System.out.println("-----------------------------");


    }
}