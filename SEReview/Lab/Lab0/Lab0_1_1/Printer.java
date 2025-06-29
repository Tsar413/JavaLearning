package com.company.javaRelearn.SEReview.Lab.Lab0.Lab0_1_1;

public class Printer {
    public void print(int numberA, int numberB, int numberC, boolean
            allNumbersSet) {
        System.out.println("Number A: " + numberA);
        System.out.println("Number B: " + numberB);
        System.out.println("Number C: " + numberC);
        System.out.println("All numbers set? " + allNumbersSet);
    }

    public void print(StoreData storeData) {
        System.out.println("Number A: " + storeData.getNumberA());
        System.out.println("Number B: " + storeData.getNumberB());
        System.out.println("Number C: " + storeData.getNumberC());
        System.out.println("All numbers set? " + storeData.isAllNumbersSet());
    }
}
