package com.company.javaRelearn.UofG;

public class Lab3Ex1 {
    public static void printInLab3Ex1Version1() {
        System.out.println("Lab3Ex1V1");
    }

    public void printInLab3Ex1Version2() {
        System.out.println("Lab3Ex1V2");
    }

    public String printInLab3Ex1Version3() {
        System.out.println("Lab3Ex1V3");
        return null;
    }

    public String printInLab3Ex1Version4() {
        return "Lab3Ex1V4";
    }

    public static void main(String[] args) {
        String a = "Lab3Ex1";
        System.out.println(a);

        printInLab3Ex1Version1();
        new Lab3Ex1().printInLab3Ex1Version2();
        new Lab3Ex1().printInLab3Ex1Version3();
        Lab3Ex1 lab3Ex1 = new Lab3Ex1();
        String tempStorageForVersion4 = lab3Ex1.printInLab3Ex1Version4();
        System.out.println(tempStorageForVersion4);
    }
}
