package com.company.javaRelearn;

import java.util.Arrays;

public class MaxCoins_20250122 {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int num = piles.length / 3;
        int index = piles.length - 2;
        int result = 0;
        while (num > 0){
            result += piles[index];
            index -= 2;
            num--;
        }
        return result;
    }
}
