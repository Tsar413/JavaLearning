package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimilarPairs_20250222 {
    public int similarPairs(String[] words) {
        List<Set<Character>> list = new ArrayList<Set<Character>>();
        for (String word : words){
            Set<Character> set = new HashSet<Character>();
            for (int i = 0; i < word.length(); i++) {
                set.add(word.charAt(i));
            }
            list.add(set);
        }
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    result++;
                }
            }
        }
        return result;
    }
}
