package com.company.javaRelearn;

import java.util.*;

public class CountMentions_20250407 {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        Collections.sort(events, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                if(Integer.parseInt(o1.get(1)) == Integer.parseInt(o2.get(1))){
                    return o2.get(0).charAt(0) - o1.get(0).charAt(0);
                }
                return Integer.parseInt(o1.get(1)) - Integer.parseInt(o2.get(1));
            }
        });
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        for (int i = 0; i < numberOfUsers; i++) {
            map1.put(i, 0);
            map2.put(i, -1);
        }
        List<Integer> user = new ArrayList<Integer>(map1.keySet());
        for (List<String> event : events){
            for (Integer id1 : user){
                if(map2.get(id1) != -1){
                    if(Integer.parseInt(event.get(1)) >= map2.get(id1)){
                        map2.put(id1, -1);
                    }
                }
            }
            if(event.get(0).equals("MESSAGE")){
                if(event.get(2).equals("ALL")){
                    for (Integer id : user){
                        Integer i = map1.get(id);
                        i++;
                        map1.put(id, i);
                    }
                } else if(event.get(2).equals("HERE")) {
                    for (Integer id : user){
                        if(map2.get(id) == -1){
                            Integer i = map1.get(id);
                            i++;
                            map1.put(id, i);
                        }
                    }
                } else {
                    String users = event.get(2);
                    for (String user1 : users.split(" ")){
                        int i = Integer.parseInt(user1.substring(2));
                        Integer i1 = map1.get(i);
                        i1++;
                        map1.put(i, i1);
                    }
                }
            } else {
                Integer time = Integer.parseInt(event.get(1)) + 60;
                map2.put(Integer.parseInt(event.get(2)), time);
            }
        }
        return map1.values().stream()
                .mapToInt (Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(Arrays.asList("MESSAGE","10","id1 id0"), Arrays.asList("OFFLINE","11","0"), Arrays.asList("MESSAGE","71","HERE"));
        System.out.println(Arrays.toString(new CountMentions_20250407().countMentions(2, list)));
    }
}
