package com.company.javaRelearn;

public class ReverseStr_20250131 {
    public String reverseStr(String s, int k) {
        String result = "";
        boolean flag = true;
        for (int i = 0; i < s.length(); i+=k) {
            if(i + k > s.length()){
                if(flag){
                    result += reverse(s.substring(i));
                    flag = false;
                } else {
                    result += s.substring(i);
                    flag = true;
                }
            } else {
                if(flag){
                    result += reverse(s.substring(i, i + k));
                    flag = false;
                } else {
                    result += s.substring(i, i + k);
                    flag = true;
                }
            }

        }
        return result;
    }

    public String reverse(String s){
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}
