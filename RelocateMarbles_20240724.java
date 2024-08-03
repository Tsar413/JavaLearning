package com.company.javaRelearn;

import java.util.*;

public class RelocateMarbles_20240724 {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        Map<Integer, Integer> data = new HashMap<Integer, Integer>();
        for(int n : nums){
            if(data.containsKey(n)){
                int t = data.get(n);
                t++;
                data.put(n, t);
            } else {
                data.put(n, 1);
            }
        }
        for(int i = 0; i < moveFrom.length; i++){
            int t = data.get(moveFrom[i]);
            if(data.containsKey(moveTo[i])){
                int t1 = data.get(moveTo[i]);
                if(moveTo[i] != moveFrom[i]){
                    data.put(moveTo[i], t + t1);
                    data.remove(moveFrom[i]);
                }
            } else {
                data.put(moveTo[i], t);
                data.remove(moveFrom[i]);
            }
        }
        List<Integer> list = new ArrayList<Integer>(data.keySet());
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 4};
        int[] moveFrom = new int[]{4,3,1,2,2,3,2,4,1};
        int[] moveTo = new int[]{3,1,2,2,3,2,4,1,1};
        System.out.println(new RelocateMarbles_20240724().relocateMarbles(nums, moveFrom, moveTo));
    }
}
