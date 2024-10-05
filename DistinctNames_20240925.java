package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctNames_20240925 {
    public long distinctNames(String[] ideas) {
        long result = 0L;
        Map<String, List<String>> map1 = new HashMap<String, List<String>>();
        Map<String, List<String>> map2 = new HashMap<String, List<String>>();
        for (String s : ideas){
            if(map1.containsKey(String.valueOf(s.charAt(0)))){
                List<String> temp = map1.get(String.valueOf(s.charAt(0)));
                temp.add(s.substring(1));
                map1.put(String.valueOf(s.charAt(0)), temp);
            } else {
                List<String> temp = new ArrayList<String>();
                temp.add(s.substring(1));
                map1.put(String.valueOf(s.charAt(0)), temp);
            }
            if(map2.containsKey(s.substring(1))){
                List<String> temp = map2.get(s.substring(1));
                temp.add(String.valueOf(s.charAt(0)));
                map2.put(s.substring(1), temp);
            } else {
                List<String> temp = new ArrayList<String>();
                temp.add(String.valueOf(s.charAt(0)));
                map2.put(s.substring(1), temp);
            }
        }
        List<String> list = new ArrayList<>(map1.keySet());
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                List<String> list1 = map1.get(list.get(i));
                List<String> list2 = map1.get(list.get(j));
                List<String> listTemp1 = new ArrayList<>(list1);
                List<String> listTemp2 = new ArrayList<>(list1);
                List<String> listTemp3 = new ArrayList<>(list2);
                listTemp1.removeAll(listTemp3);
                listTemp3.removeAll(listTemp2);
                List<String> list3 = new ArrayList<>();
                List<String> list4 = new ArrayList<>();
                for (String s : listTemp1){
                    if(!(map2.get(s).contains(list.get(i)) && map2.get(s).contains(list.get(j)))){
                        list3.add(s);
                    }
                }
                for (String s : listTemp3){
                    if(!(map2.get(s).contains(list.get(i)) && map2.get(s).contains(list.get(j)))){
                        list4.add(s);
                    }
                }
                result += (list3.size() * list4.size() * 2);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] ideas = {"coffee","donuts","time","toffee"};
        System.out.println(new DistinctNames_20240925().distinctNames(ideas));
    }
}
