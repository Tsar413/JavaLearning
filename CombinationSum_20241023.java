package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum_20241023 {
    private List<List<Integer>> result = new ArrayList<List<Integer>>();
    private Set<List<Integer>> set = new HashSet<List<Integer>>();
    private List<Integer> list = new ArrayList<Integer>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        recursiveCore(0, candidates, target, 0);
        return result;
    }

    public void recursiveCore(int start, int[] candidates, int target, int sum){
        for (int i = start; i < candidates.length; i++) {
            if(sum + candidates[i] < target){
                sum += candidates[i];
                list.add(candidates[i]);
                recursiveCore(i, candidates, target, sum);
                sum -= candidates[i];
                list.remove(list.size() - 1);
            } else if(sum + candidates[i] == target){
                list.add(candidates[i]);
                if(!set.contains(list)){
                    set.add(new ArrayList<Integer>(list));
                    result.add(new ArrayList<Integer>(list));
                }

                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        System.out.println(new CombinationSum_20241023().combinationSum(candidates, 12));

    }
}
