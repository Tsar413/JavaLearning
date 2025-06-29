package com.company.javaRelearn;

import java.util.Arrays;

public class MinimumCost_20241225 {
    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        int sum1 = 0;
        int sum2 = 0;
        int result = 0;
        for (int h : horizontalCut){
            sum1 += h;
        }
        for (int v : verticalCut){
            sum2 += v;
        }
        int index1 = horizontalCut.length - 1;
        int index2 = verticalCut.length - 1;
        while (index1 >= 0 || index2 >= 0){
            if(index1 >= 0 && index2 >= 0){
                if(horizontalCut[index1] >= verticalCut[index2]){
                    result += horizontalCut[index1];
                    result += sum2;
                    sum1 -= horizontalCut[index1];
                    index1--;
                } else {
                    result += verticalCut[index2];
                    result += sum1;
                    sum2 -= verticalCut[index2];
                    index2--;
                }
            } else {
                if(index1 < 0){
                    result += sum2;
                    index2 = -1;
                } else {
                    result += sum1;
                    index1 = -1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] horizontalCut = {1, 3};
        int[] verticalCut = {5};
        System.out.println(new MinimumCost_20241225().minimumCost(3,2,horizontalCut,verticalCut));

    }
}
