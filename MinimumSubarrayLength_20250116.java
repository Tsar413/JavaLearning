package com.company.javaRelearn;

import java.util.Arrays;

public class MinimumSubarrayLength_20250116 {
    public int minimumSubarrayLength(int[] nums, int k) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= k){
                return 1;
            }
            int temp = nums[i];
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {
                temp |= nums[j];
                count++;
                if(temp >= k){
                    result = Math.min(result, count);
                    break;
                }
            }
        }
        if(result == Integer.MAX_VALUE){
            return -1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {32,2,24,1};
        System.out.println(new MinimumSubarrayLength_20250116().minimumSubarrayLength(nums, 35));
    }
}
