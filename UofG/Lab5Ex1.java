package com.company.javaRelearn.UofG;

import java.util.Scanner;

public class Lab5Ex1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your name, followed by the return key.");
        String userEntry = keyboard.nextLine();
        System.out.println("Hello " + userEntry);
        System.out.println("Please enter your age");
        int userAge = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("You are " + userAge + " years old");
        System.out.println("What is your favourite colour?");
        String col = keyboard.nextLine();
    }
}
