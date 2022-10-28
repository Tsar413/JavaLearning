package com.company.javaRelearn;

import java.util.Random;

public class RandomNavigation {
    public static void main(String[] args) {
        Random rnd = new Random();
        for(int i = 0; i < 100; i++) {
            int []a = new int[100];
            int j = rnd.nextInt(100);
            a[i] = j;
            System.out.println(a[i]);
        }
    }
}
