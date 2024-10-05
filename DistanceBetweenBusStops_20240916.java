package com.company.javaRelearn;

public class DistanceBetweenBusStops_20240916 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int index = start;
        int count = 0;
        int sum1 = 0;
        int sum2 = 0;
        boolean flag = true;
        while (count < distance.length){
            if(index == distance.length){
                index = 0;
            }
            if(flag){
                if(index == destination){
                    sum2 += distance[index];
                    flag = false;
                } else {
                    sum1 += distance[index];
                }
                index++;
            } else {
                sum2 += distance[index];
                index++;
            }
            count++;
        }
        return Math.min(sum1, sum2);
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 7, 2, 9, 10, 7, 16, 11};
        System.out.println(new DistanceBetweenBusStops_20240916().distanceBetweenBusStops(nums, 6 ,2));
    }
}
