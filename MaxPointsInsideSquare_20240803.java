package com.company.javaRelearn;

import java.util.*;

public class MaxPointsInsideSquare_20240803 {
    public int maxPointsInsideSquare(int[][] points, String s) {
        int[] lengths = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            lengths[i] = Math.max(Math.abs(points[i][0]), Math.abs(points[i][1]));
        }
        Map<Integer, List<String>> map = new TreeMap<Integer, List<String>>();
        for (int i = 0; i < lengths.length; i++) {
            if(map.containsKey(lengths[i])){
                map.get(lengths[i]).add(String.valueOf(s.charAt(i)));
            } else {
                List<String> list = new ArrayList<String>();
                list.add(String.valueOf(s.charAt(i)));
                map.put(lengths[i], list);
            }
        }
        List<Integer> keyList = new ArrayList<Integer>(map.keySet());
        List<String> storageList = new ArrayList<String>();
        int result = 0;
        for(int key : keyList){
            List<String> list = map.get(key);
            Set<String> set = new HashSet<String>(list);
            if(set.size() < list.size()){
                return result;
            }
            for (String ss : list){
                if(!storageList.contains(ss)){
                    storageList.add(ss);
                } else {
                    return result;
                }
            }
            result += list.size();

        }
        return result;
    }
}
