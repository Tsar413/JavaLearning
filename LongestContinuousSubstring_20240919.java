package com.company.javaRelearn;

public class LongestContinuousSubstring_20240919 {
    public int longestContinuousSubstring(String s) {
        int result = 0;
        int temp = 1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) - s.charAt(i - 1) == 1){
                temp++;
            } else {
                result = Math.max(result, temp);
                temp = 1;
            }
        }
        result = Math.max(result, temp);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LongestContinuousSubstring_20240919().
                longestContinuousSubstring("abcde"));
    }
}
