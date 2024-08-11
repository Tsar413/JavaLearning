package com.company.javaRelearn;

import com.company.javaRelearn.SEAE2.BasicClasses.PartTimeTeacher;

import java.util.*;

public class LeftmostBuildingQueries_20240810 {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int[][] qs = new int[queries.length][4];
        for (int i = 0; i < queries.length; i++) {
            if(queries[i][0] <= queries[i][1]){
                qs[i][0] = heights[queries[i][0]];
                qs[i][1] = queries[i][0];
                qs[i][2] = heights[queries[i][1]];
                qs[i][3] = queries[i][1];
            } else {
                qs[i][0] = heights[queries[i][1]];
                qs[i][1] = queries[i][1];
                qs[i][2] = heights[queries[i][0]];
                qs[i][3] = queries[i][0];
            }
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < qs.length; i++) {
            if(qs[i][1] == qs[i][3]){
                result[i] = qs[i][1];
            } else if(qs[i][1] < qs[i][3] && qs[i][0] < qs[i][2]){
                result[i] = qs[i][3];
            } else {
                int start = qs[i][3];
                int target = qs[i][0];
                boolean flag = false;
                for (int j = start + 1; j < heights.length; j++) {
                    if(heights[j] > target){
                        result[i] = j;
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    result[i] = -1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] heights = new int[]{5,3,8,2,6,1,4,6};
        int[][] queries = new int[][]{{0,7},{3,5},{5,2},{3,0},{1,6}};
        System.out.println(Arrays.toString(new LeftmostBuildingQueries_20240810().leftmostBuildingQueries(heights, queries)));
    }
}
