package com.company.javaRelearn;

import java.util.Arrays;

public class CountKConstraintSubstrings_20241113 {
    public long[] countKConstraintSubstrings(String s, int k, int[][] queries) {
        long[] result = new long[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = countKConstraintSubstrings(s, k, queries[i][0], queries[i][1]);
        }
        return result;
    }

    private long countKConstraintSubstrings(String s, int k, int left, int right) {
        int index1 = left;
        int index2 = left;
        int n1 = 0;
        int n2 = 0;
        long result = 0;
        boolean flag = true;
        while (index1 < right + 1){
            if(flag){
                if(s.charAt(index1) == '1'){
                    n1++;
                } else {
                    n2++;
                }
                if(n1 <= k || n2 <= k){
                    result += (index1 - index2 + 1);
                    index1++;
                } else {
                    if(s.charAt(index1) == '1'){
                        n1--;
                    } else {
                        n2--;
                    }
                    flag = false;
                }
            } else {
                if(s.charAt(index2) == '1'){
                    n1--;
                } else {
                    n2--;
                }
                index2++;
                if(n1 <= k || n2 <= k){
                    flag = true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CountKConstraintSubstrings_20241113().
                countKConstraintSubstrings("0001111", 2, new int[][]{{0, 6}})));
    }
}
