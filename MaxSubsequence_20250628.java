package com.company.javaRelearn;

import java.util.*;

public class MaxSubsequence_20250628 {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o2[1] - o1[1];
            }
        });
        for (int i = 0; i < nums.length; i++) {
            queue.offer(new int[]{i, nums[i]});
        }
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(queue.poll());
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i)[1];
        }
        return result;
    }
}
