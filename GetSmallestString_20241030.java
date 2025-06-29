package com.company.javaRelearn;

public class GetSmallestString_20241030 {
    public String getSmallestString(String s) {
        String result = "";
        int index = -1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) % 2 == s.charAt(i - 1) % 2){
                if((int) s.charAt(i) < (int) s.charAt(i - 1)){
                    result += s.charAt(i);
                    result += s.charAt(i - 1);
                    index = i;
                    break;
                }
            }
        }
        if(index != -1){
            if(index >= 2){
                result = s.substring(0, index - 1) + result;
            }
            result += s.substring(index + 1);
            return result;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(new GetSmallestString_20241030().getSmallestString("001"));
    }
}
