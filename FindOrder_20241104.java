package com.company.javaRelearn;

import java.util.*;

public class FindOrder_20241104 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if(prerequisites.length == 0){
            int[] result = new int[numCourses];
            for(int i = 0; i < result.length; i++){
                result[i] = i;
            }
            return result;
        }
        Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
        for (int i = 0; i < prerequisites.length; i++) {
            if(map.containsKey(prerequisites[i][0])){
                if(map.containsKey(prerequisites[i][1])&&map.get(prerequisites[i][1]).contains(prerequisites[i][0])){
                    return new int[0];
                }
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }
            if(!map.containsKey(prerequisites[i][0])){
                Set<Integer> set = new HashSet<Integer>();
                set.add(prerequisites[i][1]);
                map.put(prerequisites[i][0], set);
            }
            if(!map.containsKey(prerequisites[i][1])){
                map.put(prerequisites[i][1], new HashSet<Integer>());
            }
        }
        List<Integer> resultSet = new ArrayList<Integer>();
        List<Integer> keyList = new ArrayList<Integer>(map.keySet());
        while (resultSet.size() < numCourses){
            for (int n : keyList){
                if(map.get(n).isEmpty()){
                    if(!resultSet.contains(n)){
                        resultSet.add(n);
                    }
                } else {
                    if(resultSet.containsAll(map.get(n))){
                        resultSet.add(n);
                    }
                }
            }
        }
        int[] result = new int[resultSet.size()];
        List<Integer> resultList = new ArrayList<Integer>(resultSet);
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] prerequisites = {{1, 0}};
        System.out.println(Arrays.toString(new FindOrder_20241104().findOrder(3, prerequisites)));
    }
}
