package com.company.javaRelearn;

import java.util.Arrays;

public class ProductExceptSelf_20240913 {
    public int[] productExceptSelf(int[] nums) {
        int[] temp1 = new int[nums.length - 1];
        int[] temp2 = new int[nums.length - 1];
        int mul1 = 1;
        int mul2 = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            mul1 *= nums[i];
            temp1[i] = mul1;
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            mul2 *= nums[i + 1];
            temp2[i] = mul2;
        }
        System.out.println(Arrays.toString(temp1));
        System.out.println(Arrays.toString(temp2));
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i == 0){
                result[i] = temp2[i];
            } else if(i == nums.length - 1){
                result[i] = temp1[i - 1];
            } else{
                result[i] = temp1[i - 1] * temp2[i];
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(new ProductExceptSelf_20240913().productExceptSelf(nums)));
    }
}

