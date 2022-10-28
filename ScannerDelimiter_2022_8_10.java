package com.company.javaRelearn;

import java.util.Scanner;

public class ScannerDelimiter_2022_8_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*, \\s*");
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
    }
}
