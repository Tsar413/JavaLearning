package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CombinationSum2_20250126 {
    private List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        dfs(candidates, 0, 0, target, new ArrayList<Integer>());
        return result;
    }

    private void dfs(int[] candidates, int index, int sum, int target, List<Integer> list){
        for (int i = index; i < candidates.length; i++) {
            if(sum + candidates[i] > target){
                continue;
            } else if(sum + candidates[i] < target){
                list.add(candidates[i]);
                dfs(candidates, i + 1, sum + candidates[i], target, list);
                list.remove(list.size() - 1);
            } else {
                list.add(candidates[i]);
                boolean flag = true;
                for (List<Integer> subList : result){
                    if(subList.stream().sorted().collect(Collectors.toList()).equals(list.stream().sorted().collect(Collectors.toList()))){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    List<Integer> temp = new ArrayList<Integer>(list);
                    result.add(temp);
                }
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,5,1,1,2,3,3,3,1,2,2};
        System.out.println(new CombinationSum2_20250126().combinationSum2(candidates, 5));

    }
}
