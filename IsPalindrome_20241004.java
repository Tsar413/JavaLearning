package com.company.javaRelearn;

public class IsPalindrome_20241004 {
    public boolean isPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                result += s.toLowerCase().charAt(i);
            }
            if(Character.isDigit(s.charAt(i))){
                result += s.charAt(i);
            }
        }
        int index1 = 0;
        int index2 = result.length() - 1;
        while (index1 < result.length() && index2 >= 0){
            if(result.charAt(index1) != result.charAt(index2)){
                return false;
            }
            index1++;
            index2--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "v' 5:UxU:5 v'";
        System.out.println(new IsPalindrome_20241004().isPalindrome(s));
    }
}
