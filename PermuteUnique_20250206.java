package com.company.javaRelearn;

import java.util.*;

public class PermuteUnique_20250206 {
    private List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        recursiveCore(nums, new ArrayList<Integer>(), new ArrayList<Integer>());
        return result;
    }

    private void recursiveCore(int[] nums, List<Integer> list, List<Integer> flag){
        if(list.size() == nums.length){
            result.add(new ArrayList<Integer>(list));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if(i == 0){
                    if(!flag.contains(i)){
                        list.add(nums[i]);
                        flag.add(i);
                        recursiveCore(nums, list, flag);
                        list.remove(list.size() - 1);
                        flag.remove(flag.size() - 1);
                    }
                } else {
                    if(nums[i] == nums[i - 1]){
                        list.add(nums[i]);
                        flag.add(i);
                    } else {
                        list.add(nums[i]);
                        flag.add(i);
                        recursiveCore(nums, list, flag);
                        list.remove(list.size() - 1);
                        flag.remove(flag.size() - 1);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        System.out.println(new PermuteUnique_20250206().permuteUnique(nums));
    }
}
