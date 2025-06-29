package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class CountPrefixes_20250324 {
    public int countPrefixes(String[] words, String s) {
        List<String> list = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
            list.add(stringBuilder.toString());
        }
        int result = 0;
        for (String word : words){
            if(list.contains(word)){
                result++;
            }
        }
        return result;
    }
}
