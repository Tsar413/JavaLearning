package com.company.javaRelearn;

import java.util.Stack;

public class ClearDigits_20240905 {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        String result = "";
        for (Character c : stack){
            result += c;
        }
        return result;
    }
}
