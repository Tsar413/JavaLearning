package com.company.javaRelearn;

public class FindNumbers_20250430 {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int n : nums){
            if(String.valueOf(n).length() % 2 == 0){
                result++;
            }
        }
        return result;
    }
}
