package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinOperations_20250505 {
    public List<Long> minOperations(int[] nums, int[] queries) {
        Arrays.sort(nums);
        long[] sums = new long[nums.length];
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
        List<Long> list = new ArrayList<Long>();
        for (int i = 0; i < queries.length; i++) {
            int index = binarySearch(nums, queries[i]);
            if(index == -1){
                list.add(Math.abs(sum - (long) nums.length * queries[i]));
            } else {
                list.add((sum - sums[index] - (long) (nums.length - index - 1) * queries[i] + (long) (index + 1) * queries[i] - sums[index]));
            }
        }
        return list;
    }

    private int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = left + right >> 1;
            if(nums[mid] < target){
                left = mid;
            } else {
                right = mid;
            }
            if(right - left == 1 && nums[left] < target && target <= nums[right]){
                return right - 1;
            }
            if(right - left == 1 && nums[right] < target){
                return right;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5};
        int[] queries = {6};
        System.out.println(new MinOperations_20250505().minOperations(nums, queries));
    }
}
