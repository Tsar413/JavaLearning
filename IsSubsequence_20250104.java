package com.company.javaRelearn;

public class IsSubsequence_20250104 {
    public boolean isSubsequence(String s, String t) {
        int index1 = 0;
        if(s.isEmpty() && !t.isEmpty()){
            return true;
        }
        if(!s.isEmpty()){
            for (int i = 0; i < t.length(); i++) {
                if(t.charAt(i) == s.charAt(index1)){
                    index1++;
                }
                if(index1 == s.length()){
                    return true;
                }
            }
        }
        return false;
    }
}
