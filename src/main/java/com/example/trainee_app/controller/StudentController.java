package com.example.trainee_app.controller;


import com.example.trainee_app.entities.Student;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    //  Create Student object
    private Student student = new Student(101, "Ahmed", "A");

    //  PUT endpoint at /update-student
    @PutMapping("/updateStudent")
    public String updateStudent(@RequestParam String name) {

        // Retrieve current value before update
        String previousName = student.getStudentName();


        // Update the field using setter method
        student.setStudentName(name);

        // Return confirmation response
        return "Student name updated successfully.\n"
                + "Previous Name : " + previousName + "\n"
                + "New Name      : " + student.getStudentName();
    }
}


