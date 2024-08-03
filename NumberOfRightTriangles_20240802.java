package com.company.javaRelearn;

public class NumberOfRightTriangles_20240802 {
    public long numberOfRightTriangles(int[][] grid) {
        int[] columnNum = new int[grid[0].length];
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                columnNum[j] += ints[j];
            }
        }
        long result = 0;
        for (int[] ints : grid) {
            int rowNum = -1;
            for (int j = 0; j < grid[0].length; j++) {
                rowNum += ints[j];
            }
            for (int j = 0; j < grid[0].length; j++) {
                if (ints[j] == 1) {
                    result += rowNum * (columnNum[j] - 1);
                }
            }
        }
        return result;
    }
}
