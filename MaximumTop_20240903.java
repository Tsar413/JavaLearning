package com.company.javaRelearn;

import java.util.Arrays;

public class MaximumTop_20240903 {
    public int maximumTop(int[] nums, int k) {
        if(k == 1){
            return -1;
        }
        if(k < nums.length){
            int result = 0;
            for (int i = 0; i < (k + 1); i++) {
                result = Math.max(result, nums[i]);
            }
            return result;
        } else {
            if(k % 2 == 0){
                Arrays.sort(nums);
                return nums[nums.length - 2];
            } else {
                int result = 0;
                for (int i = 0; i < nums.length; i++) {
                    result = Math.max(result, nums[i]);
                }
                return result;
            }
        }
    }
}
