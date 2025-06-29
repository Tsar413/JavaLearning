package com.company.javaRelearn;

import com.company.javaRelearn.AlgorithmsDataStructuresLearning.LinkedList_2023_2_4.Stack;

public class MinSwaps_20250317 {
    public int minSwaps(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '['){
                count++;
            } else {
                if(count > 0){
                    count--;
                }
            }
        }
        if(count % 2 == 0){
            return count / 2;
        }
        return count / 2 + 1;
    }
}
