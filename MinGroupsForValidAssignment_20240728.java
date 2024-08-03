package com.company.javaRelearn;

import java.util.*;

public class MinGroupsForValidAssignment_20240728 {
    public int minGroupsForValidAssignment(int[] balls) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int ball : balls){
            if(map.containsKey(ball)){
                int t = map.get(ball);
                t++;
                map.put(ball, t);
            } else {
                map.put(ball, 1);
            }
        }
        List<Integer> keyList = new ArrayList<Integer>(map.keySet());
        int min = Integer.MAX_VALUE;
        for(int key : keyList){
            min = Math.min(min, map.get(key));
        }
        for (int i = min; i >= 1 ; i--) {
            for(int key : keyList){
                int num = map.get(key);
                if(num / i < num % i){
                    result = 0;
                    break;
                }
                result += (num + i) / (i + 1);
            }
            if(result > 0){
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] balls = new int[]{10,10,10,3,1,1};
        System.out.println(new MinGroupsForValidAssignment_20240728().minGroupsForValidAssignment(balls));
    }
}
