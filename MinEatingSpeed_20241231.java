package com.company.javaRelearn;

import java.util.Arrays;

public class MinEatingSpeed_20241231 {
    public int minEatingSpeed(int[] piles, int h) {
        if(piles.length == 1){
            if(piles[0] % h != 0){
                return piles[0] / h + 1;
            } else {
                return piles[0] / h;
            }
        }
        Arrays.sort(piles);
        int left = piles[0];
        int right = piles[piles.length - 1];
        int result = right;
        while (left < right){
            int mid = left + right >> 1;
            int check = check(mid, piles, h);
            if(check == 1){
                result = Math.min(result, mid);
                right = mid;
            } else if(check == -1){
                left = mid + 1;
            } else {
                right = mid;
            }

        }
        return result;
    }

    private int check(int speed, int[] piles, int h){
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
            if(piles[i] % speed != 0){
                time += piles[i] / speed + 1;
            } else {
                time += piles[i] / speed;
            }
            if(time > h){
                return -1;
            }
        }
        if(time == h){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int[] piles1 = {312884470};
        int[] piles2 = {2,2};
        //System.out.println(new MinEatingSpeed_20241231().minEatingSpeed(piles, 8));
        //System.out.println(new MinEatingSpeed_20241231().minEatingSpeed(piles1, 312884469));
        System.out.println(new MinEatingSpeed_20241231().minEatingSpeed(piles2, 4));
    }
}
