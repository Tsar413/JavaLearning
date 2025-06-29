package com.company.javaRelearn;

public class KnightDialer_20241210 {
    private static final int[][] DROP_KEY = {{4,6},{6,8},{7,9},{4,8},{0,3,9},{},{0,1,7},{2,6},{1,3},{2,4}};
    private static final int MOD = 1000000007;
    private static final int[][] memo = new int[5000][10];

    public int knightDialer(int n) {
        if(n == 1){
            return 10;
        }
        int result = 0;
        for (int i = 0; i <= 9; i++) {
            result = (result + recursiveCore(n - 1, i)) % MOD;
        }
        return result;
    }

    private int recursiveCore(int n, int key){
        if(n == 1){
            return DROP_KEY[key].length;
        }
        if (memo[n][key] > 0) {
            return memo[n][key];
        }
        int result = 0;
        for (int i = 0; i < DROP_KEY[key].length; i++) {
            result = (result + recursiveCore(n - 1, DROP_KEY[key][i])) % MOD;
        }
        return memo[n][key] = result;
    }

    public static void main(String[] args) {
        System.out.println(new KnightDialer_20241210().knightDialer(3));
    }
}
