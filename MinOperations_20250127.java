package com.company.javaRelearn;

public class MinOperations_20250127 {
    public int minOperations(int k) {
        int result = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            int t = i - 1;
            if(k % i == 0){
                t += (k / i - 1);
            } else {
                t += (k / i);
            }
            result = Math.min(result, t);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MinOperations_20250127().minOperations(11));
    }
}
