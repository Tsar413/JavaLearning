package com.company.javaRelearn.UofGWeek5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab11_12 {
    public static void main(String[] args) {
        boolean flag = false;
        int num1 = 0;
        while (!flag) {
            Scanner scanner = new Scanner(System.in);
            String line1 = scanner.nextLine();
            System.out.println(line1);
            Scanner scanner1 = new Scanner(line1);

            try {
                num1 = scanner1.nextInt();
                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("Input again");
            }
        }
        System.out.println(num1);
    }
}
