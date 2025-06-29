package com.company.javaRelearn;

import java.util.*;

public class MaxPoints_20241128 {
    public int maxPoints(int[][] points) {
        Map<Double, Set<Integer>> map = new HashMap<Double, Set<Integer>>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double rate = (points[j][1] - points[i][1]) * 1.0 / (points[j][0] - points[i][0]);
                if(map.containsKey(rate)){
                    map.get(rate).add(i);
                    map.get(rate).add(j);
                } else {
                    Set<Integer> set = new HashSet<Integer>();
                    set.add(i);
                    set.add(j);
                    map.put(rate, set);
                }
            }
            List<Double> list = new ArrayList<Double>(map.keySet());
            for (double d : list){
                max = Math.max(max, map.get(d).size());
            }
            map.clear();
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] points = {{0, 0}, {4, 5}, {7, 8}, {8, 9}, {5, 6}, {3, 4}, {1, 1}};
        System.out.println(new MaxPoints_20241128().maxPoints(points));
    }
}
