package com.company.javaRelearn;

import java.util.*;

public class MinRectanglesToCoverPoints_20240731 {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < points.length; i++) {
            set.add(points[i][0]);
        }
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);
        int result = 1;
        int left = list.get(0);
        int right = left + w;
        for (int i = 0; i < list.size(); i++) {
            int index = list.get(i);
            if(index > right){
                left = index;
                right = left + w;
                result++;
            }
        }
        return result;
    }
}
