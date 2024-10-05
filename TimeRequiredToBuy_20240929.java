package com.company.javaRelearn;

import java.util.*;

public class TimeRequiredToBuy_20240929 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Map<Integer, Integer> map1 = new TreeMap<Integer, Integer>();
        Map<Integer, List<Integer>> map2 = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < tickets.length; i++) {
            if(tickets[i] <= tickets[k]){
                if(map1.containsKey(tickets[i])){
                    int t = map1.get(tickets[i]);
                    t++;
                    map1.put(tickets[i], t);
                } else {
                    map1.put(tickets[i], 1);
                }
            }
            if(tickets[i] == tickets[k]){
                if(map2.containsKey(tickets[i])){
                    map2.get(tickets[i]).add(i);
                } else {
                    List<Integer> list2 = new ArrayList<Integer>();
                    list2.add(i);
                    map2.put(tickets[i], list2);
                }
            }
        }
        List<Integer> list = new ArrayList<Integer>(map1.keySet());
        int n = tickets.length;
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            if(i == 0){
                result += list.get(i) * n;
                n -= (map1.get(list.get(i)));
            } else  {
                result += (list.get(i) - list.get(i - 1)) * n;
                n -= (map1.get(list.get(i)));
            }
        }
        List<Integer> list3 = map2.get(tickets[k]);
        int temp = 0;
        for (int i = 0; i < list3.size(); i++) {
            if(list3.get(i) <= k){
                temp++;
            } else {
                break;
            }
        }
        result -= (list3.size() - temp);
        return result;
    }

    public static void main(String[] args) {
        int[] tickets = {84,49,5,24,70,77,87,8};
        System.out.println(new TimeRequiredToBuy_20240929().timeRequiredToBuy(tickets, 3));
    }
}
