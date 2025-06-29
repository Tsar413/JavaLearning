package com.company.javaRelearn.UofG;

public class Lab4Ex2 {
    public static boolean judgeLeapYear(int year) {
        if(year % 4 == 0 && year / 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2022;
        if(judgeLeapYear(year)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
