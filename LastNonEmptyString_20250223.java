package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Comparator;

public class LastNonEmptyString_20250223 {
    public String lastNonEmptyString(String s) {
        int[][] data = new int[26][3];
        for (int i = 0; i < s.length(); i++) {
            int t = s.charAt(i) - 'a';
            data[t][0]++;
            data[t][1] = i;
            data[t][2] = t;
        }
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                return o2[0] - o1[0];
            }
        });
        char c1 = (char) ((char) data[0][2] + 'a');
        String result = "" + c1;
        for (int i = 1; i < data.length; i++) {
            if(data[i][0] == data[i - 1][0]){
                result += (char) ((char) data[i][2] + 'a');
            } else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LastNonEmptyString_20250223().lastNonEmptyString("aabcbbca"));
    }
}
