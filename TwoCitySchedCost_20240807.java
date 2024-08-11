package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCitySchedCost_20240807 {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Math.abs(o2[0] - o2[1]) - Math.abs(o1[0] - o1[1]);
            }
        });
        for (int i = 0; i < costs.length; i++) {
            System.out.println(costs[i][0] + " " + costs[i][1]);
        }
        int result = 0;
        boolean flag1 = false;
        int c1 = 0;
        boolean flag2 = false;
        int c2 = 0;
        int length = costs.length;
        for (int i = 0; i < length; i++) {
            if(!flag1 && !flag2){
                if (costs[i][0] > costs[i][1]){
                    result += costs[i][1];
                    c2++;
                } else {
                    result += costs[i][0];
                    c1++;
                }
            }
            if(flag1 || flag2){
                if(flag1){
                    result += costs[i][1];
                } else {
                    result += costs[i][0];
                }
            }
            if(c1 == length / 2){
                flag1 = true;
            }
            if(c2 == length / 2){
                flag2 = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{10,20},{30,200},{400,50},{30,20}};
        System.out.println(new TwoCitySchedCost_20240807().twoCitySchedCost(nums));
    }
}
