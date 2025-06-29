package com.company.javaRelearn.SoftwareEngineeringLab.Lab0;

public class Printer {
    public void print(int numberA, int numberB, int numberC, boolean
            allNumbersSet) {
        System.out.println("Number A: " + numberA);
        System.out.println("Number B: " + numberB);
        System.out.println("Number C: " + numberC);
        System.out.println("All numbers set? " + allNumbersSet);
    }

    public void print(DataCoupling dataCoupling) {
        System.out.println("Number A: " + dataCoupling.numberA);
        System.out.println("Number B: " + dataCoupling.numberB);
        System.out.println("Number C: " + dataCoupling.numberC);
        System.out.println("All numbers set? " + dataCoupling.allNumbersSet);
    }

    public void printA(int numberA) {
        System.out.println("Number A: " + numberA);
    }

    public void printB(int numberB) {
        System.out.println("Number B: " + numberB);
    }

    public void printC(int numberC) {
        System.out.println("Number C: " + numberC);
    }

    public void printAllNumberSet(boolean allNumbersSet) {
        System.out.println("All numbers set? " + allNumbersSet);
    }
}
