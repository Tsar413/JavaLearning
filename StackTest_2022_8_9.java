package com.company.javaRelearn;

import java.util.Stack;

public class StackTest_2022_8_9 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for (String s: "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
