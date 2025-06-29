package com.company.javaRelearn.UofG;

import java.util.Scanner;

public class Lab5Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
        Scanner t = new Scanner(s);
        String firstName = t.next();
        String secondName = t.next();
        System.out.println(firstName + " " + secondName);
//        String fullName = t.findInLine();
//        System.out.println(fullName);
        int age = t.nextInt();
        System.out.println(age);
    }
}
