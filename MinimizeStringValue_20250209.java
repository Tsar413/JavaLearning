package com.company.javaRelearn;

import java.util.*;

public class MinimizeStringValue_20250209 {
    public String minimizeStringValue(String s) {
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < 26; i++) {
            map.put((char) (i + 'a'), 0);
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '?'){
                int t = map.get(s.charAt(i));
                t++;
                map.put(s.charAt(i), t);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            queue.offer(new int[]{entry.getKey() - 'a', entry.getValue()});
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '?'){
                result += s.charAt(i);
            } else {
                int[] poll = queue.poll();
                result += (char)(poll[0] + 'a');
                queue.offer(new int[]{poll[0], poll[1] + 1});
            }
        }
        while (!queue.isEmpty()){
            int[] poll = queue.poll();
            System.out.print("[" + poll[0] + " " + poll[1] + "] ");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MinimizeStringValue_20250209().minimizeStringValue("???"));
    }
}
