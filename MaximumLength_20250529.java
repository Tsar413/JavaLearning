package com.company.javaRelearn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumLength_20250529 {
    public int maximumLength(int[] nums) {
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
        int max = 1;
        for (Integer i : map.keySet()) {
            int count = 0;
            if(i == 1){
                if(map.get(i) % 2 == 0){
                    count = map.get(i) - 1;
                } else {
                    count = map.get(i);
                }
                max = Math.max(max, count);
            } else {
                if(map.get(i) >= 2){
                    int target = i * i;
                    count += 2;
                    while (map.containsKey(target) && map.get(target) >= 2){
                        target = target * target;
                        count += 2;
                    }
                    if(map.containsKey(target) && map.get(target) == 1){
                        count++;
                        max = Math.max(max, count);
                    }
                    if(!map.containsKey(target)){
                        count--;
                        max = Math.max(max, count);
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1};
        System.out.println(new MaximumLength_20250529().maximumLength(nums));
    }
}
