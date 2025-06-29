package com.company.javaRelearn.UofGWeek7Exam;

public class Q3 {
    public static void main(String[] args) {
        int[] a = {3, 5, 2, 1};
        int temp = a[2];
        a[2] = a[1];
        int temp2 = a[3];
        a[3] = temp;
        a[1] = temp2;

        for (int x : a) {
            System.out.println(x);
        }
    }
}
