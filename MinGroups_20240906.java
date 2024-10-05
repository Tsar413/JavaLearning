package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinGroups_20240906 {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < intervals.length; i++) {
            if(list.size() == 0){
                list.add(intervals[i][1]);
            } else {
                boolean flag = false;
                for (int j = 0; j < list.size(); j++) {
                    if(list.get(j) + 1 <= intervals[i][0]){
                        list.set(j, intervals[i][1]);
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    list.add(intervals[i][1]);
                }
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        int[][] intervals = {{5, 10}, {6, 8}, {1, 5}, {2, 3}, {1, 10}};
        System.out.println(new MinGroups_20240906().minGroups(intervals));
    }
}
