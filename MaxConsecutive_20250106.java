package com.company.javaRelearn;

import java.util.Arrays;

public class MaxConsecutive_20250106 {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < special.length; i++) {
            if(i == 0){
                result = Math.max(result, special[i] - bottom);
            } else if(i == special.length - 1){
                result = Math.max(result, top - special[i]);
            } else {
                result = Math.max(result, special[i] - special[i - 1] - 1);
            }
        }
        return result;
    }
}
