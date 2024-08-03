package com.company.javaRelearn;

import java.util.*;

public class MinimumEffort_20240721 {
    public int minimumEffort(int[][] tasks) {
        Map<Integer, List<int[]>> diff = new TreeMap<Integer, List<int[]>>();
        for (int i = 0; i < tasks.length; i++) {
            int key1 = tasks[i][1] - tasks[i][0];
            if(diff.containsKey(key1)){
                diff.get(key1).add(new int[]{tasks[i][0], tasks[i][1]});
            } else {
                List<int[]> list = new ArrayList<int[]>();
                list.add(new int[]{tasks[i][0], tasks[i][1]});
                diff.put(key1, list);
            }
        }
        List<Integer> keyList = new ArrayList<Integer>(diff.keySet());
        for (int i = 0; i < keyList.size(); i++) {
            List<int[]> valueList = diff.get(keyList.get(i));
            Collections.sort(valueList, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[1] - o2[1];
                }
            });
            diff.put(keyList.get(i), valueList);
        }
        int result = 0;
        for (int i = 0; i < keyList.size(); i++) {
            List<int[]> valueList = diff.get(keyList.get(i));
            if(keyList.get(i) == 0){
                for (int j = 0; j < valueList.size(); j++) {
                    result += valueList.get(j)[0];
                }
            } else {
                for (int j = 0; j < valueList.size(); j++) {
                    int small = valueList.get(j)[0];
                    int big = valueList.get(j)[1];
                    if(result + small < big){
                        result = big;
                    } else {
                        result += small;
                    }
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[][] tasks = new int[][]{{1,3},{2,4},{10,11},{10,12},{8,9}};
        System.out.println(new MinimumEffort_20240721().minimumEffort(tasks));
    }
}
