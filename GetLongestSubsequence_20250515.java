package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class GetLongestSubsequence_20250515 {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<String>();
        int flag = groups[0];
        result.add(words[0]);
        for (int i = 1; i < groups.length; i++) {
            if(groups[i] != flag){
                result.add(words[i]);
                flag = groups[i];
            }
        }
        return result;
    }
}
