package com.company.javaRelearn;

import java.util.Arrays;

public class MinimumAverage_20241016 {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        double result = Double.MAX_VALUE;
        while (left < right){
            double temp = (nums[left] * 1.0 + nums[right]) / 2;
            result = Math.min(result, temp);
            left++;
            right--;
        }
        return result;
    }
}
