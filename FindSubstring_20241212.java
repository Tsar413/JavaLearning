package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSubstring_20241212 {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        for (String w : words){
            if(map1.containsKey(w)){
                int t = map1.get(w);
                t++;
                map1.put(w, t);
            } else {
                map1.put(w, 1);
            }
            for (int i = 0; i < w.length(); i++) {
                if(map.containsKey(String.valueOf(w.charAt(i)))){
                    int t = map.get(String.valueOf(w.charAt(i)));
                    t++;
                    map.put(String.valueOf(w.charAt(i)), t);
                } else {
                    map.put(String.valueOf(w.charAt(i)), 1);
                }
            }
        }
        int size = words.length * words[0].length();
        int index1 = 0;
        int index2 = 0;
        Map<String, Integer> subString = new HashMap<String, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        while (index1 < s.length()) {
            if (index1 - index2 + 1 <= size) {
                if (subString.containsKey(String.valueOf(s.charAt(index1)))) {
                    int t = subString.get(String.valueOf(s.charAt(index1)));
                    t++;
                    subString.put(String.valueOf(s.charAt(index1)), t);
                } else {
                    subString.put(String.valueOf(s.charAt(index1)), 1);
                }
                index1++;
            } else {
                if (judge(s.substring(index2, index1), map1, words[0].length(), map, subString)) {
                    list.add(index2);
                }
//                if (index1 == s.length() - 1) {
//                    break;
//                }
                if (subString.containsKey(String.valueOf(s.charAt(index1)))) {
                    int t = subString.get(String.valueOf(s.charAt(index1)));
                    t++;
                    subString.put(String.valueOf(s.charAt(index1)), t);
                } else {
                    subString.put(String.valueOf(s.charAt(index1)), 1);
                }
                int t = subString.get(String.valueOf(s.charAt(index2)));
                t--;
                if (t == 0) {
                    subString.remove(String.valueOf(s.charAt(index2)));
                } else {
                    subString.put(String.valueOf(s.charAt(index2)), t);
                }
                index1++;
                index2++;
            }
        }
        if (judge(s.substring(index2, index1), map1, words[0].length(), map, subString)) {
            list.add(index2);
        }
        return list;
    }

    private boolean judge(String subString, Map<String, Integer> words, int size, Map<String, Integer> map1, Map<String, Integer> map2){
        for (Map.Entry<String, Integer> entry : map1.entrySet()){
            String key1 = entry.getKey();
            Integer value1 = map1.get(key1);
            if(!map2.containsKey(key1)){
                return false;
            } else {
                if(!map2.get(key1).equals(value1)){
                    return false;
                }
            }
        }
        Map<String, Integer> words1 = new HashMap<String, Integer>(words);
        for (int i = 0; i < subString.length(); i += size) {
            String s1 = subString.substring(i, i + size);
            if(!words1.containsKey(s1)){
                return false;
            } else {
                if(words1.get(s1) <= 0){
                    return false;
                } else {
                    int t = words1.get(s1);
                    t--;
                    words1.put(s1, t);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"ab","ba","ba"};
        System.out.println(new FindSubstring_20241212().findSubstring("ababaab", words));
    }
}
