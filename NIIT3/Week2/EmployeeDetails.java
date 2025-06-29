package com.company.javaRelearn.NIIT3.Week2;

import java.util.Scanner;

public class EmployeeDetails {
    public Integer employeeDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------Menu---------");
        System.out.println("1. Enter Data");
        System.out.println("2. Update Data");
        System.out.println("3. Display Data");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("Choose the option:");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println(new EmployeeDetails().employeeDetails());
    }
}
