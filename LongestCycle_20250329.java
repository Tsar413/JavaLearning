package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestCycle_20250329 {
    public int longestCycle(int[] edges) {
        Set<Integer> set = new HashSet<Integer>();
        int result = -1;
        for (int i = 0; i < edges.length; i++) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(i);
            int destination = edges[i];
            while (list.size() <= edges.length){
                if(destination == -1){
                    break;
                }
                if(set.contains(destination)){
                    break;
                }
                if(list.contains(destination)){
                    set.add(destination);
                    result = Math.max(result, list.size() - list.indexOf(destination));
                    break;
                }
                list.add(destination);
                destination = edges[destination];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] edges1 = {3, 3, 4, 2, 3};
        int[] edges2 = {1, 0};
        System.out.println(new LongestCycle_20250329().longestCycle(edges2));
    }
}
