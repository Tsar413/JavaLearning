package com.company.javaRelearn;

import java.util.Arrays;

public class MinCost_20250123 {
    public long minCost(int[] arr, int[] brr, long k) {
        long result1 = 0;
        long result2 = k;
        for (int i = 0; i < arr.length; i++) {
            result1 += Math.abs(arr[i] - brr[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        for (int i = 0; i < arr.length; i++) {
            result2 += Math.abs(arr[i] - brr[i]);
        }
        return Math.min(result1, result2);
    }
}
