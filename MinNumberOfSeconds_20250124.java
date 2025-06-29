package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinNumberOfSeconds_20250124 {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[2] - o2[2];
                }
                return o1[0] - o2[0];
            }
        });
        for (int i = 0; i < workerTimes.length; i++) {
            queue.offer(new int[]{0, 0, workerTimes[i]});
        }
        while (mountainHeight > 0){
            int[] t = queue.poll();
            if(mountainHeight == 1){
                return t[0] + (long) (t[1] + 1) * t[2];
            }
            queue.offer(new int[]{t[0] + (t[1] + 1) * t[2], t[1] + 1, t[2]});
            mountainHeight--;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] workTimes = {1, 5};
        System.out.println(new MinNumberOfSeconds_20250124().minNumberOfSeconds(5, workTimes));
    }
}
