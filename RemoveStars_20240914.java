package com.company.javaRelearn;

import java.util.Stack;

public class RemoveStars_20240914 {
    public String removeStars(String s) {
        String result = "";
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*'){
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        for (Character c : stack){
            result += c;
        }
        return result;
    }
}
