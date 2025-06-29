package com.company.javaRelearn;

public class CountSubarrays_20250428 {
    public long countSubarrays(int[] nums, long k) {
        long result = 0;
        int left = 0;
        int right = 0;
        long sum = 0;
        while (left < nums.length) {
            sum += nums[left];
            while (sum * (left - right + 1) >= k) {
                sum -= nums[right];
                right++;
            }
            result += (left - right + 1);
            left++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 3, 5};
        System.out.println(new CountSubarrays_20250428().countSubarrays(nums, 10));
    }
}
