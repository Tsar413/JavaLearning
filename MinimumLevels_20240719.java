package com.company.javaRelearn;

public class MinimumLevels_20240719 {
    public int minimumLevels(int[] possible) {
        int[] data = new int[possible.length];
        int sum = 0;
        for(int i = 0; i < possible.length; i++){
            if(possible[i] == 1){
                sum += 1;
            } else {
                sum += -1;
            }
            data[i] = sum;
        }
        for(int i = 0; i < data.length - 1; i++){
            int t = sum - data[i];
            if(data[i] > t){
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumLevels_20240719().minimumLevels(new int[]{1, 1}));
    }
}
