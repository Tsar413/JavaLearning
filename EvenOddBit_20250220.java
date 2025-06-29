package com.company.javaRelearn;

import java.util.Arrays;

public class EvenOddBit_20250220 {
    public int[] evenOddBit(int n) {
        String data = Integer.toBinaryString(n);
        int even = 0;
        int odd = 0;
        int flag = 0;
        for (int i = 0; i < data.length(); i++) {
            int index = data.length() - 1 - i;
            if(flag % 2 == 0 && data.charAt(index) == '1'){
                even++;
            } else if(flag % 2 != 0 && data.charAt(index) == '1'){
                odd++;
            }
            flag++;
        }
        return new int[]{even, odd};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new EvenOddBit_20250220().evenOddBit(5)));
    }
}
