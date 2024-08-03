package com.company.javaRelearn;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EatenApples_20240626 {
    public int eatenApples(int[] apples, int[] days) {
        int[][] data = new int[apples.length][2];
        for(int i = 0; i < apples.length; i++){
            data[i][0] = i + 1;
            data[i][1] = i + (Math.min(apples[i], days[i])) + 1;
        }
        int result = 0;
        int start = 1;
        int end = 1;
        for(int i = 0; i < apples.length - 1; i++){
            if(data[i][1] == data[i][0]){
                if(end == data[i][1]){
                    result += (end - start);
                    start = data[i + 1][0];
                    end = data[i + 1][1];
                }
            } else {
                if(data[i][1] < data[i + 1][0]){
                    end = data[i][1];
                    result += (end - start);
                    start = data[i + 1][0];
                } else if(data[i + 1][0] <= data[i][1] && data[i][1] <= data[i + 1][1] ){
                    end = data[i + 1][1];
                } else if(data[i + 1][1] < data[i][1]){
                    end = data[i][1];
                }
            }
        }
        result += (end - start);
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,0,0,1,0,2,5};
        int[] nums2 = {1,0,0,1,0,2,10};
        System.out.println((char) 121);
        System.out.println(new EatenApples_20240626().eatenApples(nums1, nums2));
        float a = 0.5f;
        float b = 0.8f;
        float c = a * b;
        BigDecimal d = new BigDecimal("0.5");
        BigDecimal e = new BigDecimal("0.8");
        BigDecimal f = d.multiply(e);
        System.out.printf("%.10f%n", c);
        System.out.println(f.setScale(10, RoundingMode.HALF_UP));
        List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
                31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        System.out.println(list.contains(23));
    }
}
