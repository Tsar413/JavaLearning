package com.company.javaRelearn;

import java.util.Map;

public class FindSpecialInteger_20250217 {
    public int findSpecialInteger(int[] arr) {
        int max = 0;
        int temp = 1;
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]){
                temp++;
            } else {
                if(temp > max){
                    max = temp;
                    result = arr[i - 1];
                }
                temp = 1;
            }
        }
        if(temp > max){
            result = arr[arr.length - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        System.out.println(new FindSpecialInteger_20250217().findSpecialInteger(arr));
    }
}
