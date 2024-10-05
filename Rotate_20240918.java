package com.company.javaRelearn;

public class Rotate_20240918 {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        int[] temp = new int[length - k];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = nums[i];
        }
        int index = 0;
        for (int i = temp.length; i < nums.length; i++) {
            nums[index] = nums[i];
            index++;
        }
        for (int i = 0; i < temp.length; i++) {
            nums[index] = temp[i];
            index++;
        }
    }
}
