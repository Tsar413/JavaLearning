package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountWays_20240904 {
    public int countWays(List<Integer> nums) {
        Collections.sort(nums);
        int result = 0;
        if(nums.get(0) > 0){
            result = 1;
        }
        int n = nums.size();
        for (int i = 1; i < n; i++) {
            if (nums.get(i - 1) < i && nums.get(i) > i){
                result++;
            }
        }
        return result + 1;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6, 0, 3, 3, 6, 7, 2, 7);
        System.out.println(new CountWays_20240904().countWays(list));
    }
}
