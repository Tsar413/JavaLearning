package com.company.javaRelearn;

import java.util.*;

public class MinOperations_20250409 {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new TreeSet<Integer>();
        for (int n : nums){
            set.add(n);
        }
        List<Integer> list = new ArrayList<Integer>(set);
        if(list.get(0) < k){
            return -1;
        }
        if(list.get(0) == k){
            return list.size() - 1;
        }
        return list.size();
    }
}
