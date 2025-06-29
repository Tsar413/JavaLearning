package com.company.javaRelearn;

import java.util.*;

class StockPrice {

    private Map<Integer, Integer> map1;
    private Map<Integer, List<Integer>> map2;

    public StockPrice() {
        map1 = new TreeMap<>();
        map2 = new TreeMap<>();
    }

    public void update(int timestamp, int price) {
        if(!map1.containsKey(timestamp)){
            map1.put(timestamp, price);
            if(!map2.containsKey(price)){
                List<Integer> list1 = new ArrayList<Integer>();
                list1.add(timestamp);
                map2.put(price, list1);
            } else {
                List<Integer> list1 = map2.get(price);
                list1.add(timestamp);
                map2.put(price, list1);
            }
        } else {
            int before = map1.get(timestamp);
            map1.put(timestamp, price);
            List<Integer> list1 = map2.get(before);
            if(list1.size() == 1){
                map2.remove(before);
            } else {
                list1.remove(list1.indexOf(timestamp));
                map2.put(before, list1);
            }
            List<Integer> list3;
            if(!map2.containsKey(price)){
                list3 = new ArrayList<Integer>();
            } else {
                list3 = map2.get(price);
            }
            list3.add(timestamp);
            map2.put(price, list3);
        }
    }

    public int current() {
        return map1.get(new ArrayList<Integer>(map1.keySet()).get(new ArrayList<Integer>(map1.keySet()).size() - 1));
    }

    public int maximum() {
        return new ArrayList<Integer>(map2.keySet()).get(new ArrayList<Integer>(map2.keySet()).size() - 1);
    }

    public int minimum() {
        return new ArrayList<Integer>(map2.keySet()).get(0);
    }
}

public class StockPrice_20250602 {
}
