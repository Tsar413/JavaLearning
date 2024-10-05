package com.company.javaRelearn;

import java.util.Arrays;

public class MinPartitions_20240820 {
    public int minPartitions(String n) {
        String[] data = n.split("");
        Arrays.sort(data);
        int result = 0;
        for (int i = 0; i < data.length; i++) {
            if(i == 0 && !data[i].equals("0")){
                result += Integer.parseInt(data[i]);
            } else if(i > 0) {
                if(data[i - 1].equals("0") && data[i].equals("0")){
                    continue;
                } else if(data[i - 1].equals("0") && !data[i].equals("0")) {
                    result += Integer.parseInt(data[i]);
                } else {
                    result += (Integer.parseInt(data[i]) - Integer.parseInt(data[i - 1]));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String n = "27346209830709182346";
        System.out.println(new MinPartitions_20240820().minPartitions(n));
    }
}
