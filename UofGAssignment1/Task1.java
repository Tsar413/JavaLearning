package com.company.javaRelearn.UofGAssignment1;

import java.util.Scanner;

public class Task1 {
    public static void task1() {
        double length = 0; //Initialized length with data type double
        double width = 0; //Initialized width with data type double

        System.out.println("Task1: Calculating the rectangular area");

        //Calling the Scanner function
        Scanner scanner = new Scanner(System.in);
        //Input length
        System.out.println("Input the length here. ");
        length = scanner.nextDouble();
        //Preventing line breaks from corrupting input
        scanner.nextLine();
        //Input width
        System.out.println("Input the width here. ");
        width = scanner.nextDouble();

        //Output final number
        System.out.println("The area of the rectangle is " +
                length * width);
    }

    public static void main(String[] args) {
        //My name is Yinlong Li and my GUID is 2754249L
        task1();
    }
}
