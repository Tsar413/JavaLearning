package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxSum_20250307 {
    public long maxSum(int[][] grid, int[] limits, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(((o1, o2) -> o2 - o1));
        for (int i = 0; i < grid.length; i++) {
            int[] grids = grid[i];
            Arrays.sort(grids);
            int limit = limits[i];
            int index = grids.length - 1;
            while (limit > 0){
                queue.offer(grids[index]);
                index--;
                limit--;
            }
        }
        long result = 0;
        while (k > 0){
            if(!queue.isEmpty()){
                result += queue.poll();
                k--;
            } else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,2},{3,4}};
        int[] limits = new int[]{1,2};
        System.out.println(new MaxSum_20250307().maxSum(grid, limits, 2));
    }
}
