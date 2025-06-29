package com.company.javaRelearn.UofGWeek7Exam;

public class Q10 {
    public static void main(String[] args) {
        for (int i = 2; i < 15; i *= 2) {
            for (int j = 2; j < i - 2; j++) {
                System.out.print(i);
            }
            System.out.print(i - 1);
        }
    }
}
