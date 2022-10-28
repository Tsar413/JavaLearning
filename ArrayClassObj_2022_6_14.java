package com.company.javaRelearn;

import java.util.Random;

public class ArrayClassObj_2022_6_14 {
    public static void main(String[] args) {
        Random rnd = new Random(47);
        Integer[] a = new Integer[rnd.nextInt(20)];
        System.out.println(a.length);
        for(int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(500);
            System.out.println(a[i]);
        }
    }
}
