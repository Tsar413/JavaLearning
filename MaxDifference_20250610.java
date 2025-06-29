package com.company.javaRelearn;

import java.util.HashMap;
import java.util.Map;

public class MaxDifference_20250610 {
    public int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            if(map.containsKey(c)){
                int t = map.get(c);
                t++;
                map.put(c, t);
            } else {
                map.put(c, 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer value : map.values()) {
            if(value % 2 == 1){
                max = Math.max(max, value);
            } else {
                min = Math.min(min, value);
            }
        }
        return max - min;
    }
}
