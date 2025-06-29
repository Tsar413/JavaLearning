package com.company.javaRelearn.UofGWeek7Exam;

public class Q11 {
    public static void main(String[] args) {
        int d = 1;
        int e = method1(d);
        System.out.println(e);
    }

    public static int method1(int a) {
        return method2(a) * (2 / 3 + 1);
    }

    public static int method2(int a) {
        return a %= a;
    }
}
