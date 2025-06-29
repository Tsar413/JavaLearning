package com.company.javaRelearn.UofGWeek4;

public class Lab2_1 {
    public static void main(String[] args) {
        int[][] twoDimensionalArray = new int[6][6];
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[0].length; j++) {
                if (i == j) {
                    twoDimensionalArray[i][j] = 1;
                } else if(i < j) {
                    twoDimensionalArray[i][j] = twoDimensionalArray[i][j-1] + 1;
                } else {
                    twoDimensionalArray[i][j] = 0;
                }
            }

        }
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[0].length; j++) {
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
