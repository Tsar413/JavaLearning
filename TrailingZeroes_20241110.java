package com.company.javaRelearn;

public class TrailingZeroes_20241110 {
    public int trailingZeroes(int n) {
        int result = 0;
        int num = 1;
        while (num <= n){
            if(num % 10 == 5){
                result++;
            }
            if(num % 10 == 0){
                result++;
            }
            num++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new TrailingZeroes_20241110().trailingZeroes(5));
    }
}
