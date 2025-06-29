package com.company.javaRelearn;

public class SumOfBeauties_20250311 {
    public int sumOfBeauties(int[] nums) {
        int[] bigArray = new int[nums.length];
        int[] smallArray = new int[nums.length];
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            bigArray[i] = max;
            max = Math.max(max, nums[i]);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            smallArray[i] = min;
            min = Math.min(min, nums[i]);
        }
        int result = 0;
        for (int i = 1; i <= nums.length - 2; i++) {
            if(nums[i] > bigArray[i] && nums[i] < smallArray[i]){
                result += 2;
            } else if(nums[i] > nums[i - 1] && nums[i] < nums[i + 1]){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(new SumOfBeauties_20250311().sumOfBeauties(nums));
    }
}
