package com.company.javaRelearn;

import java.util.*;

public class FindSmallestInteger_20250626 {
    public int findSmallestInteger(int[] nums, int value) {
        Set<Integer> set = new TreeSet<Integer>();
        for (int n : nums){
            if(n < 0){
                if(n % value == 0){
                    set.add(0);
                } else {
                    set.add(value + n % value);
                }
            } else {
                set.add(n % value);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        if(list.get(0) != 0){
            return 0;
        }
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) - list.get(i - 1) > 1){
                return list.get(i - 1) + 1;
            }
        }
        return list.get(list.size() - 1) + 1;
    }
}
