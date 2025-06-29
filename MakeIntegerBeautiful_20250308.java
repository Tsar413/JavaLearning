package com.company.javaRelearn;

public class MakeIntegerBeautiful_20250308 {
    public long makeIntegerBeautiful(long n, int target) {
        long n1 = n;
        long zero = 0;
        while (n1 > 0){
            long sum = calNum(n1);
            if(sum <= target){
                for (int i = 0; i < zero; i++) {
                    n1 *= 10;
                }
                return n1 - n;
            } else {
                if(n1 % 10 == 0){
                    n1 /= 10;
                } else {
                    n1 /= 10;
                    n1++;
                }
                zero++;
            }
        }
        return 0;
    }

    private long calNum(long n){
        char[] temp = String.valueOf(n).toCharArray();
        long sum = 0;
        for (char c : temp) {
            sum += (c - '0');
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new MakeIntegerBeautiful_20250308().makeIntegerBeautiful(16, 6));
    }
}
