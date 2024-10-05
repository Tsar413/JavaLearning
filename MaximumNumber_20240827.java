package com.company.javaRelearn;

public class MaximumNumber_20240827 {
    public String maximumNumber(String num, int[] change) {
        String result = "";
        boolean flag = false;
        for (int i = 0; i < num.length(); i++) {
            int num1 = num.charAt(i) - '0';
            if(flag && change[num1] < num1){
                result += num.substring(i);
                return result;
            }
            if(change[num1] > num1){
                result += change[num1];
                flag = true;
            } else {
                result += num1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] change = {9, 8, 5, 0, 3, 6, 4, 2, 6, 8};
        System.out.println(new MaximumNumber_20240827().maximumNumber("132", change));
        System.out.println(Long.MAX_VALUE);
        double a = 16.23;
        double b = 13.53;
        a += b;
        System.out.printf("%.20f%n", a);
    }
}
