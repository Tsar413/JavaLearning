package com.company.javaRelearn;

public class FindClosestNumber_20250120 {
    public int findClosestNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(Math.abs(nums[i]) < Math.abs(result)){
                result = nums[i];
            }
            if(Math.abs(nums[i]) == Math.abs(result)){
                if(nums[i] > result){
                    result = nums[i];
                }
            }
        }
        return result;
    }
}
