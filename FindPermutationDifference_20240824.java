package com.company.javaRelearn;

import java.util.HashMap;
import java.util.Map;

public class FindPermutationDifference_20240824 {
    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        int result = 0;
        for (int i = 0; i < t.length(); i++) {
            result += Math.abs(map.get(t.charAt(i)) - i);
        }
        return result;
    }
}
