package com.company.javaRelearn.UofGProgrammingExam.Exam2021;

public class Note {
    protected String message;

    public Note() { }
    public Note(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
