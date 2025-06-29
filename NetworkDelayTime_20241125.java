package com.company.javaRelearn;

import java.util.*;

public class NetworkDelayTime_20241125 {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] time = new int[n + 1];
        Arrays.fill(time, -1);
        time[k] = 0;
        Set<Integer> set = new HashSet<Integer>();
        int start = k;
        List<Integer> startList1 = new ArrayList<Integer>();
        while (set.size() < n - 1){
            List<Integer> startList2 = new ArrayList<Integer>();
            boolean flag = false;
            for (int i = 0; i < times.length; i++) {
                if(times[i][0] == start && start == k){
                    time[times[i][1]] = times[i][2];
                    set.add(i);
                    startList1.add(times[i][1]);
                    flag = true;
                }
            }
            for (int i = 0; i < times.length; i++) {
                for (int j = 0; j < startList1.size(); j++) {
                    start = startList1.get(j);
                    if(times[i][0] == start && start != k){
                        flag = true;
                        int temp = time[times[i][0]] + times[i][2];
                        if(time[times[i][1]] == -1){
                            time[times[i][1]] = temp;
                        }
                        if(temp < time[times[i][1]]){
                            time[times[i][1]] = temp;
                        }
                        set.add(i);
                        startList2.add(times[i][1]);
                    }
                }
            }

            startList1.clear();
            startList1.addAll(startList2);

            if(!flag){
                return -1;
            }
        }
        int result = 0;
        for (int i = 1; i < time.length; i++) {
            if(time[i] == -1){
                return -1;
            } else {
                result = Math.max(result, time[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] times = {{1, 2, 1}, {2, 3, 2}, {1, 3, 2}};
        int[][] times1 = {{1, 2, 1}};
        System.out.println(new NetworkDelayTime_20241125().networkDelayTime(times, 3, 1));
    }
}
