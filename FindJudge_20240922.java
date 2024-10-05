package com.company.javaRelearn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindJudge_20240922 {
    public int findJudge(int n, int[][] trust) {
        int[] trust1 = new int[n + 1];
        for (int i = 0; i < trust.length; i++) {
            trust1[trust[i][1]]++;
            trust1[trust[i][0]]--;
        }
        int count = 0;
        int result = 0;
        for (int i = 1; i < trust1.length; i++) {
            if(trust1[i] == n - 1){
                count++;
                result = i;
            }
        }
        if(count != 1){
            return -1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] trust = {{1, 3}, {2, 3}, {3, 1}};
        System.out.println(new FindJudge_20240922().findJudge(3, trust));
    }
}
