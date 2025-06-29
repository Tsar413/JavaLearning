package com.company.javaRelearn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShortestDistanceAfterQueries_20241120 {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if(map.containsKey(queries[i][0])){
                map.put(queries[i][0], Math.max(map.get(queries[i][0]), queries[i][1]));
            } else {
                map.put(queries[i][0], queries[i][1]);
            }
            result[i] = calDistance(n - 1, map);
        }
        return result;
    }

    private int calDistance(int n, Map<Integer, Integer> map){
        int start = 0;
        int result = 0;
        while (start < n){
            if(map.containsKey(start)){
                start = map.get(start);
                result++;
            } else {
                start++;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] queries = {{2, 4}, {0, 2}, {0, 4}};
        int[][] queries1 = {{0, 2}, {0, 4}};
        System.out.println(Arrays.toString(new ShortestDistanceAfterQueries_20241120().
                shortestDistanceAfterQueries(5, queries)));
    }
}
