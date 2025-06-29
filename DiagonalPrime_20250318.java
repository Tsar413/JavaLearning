package com.company.javaRelearn;

public class DiagonalPrime_20250318 {
    public int diagonalPrime(int[][] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(judge(nums[i][i])){
                result = Math.max(result, nums[i][i]);
            }
            if(judge(nums[i][nums.length - i - 1])){
                result = Math.max(result, nums[i][nums.length - i - 1]);
            }
        }
        return result;
    }

    private boolean judge(int n){
        if(n == 1){
            return false;
        }
        int index = 2;
        while (index * index <= n){
            if(n % index == 0){
                return false;
            }
            index++;
        }
        return true;
    }
}


