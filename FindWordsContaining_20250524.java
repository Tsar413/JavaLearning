package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining_20250524 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()){
                if(c == x){
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}
