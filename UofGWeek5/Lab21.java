package com.company.javaRelearn.UofGWeek5;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Lab21 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\xiaol\\Java test\\test1\\src\\com\\company\\javaRelearn\\UofGWeek5\\dolphin.txt");
        FileInputStream in = null;
        try {
            in = new FileInputStream(file);
            Scanner scanner = new Scanner(in);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
