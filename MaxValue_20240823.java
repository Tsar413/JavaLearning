package com.company.javaRelearn;

public class MaxValue_20240823 {
    public String maxValue(String n, int x) {
        if(n.charAt(0) != '-'){
            String[] data = n.split("");
            for (int i = 0; i < data.length; i++) {
                int position = Integer.parseInt(data[i]);
                if(x > position){
                    return n.substring(0, i) + x + n.substring(i);
                }
            }
            return n + x;
        } else {
            String[] data = n.split("");
            for (int i = 1; i < data.length; i++) {
                int position = Integer.parseInt(data[i]);
                if(x < position){
                    return n.substring(0, i) + x + n.substring(i);
                }
            }
            return n + x;
        }
    }
}
