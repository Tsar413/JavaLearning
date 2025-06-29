package com.company.javaRelearn;

import java.util.*;

public class MinSetSize_20241215 {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : arr){
            if(map.containsKey(n)){
                int t = map.get(n);
                t++;
                map.put(n, t);
            } else {
                map.put(n, 1);
            }
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int index = 0;
        int sum = 0;
        while (sum < arr.length / 2){
            sum += list.get(index);
            index++;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        System.out.println(new MinSetSize_20241215().minSetSize(arr));
    }
}
