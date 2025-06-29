package com.company.javaRelearn;

import java.util.*;

public class ShortestDistanceAfterQueries_20241119 {
    private int result1 = Integer.MAX_VALUE;

    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if(map.containsKey(queries[i][0])){
                map.get(queries[i][0]).add(queries[i][1]);
            } else {
                List<Integer> list1 = new ArrayList<Integer>();
                list1.add(queries[i][1]);
                map.put(queries[i][0], list1);
            }
            recursiveCore(0, n - 1, map, 0);
            result[i] = result1;
            result1 = Integer.MAX_VALUE;
        }
        return result;
    }

    private void recursiveCore(int start, int n, Map<Integer, List<Integer>> map, int step){
        if(start == n){
            result1 = Math.min(result1, step);
        } else {
            while (start < n){
                if(map.containsKey(start)){
                    List<Integer> list = map.get(start);
                    for (int i = 0; i < list.size(); i++) {
                        recursiveCore(list.get(i), n, map, ++step);
                        step--;
                    }
                }
                start++;
                step++;
            }
            result1 = Math.min(result1, step);
        }
    }

    public static void main(String[] args) {
        int[][] queries = {{2, 4}, {0, 2}, {0, 4}};
        int[][] queries1 = {{0, 2}, {0, 4}};
        System.out.println(Arrays.toString(new ShortestDistanceAfterQueries_20241119().
                shortestDistanceAfterQueries(5, queries)));
    }
}
