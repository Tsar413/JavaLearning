package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxFrequency_20250206 {
    public int maxFrequency(int[] nums, int k) {
        int max = -1;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != k){
                if(map.containsKey(nums[i])){
                    int t = map.get(nums[i]);
                    t++;
                    map.put(nums[i], t);
                } else {
                    map.put(nums[i], 1);
                }
            } else {
                count++;
                if(map.isEmpty()){
                    max = Math.max(max, 0);
                } else {
                    int temp = -1;
                    for (int n : map.values()){
                        temp = Math.max(temp, n);
                    }
                    max = Math.max(max, temp);
                }
                map.clear();
            }
        }
        int temp = -1;
        for (int n : map.values()){
            temp = Math.max(temp, n);
        }
        max = Math.max(max, temp);
        return max + count;
    }

    public static void main(String[] args) {
        int[] nums = {10, 2, 3, 4, 5, 5, 4, 3, 2, 2};
        System.out.println(new MaxFrequency_20250206().maxFrequency(nums, 10));
    }
}
