package com.company.javaRelearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumEquivDominoPairs_20250504 {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<int[], Integer> map = new HashMap<int[], Integer>();
        for (int i = 0; i < dominoes.length; i++) {
            Set<int[]> ints = map.keySet();
            boolean flag = false;
            for (int[] anInt : ints) {
                if(anInt[0] == dominoes[i][0] && anInt[1] == dominoes[i][1] || anInt[0] == dominoes[i][1] && anInt[1] == dominoes[i][0]){
                    int t = map.get(anInt);
                    t++;
                    map.put(anInt, t);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                map.put(new int[]{dominoes[i][0], dominoes[i][1]}, 1);
            }
        }
        int result = 0;
        for (Integer value : map.values()) {
            result += value * (value - 1) / 2;
        }
        return result;
    }
}
