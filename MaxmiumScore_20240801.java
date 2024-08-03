package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Comparator;

public class MaxmiumScore_20240801 {
    public int maxmiumScore(int[] cards, int cnt) {
        Arrays.sort(cards);
        int result = 0;
        int oddIndex = -1;
        int evenIndex = -1;
        for (int i = cards.length - 1; i >= (cards.length - cnt) ; i--) {
            result += cards[i];
            if(cards[i] % 2 == 1){
                oddIndex = i;
            } else {
                evenIndex = i;
            }
        }
        if(result % 2 == 0){
            return result;
        }
        int result1 = result;
        boolean flag1 = false;
        if(oddIndex != -1){
            result1 = result - cards[oddIndex];
            for (int i = cards.length - cnt - 1; i >= 0; i--) {
                if(cards[i] % 2 == 0){
                    result1 += cards[i];
                    flag1 = true;
                    break;
                }
            }
        } else {
            result1 = 0;
        }
        int result2 = result;
        boolean flag2 = false;
        if(evenIndex != -1){
            result2 = result - cards[evenIndex];
            for (int i = cards.length - cnt - 1; i >= 0; i--) {
                if(cards[i] % 2 == 1){
                    result2 += cards[i];
                    flag2 = true;
                    break;
                }
            }
        } else {
            result2 = 0;
        }

        if(!flag1 && !flag2){
            return 0;
        }
        return Math.max(result1, result2);
    }

    public static void main(String[] args) {
        int[] cards = new int[]{3,3,1};
        System.out.println(new MaxmiumScore_20240801().maxmiumScore(cards, 1));
    }
}
