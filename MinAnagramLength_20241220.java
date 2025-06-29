package com.company.javaRelearn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinAnagramLength_20241220 {
    public int minAnagramLength(String s) {
        int length = s.length();
        for (int i = 1; i <= length; i++) {
            if(length % i == 0){
                int[] flag1 = new int[26];
                for (int j = 0; j < i; j++) {
                    flag1[s.charAt(j) - 'a']++;
                }
                boolean judge = true;
                for (int j = i; j < length; j += i) {
                    int[] flag2 = new int[26];
                    for (int k = j; k < j + i; k++) {
                        flag2[s.charAt(k) - 'a']++;
                    }
                    if(!Arrays.equals(flag1, flag2)){
                        judge = false;
                        break;
                    }
                }
                if(judge){
                    return i;
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(new MinAnagramLength_20241220().minAnagramLength("cdef"));
    }
}
