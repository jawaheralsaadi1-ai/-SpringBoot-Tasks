package com.example.trainee_app.repository;

import com.example.trainee_app.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {


    // Custom query: find student by name
    boolean existsByStudentNameIgnoreCase(String studentName);
}
