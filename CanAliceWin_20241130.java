package com.company.javaRelearn;

public class CanAliceWin_20241130 {
    public boolean canAliceWin(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int n : nums){
            if(n / 10 > 0){
                sum2 += n;
            } else {
                sum1 += n;
            }
        }
        return sum1 != sum2;
    }
}
