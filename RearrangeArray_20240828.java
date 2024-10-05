package com.company.javaRelearn;

import java.util.Arrays;

public class RearrangeArray_20240828 {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i++) {
            if((nums[i - 1] + nums[i + 1]) / 2 == nums[i]){
                int t = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = t;
            }
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if((nums[i - 1] + nums[i + 1]) / 2 == nums[i]){
                int t = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = t;
            }
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if((nums[i - 1] + nums[i + 1]) / 2 == nums[i]){
                int t = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = t;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,2,6,3,7,4,8};
        System.out.println(Arrays.toString(new RearrangeArray_20240828().rearrangeArray(nums)));
    }
}
