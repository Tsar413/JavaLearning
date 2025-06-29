package com.company.javaRelearn.SEReview.Exam.Q1;

import java.util.ArrayList;

public class Exam {
    public String name;
    public ArrayList<ExamScript> submissions;

    // Date of exam
    public int day;
    public int month;
    public int year;

    public Exam(String name) {
        this.name = name;
        submissions = new ArrayList();
    }

    public Exam(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public ArrayList<ExamScript> getSubmissions() {
        return submissions;
    }
}
