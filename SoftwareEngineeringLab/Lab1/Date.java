package com.company.javaRelearn.SoftwareEngineeringLab.Lab1;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {
    private int day;
    private int month;
    private int year;

    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

    public Date() {}

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void print(PrintStream ps)	{
        ps.print(String.format("%02d/%02d/%4d", getDay(), getMonth(), getYear()));
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int diffInYears(Date date) throws ParseException {
        String s1 = this.getDay() + "-" + this.getMonth() + "-" + this.getYear();
        String s2 = date.getDay() + "-" + date.getMonth() + "-" + date.getYear();
        java.util.Date date1 = format.parse(s1);
        java.util.Date date2 = format.parse(s2);
        System.out.println(date1.getTime());
        System.out.println(date2.getTime());
        long difms = Math.abs(date1.getTime() - date2.getTime());
        long result = difms/1000/3600/24/365;
        return (int)result;
    }

}
