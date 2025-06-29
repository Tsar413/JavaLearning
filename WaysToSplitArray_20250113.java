package com.company.javaRelearn;

public class WaysToSplitArray_20250113 {
    public int waysToSplitArray(int[] nums) {
        long[] sums = new long[nums.length];
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
        int result = 0;
        for (int i = 0; i < sums.length - 1; i++) {
            if(sum - sums[i] <= sums[i]){
                result++;
            }
        }
        return result;
    }
}
