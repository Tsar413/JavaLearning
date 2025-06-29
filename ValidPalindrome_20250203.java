package com.company.javaRelearn;

public class ValidPalindrome_20250203 {
    public boolean validPalindrome(String s) {
        int index1 = 0;
        int index2 = s.length() - 1;
        boolean flag = true;
        while (index1 < index2){
            if(s.charAt(index1) == s.charAt(index2)){
                index1++;
                index2--;
            } else {
                if(flag){
                    if(index1 + 1 == index2 || index1 == index2 - 1){
                        return true;
                    } else if(s.charAt(index1 + 1) == s.charAt(index2) || s.charAt(index1) == s.charAt(index2 - 1)) {
                        flag = false;
                        if(s.charAt(index1 + 1) == s.charAt(index2) && s.charAt(index1 + 2) == s.charAt(index2 - 1)){
                            index1 ++;
                        } else {
                            index2 --;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new ValidPalindrome_20250203().validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
}
