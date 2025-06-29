package com.company.javaRelearn;

import java.util.Arrays;

public class DivideArray_20250618 {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result = new int[nums.length / 3][3];
        int index = 0;
        for (int i = 0; i < nums.length; i += 3) {
            if(nums[i + 1] - nums[i] <= k && nums[i + 2] - nums[i + 1] <= k && nums[i + 2] - nums[i] <= k){
                result[index][0] = nums[i];
                result[index][1] = nums[i + 1];
                result[index][2] = nums[i + 2];
                index++;
            } else {
                return new int[nums.length / 3][];
            }
        }
        return result;
    }
}
