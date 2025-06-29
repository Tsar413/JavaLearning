package com.company.javaRelearn;

public class LargestGoodInteger_20250108 {
    public String largestGoodInteger(String num) {
        int max = -1;
        for (int i = 0; i < num.length() - 2; i++) {
            if(num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)){
                max = Math.max(max, num.charAt(i) - '0');
            }
        }
        if(max == -1){
            return "";
        }
        return String.valueOf(max) + max + max;
    }

    public static void main(String[] args) {
        System.out.println(new LargestGoodInteger_20250108().largestGoodInteger("6777133339"));
    }
}
