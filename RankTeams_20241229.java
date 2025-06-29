package com.company.javaRelearn;

import java.util.*;

public class RankTeams_20241229 {
    public String rankTeams(String[] votes) {
        Map<Character, int[]> map1 = new HashMap<Character, int[]>();
        for (int i = 0; i < votes.length; i++) {
            String s = votes[i];
            for (int j = 0; j < s.length(); j++) {
                if(!map1.containsKey(s.charAt(j))){
                    int[] array = new int[s.length()];
                    array[j] = 1;
                    map1.put(s.charAt(j), array);
                } else {
                    int[] array = map1.get(s.charAt(j));
                    array[j]++;
                    map1.put(s.charAt(j), array);
                }
            }
        }
        Map<int[], Set<String>> map2 = new TreeMap<int[], Set<String>>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                for (int i = 0; i < o1.length; i++) {
                    if(o1[i] != o2[i]){
                        return o2[i] - o1[i];
                    }
                }
                return 0;
            }
        });
        for (Map.Entry<Character, int[]> entry : map1.entrySet()) {
            if(!map2.containsKey(entry.getValue())){
                Set<String> set = new TreeSet<String>();
                set.add(String.valueOf(entry.getKey()));
                map2.put(entry.getValue(), set);
            } else {
                Set<String> set = map2.get(entry.getValue());
                set.add(String.valueOf(entry.getKey()));
                map2.put(entry.getValue(), set);
            }
        }
        String result = "";
        for (Set<String> value : map2.values()) {
            for (String s : value) {
                result += s;
            }
        }
        return result;
    }
}
