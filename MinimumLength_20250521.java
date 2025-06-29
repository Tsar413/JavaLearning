package com.company.javaRelearn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumLength_20250521 {
    public int minimumLength(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()){
            if(map.containsKey(c)){
                int t = map.get(c);
                t++;
                map.put(c, t);
            } else {
                map.put(c, 1);
            }
        }
        int result = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 == 1){
                result++;
            } else {
                result += 2;
            }
        }
        return result;
    }
}
