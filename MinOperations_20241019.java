package com.company.javaRelearn;

public class MinOperations_20241019 {
    public int minOperations(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                result++;
                for (int j = i; j < nums.length; j++) {
                    if(nums[j] == 0){
                        nums[j] = 1;
                    } else {
                        nums[j] = 0;
                    }
                }
            }
        }
        return result;
    }
}
