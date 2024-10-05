package com.company.javaRelearn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxNumOfMarkedIndices_20240910 {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int[] data = new int[nums.length];
        for (int i = 0; i < data.length; i++) {
            if(nums[i] % 2 == 0){
                data[i] = nums[i] / 2;
            } else {
                data[i] = (nums[i] - 1) / 2;
            }
        }
        Set<Integer> set = new HashSet<Integer>();
        if(nums[0] > data[data.length - 1]){
            return 0;
        }
        for (int i = data.length - 1; i >= 0; i--) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right){
                int mid = left + right >> 1;
                if(data[i] <= nums[mid]){
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            if(!set.contains(nums[i]) && !set.contains(nums[left])){
                set.add(nums[i]);
                set.add(nums[left]);
            }

        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] nums = {7,6,8};
        System.out.println(new MaxNumOfMarkedIndices_20240910().maxNumOfMarkedIndices(nums));
    }
}
