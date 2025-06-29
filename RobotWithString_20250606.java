package com.company.javaRelearn;

import java.util.Stack;
import java.util.TreeMap;

public class RobotWithString_20250606 {
    public String robotWithString(String s) {
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                int t = map.get(s.charAt(i));
                t++;
                map.put(s.charAt(i), t);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if(map.firstKey() == s.charAt(i)){
                stringBuilder.append(s.charAt(i));
                if(map.get(map.firstKey()) <= 1){
                    map.remove(map.firstKey());
                    while (!stack.empty() && stack.peek() == map.firstKey()){
                        stringBuilder.append(map.firstKey());
                        stack.pop();
                        if(map.get(map.firstKey()) <= 1) {
                            map.remove(map.firstKey());
                        } else {
                            Integer i1 = map.get(map.firstKey());
                            i1--;
                            map.put(map.firstKey(), i1);
                        }
                    }
                } else {
                    Integer i1 = map.get(map.firstKey());
                    i1--;
                    map.put(map.firstKey(), i1);
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        while (!stack.empty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new RobotWithString_20250606().robotWithString("vzhofnpo"));
    }
}
