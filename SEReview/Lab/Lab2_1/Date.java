package com.company.javaRelearn.SEReview.Lab.Lab2_1;

import java.io.PrintStream;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {}

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void print(PrintStream ps) {
        ps.print(String.format("%02d/%02d/%4d", getDay(), getMonth(), getYear()));
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int diffInYears(Date date) {
        return Math.abs(date.getYear() - this.getYear());
    }
}
