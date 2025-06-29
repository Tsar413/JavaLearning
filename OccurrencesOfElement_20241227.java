package com.company.javaRelearn;

import java.util.Arrays;

public class OccurrencesOfElement_20241227 {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] data = new int[nums.length];
        Arrays.fill(data, -1);
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == x){
                data[index] = i;
                index++;
            }
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < result.length; i++) {
            if(queries[i] <= nums.length){
                result[i] = data[queries[i] - 1];
            } else {
                result[i] = - 1;
            }
        }
        return result;
    }
}
