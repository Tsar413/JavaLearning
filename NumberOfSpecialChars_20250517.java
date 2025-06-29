package com.company.javaRelearn;

import java.util.HashSet;
import java.util.Set;

public class NumberOfSpecialChars_20250517 {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();
        Set<Character> result = new HashSet<Character>();
        for (char c : word.toCharArray()){
            if((int) c >= 97){
                if(!result.contains(c)){
                    set.add(c);
                } else {
                    result.remove(c);
                }
            } else {
                char c2 = (char) (c + 32);
                if(!set2.contains(c)){
                    if(set.contains(c2)) {
                        set.remove(c2);
                        result.add(c2);
                    }
                }
                set2.add(c);
            }
        }
        return result.size();
    }

    public static void main(String[] args) {
        System.out.println(new NumberOfSpecialChars_20250517().numberOfSpecialChars("AbcbDBdD"));
    }
}
