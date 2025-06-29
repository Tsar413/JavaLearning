package com.company.javaRelearn;

import java.util.Arrays;

public class MaximumTripletValue_20250402 {
    public long maximumTripletValue(int[] nums) {
        int[] maxRight = new int[nums.length];
        int max = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 2; i--) {
            if(max < nums[i]){
                max = nums[i];
            }
            maxRight[i] = max;
        }
        System.out.println(Arrays.toString(maxRight));
        int left = nums[0];
        int mid = nums[0];
        long result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(left < nums[i]){
                left = nums[i];
                mid = nums[i];
            }
            if(mid > nums[i]){
                mid = nums[i];
            }
            if(left >= mid){
                result = Math.max(result, (long) (left - mid) * maxRight[i + 1]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {12, 6, 1, 2, 7};
        int[] nums2 = {1, 10, 3, 4, 19};
        int[] nums3 = {2, 3, 1};
        int[] nums4 = {1000000,1,1000000};
        System.out.println(new MaximumTripletValue_20250402().maximumTripletValue(nums4));
    }
}
