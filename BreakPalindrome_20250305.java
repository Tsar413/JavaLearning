package com.company.javaRelearn;

public class BreakPalindrome_20250305 {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() == 1){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < palindrome.length() / 2; i++) {
            if(palindrome.charAt(i) != 'a'){
                stringBuilder.append(palindrome, 0, i);
                stringBuilder.append("a");
                stringBuilder.append(palindrome.substring(i + 1));
                return stringBuilder.toString();
            }
        }
        stringBuilder.append(palindrome, 0, palindrome.length() - 1);
        stringBuilder.append("b");
        return stringBuilder.toString();
    }
}
