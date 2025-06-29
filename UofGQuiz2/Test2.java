package com.company.javaRelearn.UofGQuiz2;

public class Test2 {
    public static String recursionEx(String s) {
        if(s.length()==1) return s;
        else{
            String small = s.substring(0,s.length()-1);
            return s.charAt(s.length() - 1) +  recursionEx(small);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursionEx("dinosaur"));
    }
}
