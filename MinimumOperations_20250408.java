package com.company.javaRelearn;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MinimumOperations_20250408 {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if(!set.add(nums[i])){
                return (i + 1) % 3 == 0 ? (i + 1) / 3 : (i + 1) / 3 + 1;
            }
        }
        return 0;
    }

    public static void getRandom(int num){
        Random random = new Random();
        System.out.println(random.nextInt(num));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            getRandom(20);
        }
    }
}
