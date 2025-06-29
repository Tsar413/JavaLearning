package com.company.javaRelearn.SEReview.Exam.Q1Change;

public class Student {
    private int guid;
//    public boolean hasExtraTime; // Content Coupling
    private boolean hasExtraTime;

    public Student(int guid) {
        this.guid = guid;
    }

    public void setExtraTime() {
        hasExtraTime = true;
    }

}
