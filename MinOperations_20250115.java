package com.company.javaRelearn;

import java.util.PriorityQueue;

public class MinOperations_20250115 {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> queue = new PriorityQueue<Long>();
        for (int n : nums){
            queue.offer((long) n);
        }
        int result = 0;
        while (queue.size() >= 2){
            long num1 = queue.poll();
            long num2 = queue.poll();
            if(num1 < k || num2 < k){
                result++;
                queue.offer((long) (Math.min(num1, num2) * 2 + Math.max(num1, num2)));
            } else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 4, 9};
        System.out.println(new MinOperations_20250115().minOperations(nums, 20));
    }
}
