package com.company.javaRelearn;

import java.util.Arrays;
import java.util.List;

public class CountPairs_20250417 {
    public int countPairs(int[] nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j] && i * j % k == 0){
                    result++;
                }
            }
        }
        return result;
    }

    public static void test(){
        List<String> list = Arrays.asList("apple", "banana", "orange");
        long count = list.stream().filter(s -> s.startsWith("a")).count();
        System.out.println(count);
    }

    public static void main(String[] args) {
        test();
    }
}
