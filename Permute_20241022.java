package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class Permute_20241022 {
    private List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> permute(int[] nums) {
        recursiveCore(nums, new ArrayList<Integer>());
        return result;
    }

    private void recursiveCore(int[] nums, List<Integer> list){
        if(list.size() == nums.length - 1){
            for (int n : nums){
                if(!list.contains(n)){
                    list.add(n);
                    break;
                }
            }
            result.add(new ArrayList<Integer>(list));
            list.remove(list.size() - 1);
        } else {
            for (int n : nums){
                if(!list.contains(n)){
                    list.add(n);
                    recursiveCore(nums, list);
                    list.remove(list.size() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(new Permute_20241022().permute(nums));
    }
}
