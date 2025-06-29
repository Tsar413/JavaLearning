package com.company.javaRelearn;

import java.util.Arrays;

public class MaximumTotalSum_20240121 {
    public long maximumTotalSum(int[] maximumHeight) {
        Arrays.sort(maximumHeight);
        long result = 0;
        int flag = 0;
        int flag2 = 0;
        for (int i = maximumHeight.length - 1; i >= 0; i--) {
            if(i == maximumHeight.length - 1){
                result += maximumHeight[i];
                flag = maximumHeight[i];
                flag2 = maximumHeight[i] - 1;
            } else {
                if(flag2 <= 0){
                    return -1;
                }
                if(flag == maximumHeight[i]){
                    if(flag2 <= flag){
                        result += flag2;
                        flag2--;
                    } else {
                        result += flag;
                        flag2 = flag - 1;
                    }
                } else {
                    flag = maximumHeight[i];
                    if(flag2 <= flag){
                        result += flag2;
                        flag2--;
                    } else {
                        result += flag;
                        flag2 = flag - 1;
                    }

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] maximumHeight = {2, 3, 4, 3};
        System.out.println(new MaximumTotalSum_20240121().maximumTotalSum(maximumHeight));

    }
}
