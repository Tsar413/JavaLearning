package com.company.javaRelearn.UofGQuiz2;

public class Test4 {
    public static <T> String arrayPoint(T[] a) {
        String temp = "";
        for (int i = 0; i < a.length; i++) {
            temp += a[i].toString();
        }
        return temp;
    }

    public static void main(String[] args) {
        Integer[] a = {3,4};
        String[] b = {"ILove","Java"};
        System.out.print(arrayPoint(a));
        System.out.print(arrayPoint(b));
    }
}
