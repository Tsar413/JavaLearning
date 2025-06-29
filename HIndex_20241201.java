package com.company.javaRelearn;

import java.util.Arrays;

public class HIndex_20241201 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int result = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if(citations[i] >= (result + 1)){
                result++;
            } else {
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] citations = {1, 3, 1};
        System.out.println(new HIndex_20241201().hIndex(citations));
    }
}
