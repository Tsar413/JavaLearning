package com.company.javaRelearn;

import java.util.HashSet;
import java.util.Set;

public class MinimizedStringLength_20250328 {
    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }
}
