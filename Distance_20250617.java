package com.company.javaRelearn;

import java.util.*;

public class Distance_20250617 {
    public long[] distance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map.put(nums[i], list);
            }
        }

        long[] result = new long[nums.length];
        for (List<Integer> value : map.values()) {
            long[] sums = new long[value.size()];
            long sum = 0;
            for (int i = 0; i < sums.length; i++) {
                sum += value.get(i);
                sums[i] = sum;
            }

            for (int i = 0; i < sums.length; i++) {
                if(i == 0){
                    result[value.get(i)] = sum - sums[i] - (value.size() - i - 1) * sums[i];
                } else {
                    result[value.get(i)] = sum - (value.size() - i - 1) * sums[i];
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,1,1,2};
        System.out.println(Arrays.toString(new Distance_20250617().distance(nums)));
    }

}
