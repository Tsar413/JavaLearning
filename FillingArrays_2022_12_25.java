package com.company.javaRelearn;

import java.util.Arrays;

public class FillingArrays_2022_12_25 {
    public static void main(String[] args) {
        int size = 5;
        boolean[] a1 = new boolean[size];
        int[] b1 = new int[size];
        Arrays.fill(a1,true);
        System.out.println(Arrays.toString(a1));
        Arrays.fill(b1,1);
        System.out.println(Arrays.toString(b1));
    }
}
