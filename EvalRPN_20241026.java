package com.company.javaRelearn;

import java.util.Stack;

public class EvalRPN_20241026 {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();
        int result = 0;
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int n2 = Integer.parseInt(stack.pop());
                int n1 = Integer.parseInt(stack.pop());
                int t = 0;
                if (s.equals("+")) {
                    t = n1 + n2;
                } else if (s.equals("-")) {
                    t = n1 - n2;
                } else if (s.equals("*")) {
                    t = n1 * n2;
                } else {
                    t = n1 / n2;
                }
                stack.push(t + "");
            } else {
                stack.push(s);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        String[] tokens1 = {"3","11","+","5","-"};
        System.out.println(new EvalRPN_20241026().evalRPN(tokens1));
    }
}
