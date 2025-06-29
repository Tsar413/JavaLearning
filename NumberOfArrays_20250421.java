package com.company.javaRelearn;

public class NumberOfArrays_20250421 {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int num = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < differences.length; i++) {
            num += differences[i];
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        int result = upper - max - (lower - min) + 1;
        return Math.max(result, 0);
    }
}
