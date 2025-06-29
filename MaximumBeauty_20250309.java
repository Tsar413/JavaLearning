package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumBeauty_20250309 {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[][] queries1 = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            queries1[i][0] = queries[i];
            queries1[i][1] = i;
        }
        Arrays.sort(queries1, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[][] data = new int[queries.length][2];
        int max = 0;
        int index = 0;
        for (int i = 0; i < items.length; i++) {
            if(items[i][0] <= queries1[index][0]){
                max = Math.max(max, items[i][1]);
            } else {
                while (index < queries.length && items[i][0] > queries1[index][0]){
                    data[index][0] = max;
                    data[index][1] = queries1[index][1];
                    index++;
                }
                max = Math.max(max, items[i][1]);
            }
        }
        while (index < queries.length){
            data[index][0] = max;
            data[index][1] = queries1[index][1];
            index++;
        }
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int[] result = new int[queries1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = data[i][0];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] items = new int[][]{{10,1000}};
        int[] queries = new int[]{5};
        System.out.println(Arrays.toString(new MaximumBeauty_20250309().maximumBeauty(items, queries)));
    }
}
