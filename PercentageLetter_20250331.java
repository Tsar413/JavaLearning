package com.company.javaRelearn;

public class PercentageLetter_20250331 {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == letter){
                count++;
            }
        }
        return count * 100 / s.length();
    }
}
