package com.company.javaRelearn.UofGWeek5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Lab22 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\xiaol\\Java test\\test1\\src\\com\\company\\javaRelearn\\UofGWeek5\\Sum.txt");
        FileInputStream fileInputStream = null;
        fileInputStream = new FileInputStream(file);
        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNext()) {
            String temp = scanner.nextLine();
            String[] temps = temp.split(" ");
            Integer num1 = Integer.parseInt(temps[0]);
            Integer num2 = Integer.parseInt(temps[2]);
            int result1 = num1 + num2;
            int result2 = num1 - num2;
            if (temps[1].equals("+")) {
                System.out.println(temp + " = " + result1);
            } else {
                System.out.println(temp + " = " + result2);
            }
        }
        fileInputStream.close();
    }
}
