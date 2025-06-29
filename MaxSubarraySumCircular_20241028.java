package com.company.javaRelearn;

public class MaxSubarraySumCircular_20241028 {
    public int maxSubarraySumCircular(int[] nums) {
        int result = Integer.MIN_VALUE;
        int index = 0;
        while (index < nums.length){
            int count = 0;
            int index1 = index;
            int sum = 0;
            while (count < nums.length){
                sum += nums[index1];
                index1++;
                if(index1 == nums.length){
                    index1 = 0;
                }
                count++;
                result = Math.max(result, sum);
            }

            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -2};
        System.out.println(new MaxSubarraySumCircular_20241028().maxSubarraySumCircular(nums));
    }
}
