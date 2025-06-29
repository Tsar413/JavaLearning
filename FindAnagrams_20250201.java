package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagrams_20250201 {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        for (int i = 0; i < p.length(); i++) {
            if(map1.containsKey(p.charAt(i))){
                int t = map1.get(p.charAt(i));
                t++;
                map1.put(p.charAt(i), t);
            } else {
                map1.put(p.charAt(i), 1);
            }
        }
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        int index1 = 0;
        int index2 = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (index1 < s.length()){
            if(map2.containsKey(s.charAt(index1))){
                int t = map2.get(s.charAt(index1));
                t++;
                map2.put(s.charAt(index1), t);
            } else {
                map2.put(s.charAt(index1), 1);
            }
            if(index1 - index2 + 1 > p.length()){
                int t = map2.get(s.charAt(index2));
                t--;
                if(t == 0){
                    map2.remove(s.charAt(index2));
                } else {
                    map2.put(s.charAt(index2), t);
                }
                index2++;
            }
            index1++;
            if(map1.equals(map2)){
                list.add(index2);
            }
        }
        return list;
    }
}
