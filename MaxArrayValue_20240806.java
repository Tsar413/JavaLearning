package com.company.javaRelearn;

public class MaxArrayValue_20240806 {
    public long maxArrayValue(int[] nums) {
        long result = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 1 ; i--) {
            if(result >= nums[i - 1]){
                result += nums[i - 1];
            } else {
                result = nums[i - 1];
            }
        }
        return result;
    }
}
