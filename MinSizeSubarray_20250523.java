package com.company.javaRelearn;

import java.util.Arrays;

public class MinSizeSubarray_20250523 {
    public int minSizeSubarray(int[] nums, int target) {
        int[] data = new int[nums.length * 2];
        int index = 0;
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            if(index == nums.length){
                index = 0;
            }
            data[i] = nums[index];
            sum += nums[index];
            index++;
        }
        sum /= 2;
        int result = (target / sum) * nums.length;
        target %= sum;
        int temp = 0;
        int index1 = 0;
        int index2 = 0;
        int diff = data.length;
        while (index1 < data.length){
            if(temp < target){
                temp += data[index1];
                index1++;
            } else if(temp == target){
                diff = Math.min(diff, index1 - index2);
                temp += data[index1];
                index1++;
            } else {
                temp -= data[index2];
                index2++;
            }
        }
        if(diff == data.length){
            return -1;
        }
        return diff + result;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,5,7,7,1,6,3};
        System.out.println(new MinSizeSubarray_20250523().minSizeSubarray(nums, 39));
    }
}
