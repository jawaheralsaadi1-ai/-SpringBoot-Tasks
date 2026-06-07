package com.example.trainee_app;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    //  Create a sample Student object — represents existing stored data
    private Student student = new Student(101, "Ahmed", "A");
}