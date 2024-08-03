package com.company.javaRelearn;

public class TemperatureTrend_20240621 {
    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        int[] changeA = new int[temperatureA.length - 1];
        int[] changeB = new int[temperatureB.length - 1];
        int result = 0;
        int temp = 0;
        for(int i = 0; i < temperatureA.length - 1; i++){
            if(temperatureA[i + 1] - temperatureA[i] > 0){
                changeA[i] = 1;
            } else if(temperatureA[i + 1] - temperatureA[i] == 0){
                changeA[i] = 0;
            } else {
                changeA[i] = -1;
            }
            if(temperatureB[i + 1] - temperatureB[i] > 0){
                changeB[i] = 1;
            } else if(temperatureB[i + 1] - temperatureB[i] == 0){
                changeB[i] = 0;
            } else {
                changeB[i] = -1;
            }
            if(changeA[i] == changeB[i]){
                temp++;
            } else {
                result = Math.max(result, temp);
                temp = 0;
            }
        }
        result = Math.max(result, temp);
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {21,18,18,18,31};
        int[] nums2 = {34,32,16,16,17};
        System.out.println(new TemperatureTrend_20240621().temperatureTrend(nums1, nums2));
    }
}
