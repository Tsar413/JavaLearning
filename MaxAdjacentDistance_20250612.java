package com.company.javaRelearn;

public class MaxAdjacentDistance_20250612 {
    public int maxAdjacentDistance(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int t = 0;
            if(i == 0){
                t = nums[0] - nums[nums.length - 1];
            } else {
                t = nums[i] - nums[i - 1];
            }
            t = Math.abs(t);
            result = Math.max(result, t);
        }
        return result;
    }
}
