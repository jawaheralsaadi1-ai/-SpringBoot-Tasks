package com.example.trainee_app.service;

import com.example.trainee_app.entities.Student;
import com.example.trainee_app.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // CREATE
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    // READ ALL
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // READ BY ID
    public Optional<Student> getStudentById(int id) {
        return studentRepository.findById(id);
    }

    // UPDATE
    public Student updateStudent(int id, Student updatedStudent) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
        student.setStudentName(updatedStudent.getStudentName());
        student.setGrade(updatedStudent.getGrade());
        return studentRepository.save(student);
    }

    // DELETE
    public void deleteStudent(int id) {
        if (!studentRepository.existsById(id)) {
            throw new RuntimeException("Student not found with id: " + id);
        }
        studentRepository.deleteById(id);
    }
}