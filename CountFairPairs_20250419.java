package com.company.javaRelearn;

import java.util.Arrays;

public class CountFairPairs_20250419 {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long result = 0;
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = 0;
            left = binarySearch(nums, i, lower - nums[i]);
            right = binarySearch(nums, i, upper - nums[i] + 1);
            result += right - left;
        }
        return result;
    }

    private int binarySearch(int[] nums, int right, int target){
        int left = -1;
        while (left + 1 < right){
            int mid = left + right >> 1;
            if(nums[mid] < target){
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 7, 4, 4, 5};
        System.out.println(new CountFairPairs_20250419().countFairPairs(nums, 3, 6));
    }
}
