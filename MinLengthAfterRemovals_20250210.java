package com.company.javaRelearn;

import java.util.*;

public class MinLengthAfterRemovals_20250210 {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int max = 0;
        int count = 1;
        for (int i = 1; i < nums.size(); i++) {
            if(nums.get(i).equals(nums.get(i - 1))){
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);
        if(max * 2 > nums.size()){
            return max * 2 - nums.size();
        } else {
            if(nums.size() % 2 == 0){
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,1,2,2,3,3);
        System.out.println(new MinLengthAfterRemovals_20250210().minLengthAfterRemovals(nums));
    }
}
