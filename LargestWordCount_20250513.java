package com.company.javaRelearn;

import java.util.*;

public class LargestWordCount_20250513 {
    public String largestWordCount(String[] messages, String[] senders) {
        List<Map.Entry<String, Integer>> list = getEntries(messages, senders);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(Objects.equals(o1.getValue(), o2.getValue())){
                    return o2.getKey().compareTo(o1.getKey());
                }
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        return list.get(0).getKey();
    }

    private static List<Map.Entry<String, Integer>> getEntries(String[] messages, String[] senders) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < senders.length; i++) {
            if(map.containsKey(senders[i])){
                int t = map.get(senders[i]);
                t += messages[i].split(" ").length;
                map.put(senders[i], t);
            } else {
                map.put(senders[i], messages[i].split(" ").length);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        return list;
    }
}
