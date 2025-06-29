package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert_20241224 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start = -1;
        int end = -1;
        List<int[]> list = new ArrayList<int[]>();
        boolean flag = true;
        for (int i = 0; i < intervals.length; i++) {
            if (start == -1) {
                if (newInterval[0] < intervals[i][0]) {
                    start = newInterval[0];
                } else if (newInterval[0] <= intervals[i][1]) {
                    start = intervals[i][0];
                }
            }
            if (start != -1 && end == -1) {
                if (newInterval[1] < intervals[i][0]) {
                    end = Math.max(end, newInterval[1]);
                } else if (newInterval[1] >= intervals[i][0] && newInterval[1] <= intervals[i][1]) {
                    end = Math.max(end, intervals[i][1]);
                }
            }
            if (start != -1 && end != -1 && flag) {
                list.add(new int[]{start, end});
                flag = false;
            }
            if (newInterval[1] < intervals[i][0] || intervals[i][1] < newInterval[0]) {
                list.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }
        if (start == -1 && end == -1 && flag) {
            list.add(new int[]{newInterval[0], newInterval[1]});
            flag = false;
        }
        if (start != -1 && end == -1 && flag) {
            list.add(new int[]{start, newInterval[1]});
            flag = false;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(Arrays.toString(list.get(i)));
        }
        int[][] result = new int[list.size()][2];
        return list.toArray(result);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 5}};
        int[] newInterval = {6, 8};
        System.out.println(Arrays.deepToString(new Insert_20241224().insert(intervals, newInterval)));
    }
}
