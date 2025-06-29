package com.company.javaRelearn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestPalindrome_20250525 {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word : words){
            if(map.containsKey(word)){
                int t = map.get(word);
                t++;
                map.put(word, t);
            } else {
                map.put(word, 1);
            }
        }
        Set<String> afterCal = new HashSet<String>();
        boolean flag = true;
        int result = 0;
        for (String s : map.keySet()) {
            if(s.charAt(0) != s.charAt(1)){
                String target = String.valueOf(s.charAt(1)) + String.valueOf(s.charAt(0));
                if(map.containsKey(target) && !afterCal.contains(target)){
                    result += Math.min(map.get(s), map.get(target)) * 4;
                    afterCal.add(s);
                    afterCal.add(target);
                }
            } else {
                int num = map.get(s);
                if(num % 2 == 0){
                    result += num * 2;
                } else {
                    if(flag){
                        result += num * 2;
                        flag = false;
                    } else {
                        result += (num - 1) * 2;
                    }
                }
            }
        }
        return result;
    }
}
