package com.company.javaRelearn;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class CalculateScore_20250320 {
    private static final Map<Character, Character> MAP = new HashMap<Character, Character>();

    static {
        MAP.put('a', 'z');
        MAP.put('b', 'y');
        MAP.put('c', 'x');
        MAP.put('d', 'w');
        MAP.put('e', 'v');
        MAP.put('f', 'u');
        MAP.put('g', 't');
        MAP.put('h', 's');
        MAP.put('i', 'r');
        MAP.put('j', 'q');
        MAP.put('k', 'p');
        MAP.put('l', 'o');
        MAP.put('m', 'n');
        MAP.put('n', 'm');
        MAP.put('o', 'l');
        MAP.put('p', 'k');
        MAP.put('q', 'j');
        MAP.put('r', 'i');
        MAP.put('s', 'h');
        MAP.put('t', 'g');
        MAP.put('u', 'f');
        MAP.put('v', 'e');
        MAP.put('w', 'd');
        MAP.put('x', 'c');
        MAP.put('y', 'b');
        MAP.put('z', 'a');
    }

    public long calculateScore(String s) {
        Map<Character, PriorityQueue<Integer>> map = new HashMap<Character, PriorityQueue<Integer>>();
        long result = 0;
        for (int i = 0; i < s.length(); i++) {
            char target = MAP.get(s.charAt(i));
            if(map.isEmpty()){
                PriorityQueue<Integer> queue = new PriorityQueue<Integer>((o1, o2) -> o2 - o1);
                queue.offer(i);
                map.put(target, queue);
            } else {
                if(map.containsKey(s.charAt(i))){
                    PriorityQueue<Integer> queue = map.get(s.charAt(i));
                    Integer poll = queue.poll();
                    result += (i - poll);
                    if(queue.isEmpty()){
                        map.remove(s.charAt(i));
                    } else {
                        map.put(s.charAt(i), queue);
                    }
                } else {
                    PriorityQueue<Integer> queue = new PriorityQueue<Integer>((o1, o2) -> o2 - o1);
                    queue.offer(i);
                    map.put(target, queue);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "aczzx";
        System.out.println(new CalculateScore_20250320().calculateScore(s));
    }
}
