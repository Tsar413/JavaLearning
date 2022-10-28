package com.company.javaRelearn;

import java.util.Random;

public class Bool_2021_3_16 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int i = rnd.nextInt(100) + 1;
        int j = rnd.nextInt(100) + 1;
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println(" i > j " + ( i > j));
        System.out.println(" i < j " + ( i < j));
        System.out.println(" i >= j " + ( i >= j));
        System.out.println(" i <= j " + ( i <= j));
        System.out.println(" i == j " + ( i == j));
        System.out.println(" i != j " + ( i != j));
        System.out.println(" (i < 10) && (j < 10) " + ((i < 10) && (j < 10)));
        System.out.println(" (i < 10) || (j < 10) " + ((i < 10) || (j < 10)));
    }
}
