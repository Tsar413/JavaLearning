package com.company.javaRelearn;

public class MinimumSum_20250336 {
    public int minimumSum(int n, int k) {
        int half = k / 2;
        if(half > n){
            return (1 + n) * n / 2;
        }
        return (1 + half) * half / 2 + (k + n - half + k - 1) * (n - half) / 2;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumSum_20250336().minimumSum(5, 4));
    }
}
