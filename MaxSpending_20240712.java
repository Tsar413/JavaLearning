package com.company.javaRelearn;

import java.util.Arrays;

public class MaxSpending_20240712 {
    public long maxSpending(int[][] values) {
        int[] indexArray = new int[values.length];
        Arrays.fill(indexArray, values[0].length - 1);
        int count = 1;
        long result = 0;
        while(count <= (values.length * values[0].length)){
            int store = 0;
            int price = Integer.MAX_VALUE;
            for(int i = 0; i < indexArray.length; i++){
                if(indexArray[i] > -1 && price > values[i][indexArray[i]]){
                    price = values[i][indexArray[i]];
                    store = i;
                }
            }
            indexArray[store] = indexArray[store] - 1;
            result += (price * count);
            count++;
        }
        return result;
    }

    public long maxSpending1(int[][] values) {
        int[] data = new int[values.length * values[0].length];
        int index = 0;
        for (int[] value : values) {
            for (int n : value) {
                data[index] = n;
                index++;
            }
        }
        Arrays.sort(data);
        long result = 0L;
        for (int i = 0; i < data.length; i++) {
            result += (data[i] * (i + 1));
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] nums = {{8,5,2},{6,4,1},{9,7,3}};
        System.out.println(new MaxSpending_20240712().maxSpending(nums));
        System.out.println(Integer.bitCount(8));
    }
}
