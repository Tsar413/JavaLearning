package com.company.javaRelearn;

import java.util.*;

public class MinimumPushes_20250208 {
    public int minimumPushes(String word) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < word.length(); i++) {
            if(map.containsKey(word.charAt(i))){
                int t = map.get(word.charAt(i));
                t++;
                map.put(word.charAt(i), t);
            } else {
                map.put(word.charAt(i), 1);
            }
        }
        List<Integer> list = new ArrayList<Integer>(map.values());
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            int mul = i / 8 + 1;
            result += list.get(i) * mul;
        }
        return result;
    }
}
