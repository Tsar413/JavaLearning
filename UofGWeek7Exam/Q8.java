package com.company.javaRelearn.UofGWeek7Exam;

public class Q8 {
    public static void main(String[] args) {
        int a = 6;
        int b = a;
        int c = b;
        int d = c;
        a++;
        System.out.println(c + d);
        System.out.println(b);
    }
}
