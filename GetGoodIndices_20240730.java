package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class GetGoodIndices_20240730 {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < variables.length; i++) {
            int a = variables[i][0];
            int b = variables[i][1];
            int c = variables[i][2];
            int m = variables[i][3];
            int t = pow(pow(a, b, 10), c, m);
            if(t == target){
                result.add(i);
            }
        }
        return result;
    }

    private int pow(int a, int b, int mod){
        if(a == 1){
            return 1 % mod;
        }
        if(b == 1){
            return a % mod;
        }
        int result = 1;
        while (b > 1){
            if(b % 2 == 1){
                result = result * a % mod;
            }
            a = a * a % mod;
            b /= 2;
        }
        result = result * a % mod;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new GetGoodIndices_20240730().pow(4, 6, 7));
    }
}
