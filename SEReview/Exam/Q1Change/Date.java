package com.company.javaRelearn.SEReview.Exam.Q1Change;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Time{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
