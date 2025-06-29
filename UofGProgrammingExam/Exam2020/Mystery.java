package com.company.javaRelearn.UofGProgrammingExam.Exam2020;

public class Mystery {
    public static int c = 0;

    public static void main(String[] args) {
        Double[] a = {8.9, 1.0, -3.0, 7.0, 4.0};
        System.out.println(go(a, 0, a.length));
    }

    public static <T extends Comparable> T go(T[] a, int le, int ri) {
        c += 1;
        if (ri - le <= 1) {
            return a[le];
        } else {
            int cp = le + (ri - le) / 2;
            T m1 = go(a, le, cp);
            T m2 = go(a, cp, ri);
            if (m1.compareTo(m2) > 0) {
                return m1;
            } else {
                return m2;
            }
        }
    }
}
