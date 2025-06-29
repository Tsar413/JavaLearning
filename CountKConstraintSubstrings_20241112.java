package com.company.javaRelearn;

public class CountKConstraintSubstrings_20241112 {
    public int countKConstraintSubstrings(String s, int k) {
        int index1 = 0;
        int index2 = 0;
        int n1 = 0;
        int n2 = 0;
        int result = 0;
        boolean flag = true;
        while (index1 < s.length()){
            if(flag){
                if(s.charAt(index1) == '1'){
                    n1++;
                } else {
                    n2++;
                }
                if(n1 <= k || n2 <= k){
                    result += (index1 - index2 + 1);
                    index1++;
                } else {
                    if(s.charAt(index1) == '1'){
                        n1--;
                    } else {
                        n2--;
                    }
                    flag = false;
                }
            } else {
                if(s.charAt(index2) == '1'){
                    n1--;
                } else {
                    n2--;
                }
                index2++;
                if(n1 <= k || n2 <= k){
                    flag = true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new CountKConstraintSubstrings_20241112().
                countKConstraintSubstrings("0001111", 2));
    }
}
