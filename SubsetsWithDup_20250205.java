package com.company.javaRelearn;

import java.util.*;

public class SubsetsWithDup_20250205 {
    private List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        result.add(new ArrayList<Integer>());
        recursiveCore(nums, 0, new ArrayList<Integer>());
        return result;
    }

    private void recursiveCore(int[] nums, int start, List<Integer> list){
        Set<Integer> set = new HashSet<Integer>();
        for (int i = start; i < nums.length; i++) {
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                list.add(nums[i]);
                result.add(new ArrayList<Integer>(list));
                recursiveCore(nums, i + 1, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
