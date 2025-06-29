package com.company.javaRelearn;

import java.util.*;

public class FindMaximizedCapital_20241107 {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
        for (int i = 0; i < capital.length; i++) {
            if(map.containsKey(capital[i])){
                map.get(capital[i]).add(profits[i]);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(profits[i]);
                map.put(capital[i], list);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        for (int n : list){
            Collections.sort(map.get(n));
        }
        while (k > 0){
            for (int i = 0; i < list.size(); i++) {
                if(i == 0) {
                    if(w < list.get(i)){
                        return 0;
                    }
                }
                if(w == list.get(i)){
                    List<Integer> list1 = map.get(list.get(i));
                    if(!list1.isEmpty()){
                        w += list1.get(list1.size() - 1);
                        list1.remove(list1.size() - 1);
                        map.put(list.get(i), list1);
                    }
                    break;
                } else if(w < list.get(i)){
                    List<Integer> list1 = map.get(list.get(i - 1));
                    if(!list1.isEmpty()){
                        w += list1.get(list1.size() - 1);
                        list1.remove(list1.size() - 1);
                        map.put(list.get(i - 1), list1);
                    }
                    break;
                }
                if(w > list.get(i) && i == list.size() - 1){
                    List<Integer> list1 = map.get(list.get(i));
                    if(!list1.isEmpty()){
                        w += list1.get(list1.size() - 1);
                        list1.remove(list1.size() - 1);
                        map.put(list.get(i), list1);
                    }
                    break;
                }
            }
            k--;
        }
        return w;
    }

    public static void main(String[] args) {
        int[] profits = {1, 2, 3};
        int[] capital = {0, 1, 2};
        System.out.println(new FindMaximizedCapital_20241107().findMaximizedCapital(3,0,profits,capital));
    }
}
