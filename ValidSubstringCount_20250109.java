package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidSubstringCount_20250109 {
    public long validSubstringCount(String word1, String word2) {
        int index1 = 0;
        int index2 = 0;
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (int i = 0; i < word2.length(); i++) {
            if(map2.containsKey(word2.charAt(i))){
                int t = map2.get(word2.charAt(i));
                t++;
                map2.put(word2.charAt(i), t);
            } else {
                map2.put(word2.charAt(i), 1);
            }
        }
        long result = 0;
        while (index1 < word1.length()){
            if(!map1.containsKey(word1.charAt(index1))){
                map1.put(word1.charAt(index1), 1);
            } else {
                int t = map1.get(word1.charAt(index1));
                t++;
                map1.put(word1.charAt(index1), t);
            }
            index1++;
            if(check(map1, map2)){
                result++;
                Map<Character, Integer> map3 = new HashMap<Character, Integer>(map1);
                while (index2 < index1){
                    int t = map3.get(word1.charAt(index2));
                    t--;
                    map3.put(word1.charAt(index2), t);
                    if(!check(map3, map2)){
                        break;
                    } else {
                        int t1 = map1.get(word1.charAt(index2));
                        t1--;
                        map1.put(word1.charAt(index2), t1);
                        index2++;
                    }
                }
                result += index2;
            }
        }
        return result;
    }

    private boolean check(Map<Character, Integer> map1, Map<Character, Integer> map2){
        List<Character> list = new ArrayList<>(map2.keySet());
        for (char c : list){
            if(map1.containsKey(c)){
                if(map1.get(c) < map2.get(c)){
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidSubstringCount_20250109().validSubstringCount("abcabc", "abc"));
    }
}
