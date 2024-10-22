package com.company.javaRelearn.Practise_4_5_StringBinaryConversion_20241015;

public class StringBinaryConversion {
    public String stringBinaryConversion(String s){
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int t = (int) s.charAt(i);
            String binaryString = Integer.toBinaryString(t);
            String temp = "";
            if(binaryString.length() < 8){
                for (int j = 0; j < 8 - binaryString.length(); j++) {
                    temp += "0";
                }
                result += temp;
            }
            result += binaryString;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "dsa33";
        System.out.println(new StringBinaryConversion().stringBinaryConversion(s));
    }
}
