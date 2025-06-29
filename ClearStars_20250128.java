package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClearStars_20250128 {
    public String clearStars(String s) {
        char[] data = s.toCharArray();
        Map<Character, List<Integer>> map = new TreeMap<Character, List<Integer>>();
        for (int i = 0; i < data.length; i++) {
            if(data[i] != '*'){
                if(!map.containsKey(data[i])){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(i);
                    map.put(data[i], list);
                } else {
                    List<Integer> temp = map.get(data[i]);
                    temp.add(i);
                    map.put(data[i], temp);
                }
            } else {
                data[i] = '-';
                char a = new ArrayList<Character>(map.keySet()).get(0);
                List<Integer> list = map.get(a);
                int index = list.get(list.size() - 1);
                data[index] = '-';
                list.remove(list.size() - 1);
                if(list.isEmpty()){
                    map.remove(a);
                } else {
                    map.put(a, list);
                }
            }
        }
        String result = "";
        for (int i = 0; i < data.length; i++) {
            if(data[i] != '-'){
                result += data[i];
            }
        }
        return result;
    }
}
