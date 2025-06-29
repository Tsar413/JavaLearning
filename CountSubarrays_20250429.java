package com.company.javaRelearn;

public class CountSubarrays_20250429 {
    public long countSubarrays(int[] nums, int k) {
        int length = nums.length;
        int max = 0;
        for (int n : nums){
            max = Math.max(max, n);
        }
        int right = 0;
        int left1 = 0;
        int left2 = 0;
        int count = 0;
        long result = 0;
        while (right < length){
            if(nums[right] == max){
                count++;
            }
            while (count == k){
                if(nums[left1] == max){
                    count--;
                }
                left1++;
            }
            result += (long) (length - right) * (left1 - left2);
            right++;
            left2 = left1;
        }
        return result;
    }
}
