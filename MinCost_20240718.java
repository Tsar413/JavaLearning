package com.company.javaRelearn;

public class MinCost_20240718 {
    public int minCost(String colors, int[] neededTime) {
        String[] data = colors.split("");
        int startIndex = 0;
        int endIndex = 0;
        String color = data[0];
        int result = 0;
        for(int i = 0; i < data.length; i++){
            if(color.equals(data[i])){
                endIndex = i;
            } else {
                if(endIndex - startIndex >= 1){
                    int time = getMaxTime(neededTime, startIndex, endIndex);
                    result += time;
                }
                color = data[i];
                startIndex = i;
                endIndex = i;
            }
        }
        if(endIndex - startIndex >= 1){
            int time = getMaxTime(neededTime, startIndex, endIndex);
            result += time;
        }
        return result;
    }

    public int getMaxTime(int[] neededTime, int startIndex, int endIndex){
        int result = 0;
        int index = startIndex;
        for(int i = startIndex; i <= endIndex; i++){
            if(neededTime[i] > neededTime[index]){
                index = i;
            }
        }
        for(int i = startIndex; i <= endIndex; i++){
            if(i != index){
                result += neededTime[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MinCost_20240718().minCost("aabaa", new int[]{1,2,3,4,1}));
    }
}
