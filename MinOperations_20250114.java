package com.company.javaRelearn;

import java.util.Arrays;

public class MinOperations_20250114 {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0;
        for (int n : nums){
            if(n < k){
                result++;
            } else {
                return result;
            }
        }
        return result;
    }
}
