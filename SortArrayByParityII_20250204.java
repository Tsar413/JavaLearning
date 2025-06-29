package com.company.javaRelearn;

import java.util.Arrays;

public class SortArrayByParityII_20250204 {
    public int[] sortArrayByParityII(int[] nums) {
        int[] odd = new int[nums.length / 2];
        int[] even = new int[nums.length / 2];
        int index1 = 0;
        int index2 = 0;
        for (int n : nums){
            if(n % 2 == 0){
                even[index2] = n;
                index2++;
            } else {
                odd[index1] = n;
                index1++;
            }
        }
        index1 = 0;
        index2 = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            if(i % 2 == 0){
                result[i] = even[index2];
                index2++;
            } else {
                result[i] = odd[index1];
                index1++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        System.out.println(Arrays.toString(new SortArrayByParityII_20250204().sortArrayByParityII(nums)));
    }
}
