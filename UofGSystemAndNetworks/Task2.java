package com.company.javaRelearn.UofGSystemAndNetworks;

public class Task2 {
    public static void main(String[] args) {
        int[] x = new int[7];
        int[] y = new int[7];

        x = new int[]{1, 4, 2, 4, 7, 6, 8};
        y = new int[]{8, 3, 1, 0, 6, 9, 9};

        for (int i = 0; i < 7; i++) {
            if (x[i] < y[i]) {
                x[i] = y[i];
            }
        }
    }
}
