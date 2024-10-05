package com.company.javaRelearn;

public class DifferenceOfSum_20240926 {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int n : nums){
            sum1 += n;
            sum2 += calPerPosition(n);
        }
        return Math.abs(sum1 - sum2);
    }

    private int calPerPosition(int num){
        String numString = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < numString.length(); i++) {
            sum += numString.charAt(i) - '0';
        }
        return sum;
    }
}
