package com.company.javaRelearn;

import java.util.Arrays;

public class MaximumHappinessSum_20240912 {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long result = 0L;
        int sub = 0;
        for (int i = happiness.length - 1; i >= happiness.length - k; i--) {
            if(happiness[i] - sub > 0){
                result += (happiness[i] - sub);
                sub++;
            } else {
                break;
            }

        }
        return result;
    }
}
