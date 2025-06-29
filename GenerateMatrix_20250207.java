package com.company.javaRelearn;

public class GenerateMatrix_20250207 {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int index1 = 0;
        int index2 = 0;
        int num = 1;
        int flag = 1;
        while (num <= n * n){
            result[index1][index2] = num;
            num++;
            if(flag == 1){
                if(index2 + 1 == n || result[index1][index2 + 1] != 0){
                    flag = 2;
                    index1++;
                } else {
                    index2++;
                }
            } else if(flag == 2){
                if(index1 + 1 == n || result[index1 + 1][index2] != 0){
                    flag = 3;
                    index2--;
                } else {
                    index1++;
                }
            } else if(flag == 3){
                if(index2 - 1 == -1 || result[index1][index2 - 1] != 0){
                    flag = 4;
                    index1--;
                } else {
                    index2--;
                }
            } else {
                if(index1 - 1 == -1 || result[index1 - 1][index2] != 0){
                    flag = 1;
                    index2++;
                } else {
                    index1--;
                }
            }
        }
        return result;
    }
}
