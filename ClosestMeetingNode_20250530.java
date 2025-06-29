package com.company.javaRelearn;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ClosestMeetingNode_20250530 {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        Map<Integer, Integer> map1 = countWay(edges, node1);
        Map<Integer, Integer> map2 = countWay(edges, node2);
        int minNode = edges.length;
        int minWay = Integer.MAX_VALUE;
        for (Integer i : map1.keySet()) {
            if(map2.containsKey(i)){
                if(minWay > map2.get(i)){
                    minWay = map2.get(i);
                    minNode = i;
                }
            }
        }
        return minNode;
    }

    private Map<Integer, Integer> countWay(int[] edges, int node){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(node, -1);
        int index = node;
        int count = 1;
        while (edges[index] != -1){
            map.put(edges[index], count);
            count++;
            index = edges[index];
        }
        return map;
    }

    public static void main(String[] args) {
        int[] edges = {4, 3, 0, 5, 3, -1};
        System.out.println(new ClosestMeetingNode_20250530().closestMeetingNode(edges, 4, 0));
    }
}
