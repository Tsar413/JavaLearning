package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GetFinalState_20241213 {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] != o2[0]){
                    if(o1[0] >= o2[0]){
                        return 1;
                    } else {
                        return -1;
                    }
                }
                if(o1[1] >= o2[1]){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (int i = 0; i < nums.length; i++) {
            queue.offer(new int[]{nums[i], i});
        }
        for (int i = 0; i < k; i++) {
            int[] t = queue.poll();
            t[0] *= multiplier;
            queue.offer(t);
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            int[] t = queue.poll();
            result[t[1]] = t[0];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 1, 6};
        System.out.println(Arrays.toString(new GetFinalState_20241213().getFinalState(nums, 0, 0)));
    }
}
