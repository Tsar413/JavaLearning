package com.company.javaRelearn;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestCity_20241008 {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<String>();
        for (List<String> list : paths){
            set.add(list.get(1));
        }
        for (List<String> list : paths){
            set.remove(list.get(0));
        }
        return (String) set.toArray()[0];
    }
}
