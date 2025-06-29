package com.company.javaRelearn;

public class GenerateKey_20250111 {
    public int generateKey(int num1, int num2, int num3) {
        String result = "";
        String numString1 = String.valueOf(num1);
        String numString2 = String.valueOf(num2);
        String numString3 = String.valueOf(num3);
        int length = Math.max(numString1.length(), Math.max(numString2.length(), numString3.length()));
        String threeZero = "000";
        String twoZero = "00";
        String oneZero = "0";
        if(numString1.length() < length){
            if(length - numString1.length() == 3){
                numString1 = threeZero + numString1;
            } else if(length - numString1.length() == 2){
                numString1 = twoZero + numString1;
            } else {
                numString1 = oneZero + numString1;
            }
        }
        if(numString2.length() < length){
            if(length - numString2.length() == 3){
                numString2 = threeZero + numString2;
            } else if(length - numString2.length() == 2){
                numString2 = twoZero + numString2;
            } else {
                numString2 = oneZero + numString2;
            }
        }
        if(numString3.length() < length){
            if(length - numString3.length() == 3){
                numString3 = threeZero + numString3;
            } else if(length - numString3.length() == 2){
                numString3 = twoZero + numString3;
            } else {
                numString3 = oneZero + numString3;
            }
        }
        for (int i = 0; i < length; i++) {
            int t1 = numString1.charAt(i) - '0';
            int t2 = numString2.charAt(i) - '0';
            int t3 = numString3.charAt(i) - '0';
            int t = Math.min(t1, Math.min(t2, t3));
            result += t;
        }
        return Integer.parseInt(result);
    }
}
