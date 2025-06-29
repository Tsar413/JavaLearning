package com.company.javaRelearn;

import java.util.Stack;

public class DecodeString_20241031 {
    private int index = 0;
    private String s;

    public String decodeString(String s) {
        this.s = s;

        return recursiveCore(true);
    }

    private String recursiveCore(boolean flag3){
        int num = 0;
        String temp = "";
        boolean flag = true;
        boolean flag2 = false;
        String result = "";
        while (index < s.length()){
            if(s.charAt(index) == '['){
                flag = false;
            }
            if(flag && Character.isDigit(s.charAt(index))){
                num = (int) s.charAt(index) - '0';
                flag = false;

            } else if(!flag && Character.isDigit(s.charAt(index))){
                temp += recursiveCore(false);
            } else {
                if(flag2){
                    if(s.charAt(index) == ']'){
                        for (int j = 0; j < num; j++) {
                            result += temp;
                        }
                        temp = "";
                        flag = true;
                        flag2 = false;
                        num = 0;
                        if(!flag3){
                            return result;
                        }
                    } else {
                        temp += String.valueOf(s.charAt(index));
                    }
                } else {
                    if(s.charAt(index) == '['){
                        flag2 = true;
                    }
                }

            }
            if(num == 0 && s.charAt(index) != ']'){
                result += s.charAt(index);
            }
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new DecodeString_20241031().decodeString("100[leetcode]"));
    }
}
