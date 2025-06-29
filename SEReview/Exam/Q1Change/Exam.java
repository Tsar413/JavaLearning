package com.company.javaRelearn.SEReview.Exam.Q1Change;

import java.util.ArrayList;

public class Exam {
//    public String name; // Content Coupling
    private String name;

//    public ArrayList<ExamScript> submissions; // Content Coupling
    private ArrayList<ExamScript> submissions;

    // Date of exam //Data Coupling
//    public int day;
//    public int month;
//    public int year;
    private Date examDate;

    public Exam(String name) {
        this.name = name;
        submissions = new ArrayList();
    }

//    public Exam(String name, int day, int month, int year) {
//        this.name = name;
//        this.day = day;
//        this.month = month;
//        this.year = year;
//    }

    public Exam(String name, Date examDate) {
        this.name = name;
        this.examDate = examDate;
        submissions = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ExamScript> getSubmissions() {
        return submissions;
    }
}
