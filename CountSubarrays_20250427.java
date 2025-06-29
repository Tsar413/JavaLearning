package com.company.javaRelearn;

public class CountSubarrays_20250427 {
    public int countSubarrays(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i] * 1.0 + nums[i + 2] * 1.0 == nums[i + 1] * 1.0 / 2){
                result++;
            }
        }
        return result;
    }
}
