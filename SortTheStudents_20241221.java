package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Comparator;

public class SortTheStudents_20241221 {
    public int[][] sortTheStudents(int[][] score, int k) {
        int[][] temp = new int[score.length][2];
        for (int i = 0; i < score.length; i++) {
            temp[i][0] = score[i][k];
            temp[i][1] = i;
        }
        Arrays.sort(temp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        int[][] result = new int[score.length][score[0].length];
        for (int i = 0; i < score[0].length; i++) {
            for (int j = 0; j < score.length; j++) {
                result[j][i] = score[temp[j][1]][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] score = {{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}};
        System.out.println(Arrays.deepToString(new SortTheStudents_20241221().sortTheStudents(score, 2)));
    }
}
