package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder_20240924 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int up = 0;
        int right = matrix[0].length - 1;
        int down = matrix.length - 1;
        int leftIndex = 0;
        int rightIndex = 0;
        int flag = 1;
        int count = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (left <= right || up <= down){
            if(flag == 1){
                if(rightIndex == right){
                    list.add(matrix[leftIndex][rightIndex]);
                    leftIndex++;
                    flag = 2;
                    up++;
                } else {
                    list.add(matrix[leftIndex][rightIndex]);
                    rightIndex++;
                }
            } else if (flag == 2){
                if(leftIndex == down){
                    list.add(matrix[leftIndex][rightIndex]);
                    rightIndex--;
                    flag = 3;
                    right--;
                } else {
                    list.add(matrix[leftIndex][rightIndex]);
                    leftIndex++;
                }
            } else if (flag == 3){
                if(rightIndex == left){
                    list.add(matrix[leftIndex][rightIndex]);
                    leftIndex--;
                    flag = 4;
                    down--;
                } else {
                    list.add(matrix[leftIndex][rightIndex]);
                    rightIndex--;
                }
            }  else if (flag == 4){
                if(leftIndex == up){
                    list.add(matrix[leftIndex][rightIndex]);
                    rightIndex++;
                    flag = 1;
                    left++;
                } else {
                    list.add(matrix[leftIndex][rightIndex]);
                    leftIndex--;
                }
            }
            count++;
            if(count == matrix.length * matrix[0].length){
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(new SpiralOrder_20240924().spiralOrder(matrix));
    }
}
