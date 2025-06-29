package com.company.javaRelearn;

import java.util.Stack;

public class LargestRectangleArea_20250119 {
    public int largestRectangleArea(int[] heights) {
        int result = 0;
        for (int i = 0; i < heights.length; i++) {
            int max = heights[i];
            for (int j = i; j >= 0; j--) {
                max = Math.min(heights[j], max);
                int mul = max * (i - j + 1);
                result = Math.max(result, mul);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] heights1 = {2, 1, 5, 6, 2, 3};
        int[] heights2 = {2, 4};
        int[] heights3 = {5, 4, 1, 2};
        System.out.println(new LargestRectangleArea_20250119().largestRectangleArea(heights3));
    }
}
