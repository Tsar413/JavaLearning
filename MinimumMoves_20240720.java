package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumMoves_20240720 {
    public int minimumMoves(int[][] grid) {
        Map<Integer, List<int[]>> data = new HashMap<Integer, List<int[]>>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int t = grid[i][j];
                if(t != 1){
                    if(data.containsKey(t)){
                        data.get(t).add(new int[]{i, j});
                    } else {
                        List<int[]> list = new ArrayList<int[]>();
                        list.add(new int[]{i, j});
                        data.put(t, list);
                    }
                }
            }
        }
        List<Integer> key = new ArrayList<Integer>(data.keySet());
        List<int[]> key0 = data.get(0);
        int keyIndex0 = 0;
        int result = 0;
        for (int i = 0; i < key.size(); i++) {
            int keyDiff = key.get(i);
            if(keyDiff != 0){
                List<int[]> list = data.get(keyDiff);
                for (int j = 0; j < list.size(); j++) {
                    int[] from = list.get(j);
                    for (int k = 0; k < (keyDiff - 1); k++) {
                        int[] to = key0.get(keyIndex0);
                        result += (Math.abs(from[0] - to[0]) + Math.abs(from[1] - to[1]));
                        keyIndex0++;
                    }
                }
            }
        }
        return result;
    }
}
