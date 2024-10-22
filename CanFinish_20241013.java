package com.company.javaRelearn;

import java.util.*;

public class CanFinish_20241013 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Set<Integer> set = new HashSet<Integer>();
        Map<Integer, List<Integer>> map1 = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < prerequisites.length; i++) {
            if(map1.containsKey(prerequisites[i][0])){
                map1.get(prerequisites[i][0]).add(prerequisites[i][1]);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(prerequisites[i][1]);
                map1.put(prerequisites[i][0], list);
            }
            if(map1.containsKey(prerequisites[i][1])){
                if(map1.get(prerequisites[i][1]).contains(prerequisites[i][0])){
                    return false;
                }
            }
            set.add(prerequisites[i][0]);
            set.add(prerequisites[i][1]);
        }
//        if(set.size() != numCourses){
//            return false;
//        }
        return true;
    }

    public static void main(String[] args) {
        int[][] prerequisites = {{1, 0}, {0, 2}, {2, 1}};
        System.out.println(new CanFinish_20241013().canFinish(3, prerequisites));
    }
}
