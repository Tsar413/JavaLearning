package com.company.javaRelearn.UofG;

public class Lab6Ex2 {
    public static void calculatePrimeNumbers(int max) {
        for(int i = 2; i <= max; i++) {
            int flag = 0;
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        calculatePrimeNumbers(20);
    }
}
