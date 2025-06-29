package com.company.javaRelearn.UofG;

import java.util.Calendar;

public class Lab4Ex4 {
    public static String age(String str) {
        Calendar cal = Calendar.getInstance();
        int a = Integer.parseInt((str.subSequence(0, 4).toString())); // 输入的年
        int b = cal.get(Calendar.YEAR); // 当前的年
        if (a <= b) {
            return "Age: " + (b - a) + " years old";
        } else {
            return "Error";
        }
    }

    public static void main(String[] args) {
        String date = "19991117";
        System.out.println(age(date));
    }
}
