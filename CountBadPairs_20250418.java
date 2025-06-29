package com.company.javaRelearn;

import java.util.HashMap;
import java.util.Map;

public class CountBadPairs_20250418 {
    public long countBadPairs(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] -= i;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : nums){
            if(map.containsKey(n)){
                int t = map.get(n);
                t++;
                map.put(n, t);
            } else {
                map.put(n, 1);
            }
        }
        long storage = 0;
        for (Integer value : map.values()) {
            if(value > 1){
                storage += (long) value * (value - 1) / 2;
            }
        }
        return (long) nums.length * (nums.length - 1) / 2 - storage;
    }
}
