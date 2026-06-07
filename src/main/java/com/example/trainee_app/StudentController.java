package com.example.trainee_app;


import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    //  Create Student object
    private Student student = new Student(101, "Ahmed", "A");

    //  PUT endpoint at /update-student
    @PutMapping("/updateStudent")
    public void updateStudent(@RequestParam String name) {

        // Retrieve current value before update
        String previousName = student.getStudentName();

    }
}
