package com.example.trainee_app;



    public class Student {

        //  Declaring variables
        private int    studentId;
        private String studentName;
        private String grade;

        //  Constructor
        public Student(int studentId, String studentName, String grade) {
            this.studentId   = studentId;
            this.studentName = studentName;
            this.grade       = grade;
        }

        // Getter methods — allow safe read access from outside the class
        public int getStudentId() {
            return studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public String getGrade() {
            return grade;
        }

        //  Setter methods — allow controlled update access (PUT-style)
        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }
        public void setStudentId(int studentId) {

        }
    }

