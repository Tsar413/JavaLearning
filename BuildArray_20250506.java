package com.company.javaRelearn;

import java.util.Random;

public class BuildArray_20250506 {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(100));
    }
}
