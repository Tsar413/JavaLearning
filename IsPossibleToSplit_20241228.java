package com.company.javaRelearn;

import java.util.HashSet;
import java.util.Set;

public class IsPossibleToSplit_20241228 {
    public boolean isPossibleToSplit(int[] nums) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        int flag = 1;
        for (int n : nums){
            if(flag == 1){
                if(!set1.contains(n)){
                    set1.add(n);
                    flag = 2;
                } else {
                    if(!set2.contains(n)){
                        set2.add(n);
                    } else {
                        return false;
                    }
                }
            } else {
                if(!set2.contains(n)){
                    set2.add(n);
                    flag = 1;
                } else {
                    if(!set1.contains(n)){
                        set1.add(n);
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
