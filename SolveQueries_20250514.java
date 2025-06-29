package com.company.javaRelearn;

import java.util.*;

public class SolveQueries_20250514 {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                List<Integer> list = map.get(nums[i]);
                list.add(i);
                map.put(nums[i], list);
            } else {
                map.put(nums[i], new ArrayList<>(List.of(i)));
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int num = nums[queries[i]];
            int index = queries[i];
            List<Integer> list = map.get(num);
            if(list.size() == 1){
                result.add(-1);
            } else {
                int target = binarySearch(list, index);
                if(target == 0){
                    int another = list.get(target) + nums.length - list.get(list.size() - 1);
                    result.add(Math.min(list.get(1) - list.get(target), another));
                } else if(target == list.size() - 1){
                    int another = list.get(0) + nums.length - list.get(target);
                    result.add(Math.min(list.get(target) - list.get(list.size() - 2), another));
                } else {
                    result.add(Math.min(list.get(target) - list.get(target - 1), list.get(target + 1) - list.get(target)));
                }
            }

        }
        return result;
    }

    private int binarySearch(List<Integer> list, int target){
        int left = 0;
        int right = list.size() - 1;
        while (left < right){
            int mid = left + right >> 1;
            if(list.get(mid) < target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 1, 4, 1, 3, 2};
        int[] queries = {0, 3, 5};
        System.out.println(new SolveQueries_20250514().solveQueries(nums, queries));
    }
}
