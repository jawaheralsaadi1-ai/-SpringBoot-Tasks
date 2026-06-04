package com.example.trainee_app;


public class Book {


        private int id;
        private String name;
        private String authorId;// New field

        //  constructorg
        public Book(int id, String name, String authorId) {
            this.id = id;
            this.name = name;
            this.authorId = authorId;// Updated
        }

        // Getter &  Setter
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }
}
