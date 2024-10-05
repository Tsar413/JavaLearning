package com.company.javaRelearn;

import java.util.Arrays;

public class MaxTotalReward_20240816 {
    public int maxTotalReward(int[] rewardValues) {
        Arrays.sort(rewardValues);
        int x = 0;
        int result = 0;
        for (int i = 0; i < rewardValues.length; i++) {
            x = rewardValues[i];
            int index = i + 1;
            while (index < rewardValues.length){
                int temp = x;
                int tempIndex = 0;
                for (int j = index; j < rewardValues.length - 1; j++) {
                    temp = x;
                    if(x < rewardValues[j] && x + rewardValues[j] < rewardValues[j + 1]){
                        temp += rewardValues[j];
                        tempIndex = j;
                    }
                }
                x = temp;
                if(index == rewardValues.length - 1){
                    if(x < rewardValues[index]){
                        x += rewardValues[index];
                    }
                }
                if(tempIndex != 0){
                    index = tempIndex;
                }

                index++;
            }
            result = Math.max(result, x);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] rewardValues = new int[]{1,16,3,9};
        System.out.println(new MaxTotalReward_20240816().maxTotalReward(rewardValues));
    }
}
