package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class FindMaxSum_20250323 {
    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {
        int[][] data = new int[nums1.length][2];
        for (int i = 0; i < nums1.length; i++) {
            data[i][0] = nums1[i];
            data[i][1] = i;
        }
        Arrays.sort(data, ((o1, o2) -> o1[0] - o2[0]));
        long[] result = new long[nums2.length];
        if(k == 1){
            return result;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(((o1, o2) -> o2 - o1));
        for (int i = 1; i < data.length; i++) {
            queue.offer(nums2[data[i - 1][1]]);
            long temp = 0;
            List<Integer> list = new ArrayList<Integer>();
            int count = 0;
            while (!queue.isEmpty() && count < k - 1){
                int peek = queue.poll();
                temp += peek;
                list.add(peek);
                count++;
            }
            result[data[i][1]] = temp;
            for (Integer integer : list) {
                queue.offer(integer);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,2,1,5,3};
        System.out.println(Arrays.toString(new FindMaxSum_20250323().findMaxSum(nums1, null, 0)));
    }
}
