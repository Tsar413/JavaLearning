package com.company.javaRelearn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WinningPlayerCount_20241123 {
    public int winningPlayerCount(int n, int[][] pick) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<Integer, Map<Integer, Integer>>();
        Set<Integer> result = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            map.put(i, new HashMap<Integer, Integer>());
        }
        for (int i = 0; i < pick.length; i++) {
            if(map.get(pick[i][0]).containsKey(pick[i][1])){
                Integer v1 = map.get(pick[i][0]).get(pick[i][1]);
                v1++;
                map.get(pick[i][0]).put(pick[i][1], v1);
                if(v1 > pick[i][0]){
                    result.add(pick[i][0]);
                }
            } else {
                map.get(pick[i][0]).put(pick[i][1], 1);
                if(1 > pick[i][0]){
                    result.add(pick[i][0]);
                }
            }
        }
        return result.size();
    }

    public static void main(String[] args) {
        int[][] pick = {{0, 0}, {1, 0}, {1, 0}, {2, 1}, {2, 1}, {2, 0}};
        int[][] pick1 = {{0, 8}, {0, 3}};
        System.out.println(new WinningPlayerCount_20241123().winningPlayerCount(2, pick1));
    }
}
