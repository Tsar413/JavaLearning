package com.company.javaRelearn.UofG;

import java.util.Calendar;
import java.util.Scanner;

public class Lab5Ex4 {
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input DoB");
        Integer day = scanner.nextInt();
        Integer month = scanner.nextInt();
        Integer year = scanner.nextInt();
        if(day < 10 || month < 10) {
            String date =  year.toString() + "0" + month.toString() + "0" + day.toString();
            System.out.println(age(date));
        } else {
            String date = year.toString() + month.toString() + day.toString();
            System.out.println(age(date));
        }

    }
}
