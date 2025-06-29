package com.company.javaRelearn;

import java.util.Arrays;

public class KnightProbability_20241207 {
    public double knightProbability(int n, int k, int row, int column) {
        int[][] data = new int[1][2];
        data = recursiveCore(new int[1][2], row, column, n, k);
        return data[0][0] * 1.0 / Math.pow(8, k);
    }

    private int[][] recursiveCore(int[][] data, int x, int y, int n, int k){
        if(k == 0){
            if(x < 0 || y < 0 || x >= n || y >= n){
                data[0][1] += 1;
                return data;
            } else {
                data[0][0] += 1;
                data[0][1] += 1;
                return data;
            }
        }
        if(x < 0 || y < 0 || x >= n || y >= n) {
            data[0][1] += 1;
            return data;
        }
            int[][] temp1 = recursiveCore(new int[1][2], x - 2, y - 1, n, k - 1);
            data[0][0] += temp1[0][0];
            data[0][1] += temp1[0][1];
            int[][] temp2 = recursiveCore(new int[1][2], x - 1, y - 2, n, k - 1);
            data[0][0] += temp2[0][0];
            data[0][1] += temp2[0][1];
            int[][] temp3 = recursiveCore(new int[1][2], x + 1, y - 2, n, k - 1);
            data[0][0] += temp3[0][0];
            data[0][1] += temp3[0][1];
            int[][] temp4 = recursiveCore(new int[1][2], x + 2, y - 1, n, k - 1);
            data[0][0] += temp4[0][0];
            data[0][1] += temp4[0][1];
            int[][] temp5 = recursiveCore(new int[1][2], x + 2, y + 1, n, k - 1);
            data[0][0] += temp5[0][0];
            data[0][1] += temp5[0][1];
            int[][] temp6 = recursiveCore(new int[1][2], x + 1, y + 2, n, k - 1);
            data[0][0] += temp6[0][0];
            data[0][1] += temp6[0][1];
            int[][] temp7 = recursiveCore(new int[1][2], x - 1, y + 2, n, k - 1);
            data[0][0] += temp7[0][0];
            data[0][1] += temp7[0][1];
            int[][] temp8 = recursiveCore(new int[1][2], x - 2, y + 1, n, k - 1);
            data[0][0] += temp8[0][0];
            data[0][1] += temp8[0][1];
            return data;

    }

    public static void main(String[] args) {
        System.out.println(new KnightProbability_20241207().knightProbability(3,2,0,0));
    }
}
