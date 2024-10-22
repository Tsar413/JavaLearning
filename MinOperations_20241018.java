package com.company.javaRelearn;

public class MinOperations_20241018 {
    public int minOperations(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i] == 0){
                nums[i] = 1;
                if(nums[i + 1] == 0){
                    nums[i + 1] = 1;
                } else if(nums[i + 1] == 1){
                    nums[i + 1] = 0;
                }
                if(nums[i + 2] == 0){
                    nums[i + 2] = 1;
                } else if(nums[i + 2] == 1){
                    nums[i + 2] = 0;
                }
                result++;
            }
        }
        if(nums[nums.length - 1] == 0 || nums[nums.length - 2] == 0){
            return -1;
        }
        return result;
    }
}
