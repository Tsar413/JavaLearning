package com.company.javaRelearn;

import java.util.HashMap;
import java.util.Map;

public class NumRabbits_20250420 {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : answers){
            if(map.containsKey(n)){
                int t = map.get(n);
                t++;
                map.put(n, t);
            } else {
                map.put(n, 1);
            }
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey() + 1;
            int value = entry.getValue();
            if(value % key == 0){
                result += value;
            } else {
                result += (value / key + 1) * key;
            }
        }
        return result;
    }
}
