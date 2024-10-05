package com.company.javaRelearn;

public class DailyTemperatures_20240920 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for (int i = 0; i < result.length - 1; i++) {
            if(temperatures[i + 1] > temperatures[i]){
                result[i] = 1;
            } else {
                for (int j = i + 1; j < temperatures.length; j++) {
                    if(temperatures[j] > temperatures[i]){
                        result[i] = j - i;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
