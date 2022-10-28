package com.company.javaRelearn;

import java.util.Random;

public class MathOps_2021_3_13 {
    public static void main(String[] args) {
        Random rnd = new Random();
        double i ;
        int j = rnd.nextInt(100) + 1;
        int k = rnd.nextInt(100) + 1;
        System.out.println(" j = " + j + " k = " + k);
        i = j + k;
        System.out.println("j + k = " + i);
        i = j - k;
        System.out.println("j - k = " + i);
        i = j * k;
        System.out.println("j * k = " + i);
        i = j / k;
        System.out.println("j / k = " + i);
        i = j % k;
        System.out.println("j % k = " + i);
    }
}
