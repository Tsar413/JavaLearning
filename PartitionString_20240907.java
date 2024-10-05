package com.company.javaRelearn;

import java.util.HashSet;
import java.util.Set;

public class PartitionString_20240907 {
    public int partitionString(String s) {
        Set<Character> set = new HashSet<Character>();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))){
                set.clear();
                result++;
                set.add(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        return result + 1;
    }
}
