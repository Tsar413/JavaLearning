package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class FindKDistantIndices_20250624 {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == key){
                indexes.add(i);
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int n : indexes){
            for (int i = n - k; i <= n + k ; i++) {
                if(!list.contains(i) && i >= 0 && i < nums.length){
                    list.add(i);
                }
            }
        }
        return list;
    }
}
