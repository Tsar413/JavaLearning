package com.company.javaRelearn.SEReview.Lab.Lab3_2;

import java.io.PrintStream;

public class Date {
    private int day, month, year;

    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    //public Date	clone()	{ return new Date(day, month, year);}

    public void setDay(int d) {
        day = d;
    }

    public void setMonth(int m) {
        month = m;
    }

    public void setYear(int y) {
        year = y;
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

    public void print(PrintStream ps) {
        ps.print(String.format("%02d/%02d/%04d", day, month, year));
    }

    public int diffInYears(Date date) {
        Date date1 = this;
        Date date2 = date;

        if (date.getYear() - this.getYear() < 0) {
            date1 = date;
            date2 = this;
        }

        int date_month = date2.getMonth();
        int date_year = date2.getYear();

        // If difference between "day" values of two dates is negative
        // reduce "date_month" by 1
        if (date2.getDay() - date1.getDay() < 0)
            date_month--;


        // If difference between "month" values of two dates is negative
        // reduce "date_year"by 1
        if (date_month - date1.getMonth() < 0)
            date_year--;


        return (date_year - date1.getYear());
    }
}
