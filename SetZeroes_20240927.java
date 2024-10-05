package com.company.javaRelearn;

import java.util.HashSet;
import java.util.Set;

public class SetZeroes_20240927 {
    public void setZeroes(int[][] matrix) {
        Set<Integer> setCol = new HashSet<Integer>();
        Set<Integer> setRow = new HashSet<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    setRow.add(i);
                    setCol.add(j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(setRow.contains(i) || setCol.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
