package com.company.javaRelearn;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix_20250522 {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<String> set = new HashSet<>();
        for (int n : arr1){
            String number = String.valueOf(n);
            for (int i = 0; i < number.length(); i++) {
                set.add(number.substring(0, i + 1));
            }
        }
        int result = 0;
        for (int n : arr2){
            String number = String.valueOf(n);
            for (int i = 0; i < number.length(); i++) {
                if(set.contains(number.substring(0, i + 1))){
                    result = Math.max(result, i + 1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 100};
        int[] arr2 = {1000};
        System.out.println(new LongestCommonPrefix_20250522().longestCommonPrefix(arr1, arr2));
    }
}
