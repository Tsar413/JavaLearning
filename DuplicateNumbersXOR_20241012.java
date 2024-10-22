package com.company.javaRelearn;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbersXOR_20241012 {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int num = 0;
        int result = 0;
        for (int n : nums){
            if(set.contains(n)){
                num = n;
                if(result == 0){
                    result = num;
                } else {
                    result = result ^ num;
                }
            } else {
                set.add(n);
            }
        }
        return result;
    }
}
