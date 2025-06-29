package com.company.javaRelearn;

public class DivideString_20250622 {
    public String[] divideString(String s, int k, char fill) {
        int size = 0;
        if(s.length() % k == 0){
            size = s.length() / k;
            String[] result = new String[size];
            for (int i = 0; i < result.length; i++) {
                result[i] = s.substring(i * k, i * k + k);
            }
            return result;
        } else {
            size = s.length() / k + 1;
            String[] result = new String[size];
            for (int i = 0; i < result.length; i++) {
                if(i < result.length - 1){
                    result[i] = s.substring(i * k, i * k + k);
                } else {
                    result[i] = s.substring(i * k);
                    int add = k - result[i].length();
                    for (int j = 0; j < add; j++) {
                        result[i] += fill;
                    }
                }
            }
            return result;
        }
    }
}
