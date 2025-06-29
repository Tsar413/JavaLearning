package com.company.javaRelearn.UofGWeek7Exam;

public class Q2 {
    private int value;

    public Q2(int a) {
        value = a;
    }

    public void increment() {
        value += 1;
    }

    public int getNumber() {
        return value;
    }
    public static void main(String[] args) {
        Q2 a = new Q2(4);
//        System.out.println(a.getNumber());
        Q2 b = a;
        a.increment();
        b.increment();
        b = null;
        System.out.println(a.getNumber());
    }
}
