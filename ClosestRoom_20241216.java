package com.company.javaRelearn;

import java.util.*;

public class ClosestRoom_20241216 {
    public int[] closestRoom(int[][] rooms, int[][] queries) {
        Arrays.sort(rooms, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        Set<Integer> set = new TreeSet<Integer>();
        int[] resultTemp = new int[queries.length];
        Arrays.fill(resultTemp, -1);
        int[][] queriesTemp = new int[queries.length][2];
        for (int i = 0; i < queries.length; i++) {
            queriesTemp[i][0] = queries[i][0];
            queriesTemp[i][1] = queries[i][1];
        }
        Arrays.sort(queriesTemp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int index = 0;
        for (int i = 0; i < queriesTemp.length; i++) {
            for (int j = index; j < rooms.length; j++) {
                if(rooms[j][1] < queriesTemp[i][1]){
                    index++;
                } else {
                    set.add(rooms[j][0]);
                }
            }
            List<Integer> list1 = new ArrayList<Integer>(set);
            int betweenIndexRight = binarySearch(queriesTemp[i][0], list1);
            if(betweenIndexRight == - 1){
                continue;
            } else {
                if(betweenIndexRight == 0){
                    resultTemp[i] = list1.get(0);
                } else {
                    if(queriesTemp[i][0] - list1.get(betweenIndexRight - 1) <= list1.get(betweenIndexRight) - queriesTemp[i][0]){
                        resultTemp[i] = list1.get(betweenIndexRight - 1);
                    } else {
                        resultTemp[i] = list1.get(betweenIndexRight);
                    }
                }
            }
            set.clear();
        }
        Map<int[], Integer> map = new HashMap<int[], Integer>();
        for (int i = 0; i < resultTemp.length; i++) {
            map.put(new int[]{queriesTemp[i][0], queriesTemp[i][1]}, resultTemp[i]);
        }
        int[] result = new int[queries.length];
        List<int[]> keyList = new ArrayList<int[]>(map.keySet());
        for (int i = 0; i < queries.length; i++) {
            for (int[] ints : keyList) {
                if (ints[0] == queries[i][0] && ints[1] == queries[i][1]) {
                    result[i] = map.get(ints);
                }
            }
        }
        return result;
    }

    private int binarySearch(int target, List<Integer> list){
        int left = 0;
        int right = list.size() - 1;
        while (left < right){
            int mid = left + right >> 1;
            if(list.get(mid) < target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
//        int[][] rooms = {{1, 4}, {2, 3}, {3, 5}, {4, 1}, {5, 2}};
//        int[][] queries = {{2, 3}, {2, 4}, {2, 5}};
        int[][] rooms1 = {{2,2},{1,2},{3,2}};
        int[][] queries1 = {{3,1},{3,3},{5,2}};
//        System.out.println(Arrays.toString(new ClosestRoom_20241216().closestRoom(rooms, queries)));
        System.out.println(Arrays.toString(new ClosestRoom_20241216().closestRoom(rooms1, queries1)));
    }
}
