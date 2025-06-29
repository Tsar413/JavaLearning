package com.company.javaRelearn;

public class MaxOperations_20250623 {
    public int maxOperations(String s) {
        int result = 0;
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if(flag) {
                if(s.charAt(i) == '1'){
                    count++;
                } else {
                    flag = false;
                }
            } else {
                if(s.charAt(i) == '1'){
                    flag = true;
                    result += count;
                    count++;
                }
            }
        }
        if(s.charAt(s.length() - 1) == '0'){
            result += count;
        }
        return result;
    }
}
