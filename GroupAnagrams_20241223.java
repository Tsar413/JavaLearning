package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_20241223 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<Map<Character, Integer>> listMap = new ArrayList<Map<Character, Integer>>();
        List<List<String>> result = new ArrayList<List<String>>();
        for (String s : strs){
            char[] chars = s.toCharArray();
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            for (char c : chars){
                if(map.containsKey(c)){
                    int t = map.get(c);
                    t++;
                    map.put(c, t);
                } else {
                    map.put(c, 1);
                }
            }
            if(listMap.isEmpty()){
                listMap.add(map);
                List<String> list = new ArrayList<String>();
                list.add(s);
                result.add(list);
            } else {
                boolean flag = true;
                for (int i = 0; i < listMap.size(); i++) {
                    if (listMap.get(i).equals(map)) {
                        result.get(i).add(s);
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    listMap.add(map);
                    List<String> list = new ArrayList<String>();
                    list.add(s);
                    result.add(list);
                }
            }
        }
        return result;
    }
}
