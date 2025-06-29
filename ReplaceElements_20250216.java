package com.company.javaRelearn;

public class ReplaceElements_20250216 {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        result[result.length - 1] = -1;
        int max = arr[arr.length - 1];
        for (int i = result.length - 2; i >= 0; i--) {
            if(arr[i] > max){
                result[i] = max;
                max = arr[i];
            } else {
                result[i] = max;
            }
        }
        return result;
    }
}
