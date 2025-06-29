package com.company.javaRelearn;

import java.util.HashMap;
import java.util.Map;

public class IsPossibleToRearrange_20250510 {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        int times = s.length() / k;
        for (int i = 0; i < s.length(); i += times) {
            String substring = s.substring(i, i + times);
            if(map.containsKey(substring)){
                int t1 = map.get(substring);
                t1++;
                map.put(substring, t1);
            } else {
                map.put(substring, 1);
            }
        }
        for (int i = 0; i < t.length(); i += times) {
            String substring = t.substring(i, i + times);
            if(!map.containsKey(substring)){
                return false;
            } else {
                int t1 = map.get(substring);
                if (t1 == 1){
                    map.remove(substring);
                } else {
                    t1--;
                    map.put(substring, t1);
                }
            }
        }
        return map.isEmpty();
    }
}
