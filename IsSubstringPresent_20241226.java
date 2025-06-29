package com.company.javaRelearn;

import java.util.HashSet;
import java.util.Set;

public class IsSubstringPresent_20241226 {
    public boolean isSubstringPresent(String s) {
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < s.length() - 1; i++) {
            String sub = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1));
            set.add(sub);
        }
        for (int i = s.length() - 1; i > 0; i--) {
            String sub = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i - 1));
            if(set.contains(sub)){
                return true;
            }
        }
        return false;
    }
}
