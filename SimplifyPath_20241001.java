package com.company.javaRelearn;

import java.util.Stack;

public class SimplifyPath_20241001 {
    public String simplifyPath(String path) {
        String[] data = path.split("/");
        Stack<String> stack = new Stack<String>();
        for (String s : data){
            if(s.equals("") || s.equals(".")){

            } else if(s.equals("..")){
                if(stack.size() != 0){
                    stack.pop();
                }
            } else {
                stack.push(s);
            }
        }
        String result = "";
        for (String s : stack){
            result += "/";
            result += s;
        }
        return result;
    }
}
