package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxSlidingWindow_20241214 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int index1 = 0;
        int index2 = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 >= o2){
                    return -1;
                }
                return 1;
            }
        });
        int[] result = new int[nums.length - k + 1];
        int index3 = 0;
        while (index1 < nums.length){
            if(index1 - index2 + 1 < k){
                queue.offer(nums[index1]);
                index1++;
            } else {
                queue.offer(nums[index1]);
                result[index3] = queue.peek();
                index3++;
                queue.remove(nums[index2]);
                index2++;
                index1++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(Arrays.toString(new MaxSlidingWindow_20241214().maxSlidingWindow(nums, 1)));
    }
}
