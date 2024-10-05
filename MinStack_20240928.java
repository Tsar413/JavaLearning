package com.company.javaRelearn;

import java.util.*;

class MinStack {
    private List<Integer> list;
    private Map<Integer, List<Integer>> map;
    private int size;

    public MinStack() {
        this.list = new LinkedList<Integer>();
        this.map = new TreeMap<Integer, List<Integer>>();
        this.size = 0;
    }

    public void push(int val) {
        list.add(val);
        if(map.containsKey(val)){
            map.get(val).add(size);
        } else {
            List<Integer> list1 = new ArrayList<Integer>();
            list1.add(size);
            map.put(val, list1);
        }
        size++;
    }

    public void pop() {
        if(map.get(list.get(size - 1)).size() == 1){
            map.remove(list.get(size - 1));
        } else {
            map.get(list.get(size - 1)).remove( map.get(list.get(size - 1)).size() - 1);
        }
        list.remove(size - 1);
        size--;
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        List<Integer> list2 = new ArrayList<>(map.keySet());
        return list2.get(0);
    }
}

public class MinStack_20240928 {

}
