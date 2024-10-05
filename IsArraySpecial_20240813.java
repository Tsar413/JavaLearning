package com.company.javaRelearn;

import java.util.Arrays;

public class IsArraySpecial_20240813 {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int[] change = change(nums);
        int[] sumArray = new int[change.length];
        int sum = 0;
        for (int i = 0; i < sumArray.length; i++) {
            sum += change[i];
            sumArray[i] = sum;
        }
        boolean[] result = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            if(end - start == 0){
                result[i] = true;
            } else if(end - start == 1){
                if(start == 0){
                    if(sumArray[start] == 1){
                        result[i] = true;
                    } else {
                        result[i] = false;
                    }
                } else {
                    if(sumArray[start] - sumArray[start - 1] == 1){
                        result[i] = true;
                    } else {
                        result[i] = false;
                    }
                }
            } else {
                if(start == 0){
                    if(sumArray[end - 1] == end - start){
                        result[i] = true;
                    } else {
                        result[i] = false;
                    }
                } else {
                    if(sumArray[end - 1] - sumArray[start - 1] == end - start){
                        result[i] = true;
                    } else {
                        result[i] = false;
                    }
                }
            }
        }
        return result;
    }

    private int[] change(int[] nums){
        int[] result = new int[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            boolean flag1 = true;
            if(nums[i - 1] % 2 == 0){
                flag1 = false;
            }
            boolean flag2 = true;
            if(nums[i] % 2 == 0){
                flag2 = false;
            }
            if(flag1 != flag2){
                result[i - 1] = 1;
            } else {
                result[i - 1] = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,5};
        int[][] queries = new int[][]{{0,2}};
        System.out.println(Arrays.toString(new IsArraySpecial_20240813().isArraySpecial(nums, queries)));
    }
}
