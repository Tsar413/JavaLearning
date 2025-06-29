package com.company.javaRelearn;

public class DifferenceOfSums_20250527 {
    public int differenceOfSums(int n, int m) {
        int count = n / m;
        int sumM = (m + m * count) * count / 2;
        int sumN = (1 + n) * n / 2;
        return sumN - sumM - sumM;
    }
}
