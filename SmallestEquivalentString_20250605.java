package com.company.javaRelearn;

import java.util.*;

public class SmallestEquivalentString_20250605 {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        List<Set<Character>> lists = new ArrayList<Set<Character>>();
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < s1.length(); i++) {
            if(!set.contains(s1.charAt(i)) && !set.contains(s2.charAt(i))){
                Set<Character> set1 = new HashSet<Character>();
                set1.add(s1.charAt(i));
                set1.add(s2.charAt(i));
                lists.add(set1);
                set.add(s1.charAt(i));
                set.add(s2.charAt(i));
            } else {
                for (Set<Character> set2 : lists){
                    if(set2.contains(s1.charAt(i)) || set2.contains(s2.charAt(i))){
                        set2.add(s1.charAt(i));
                        set2.add(s2.charAt(i));
                    }
                }
                set.add(s1.charAt(i));
                set.add(s2.charAt(i));
            }
        }
        Map<Character, Character> map = new HashMap<Character, Character>();
        for (Set<Character> set1 : lists){
            Character minChar = Collections.min(set1, Character::compare);
            for (char c : set1){
                if(map.containsKey(c)){
                    if(map.get(c) > minChar){
                        map.put(c, minChar);
                    }
                } else {
                    map.put(c, minChar);
                }
            }
        }
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            if(map.containsKey(entry.getValue())){
                map.put(entry.getKey(), map.get(entry.getValue()));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < baseStr.length(); i++) {
            if(map.containsKey(baseStr.charAt(i))){
                stringBuilder.append(map.get(baseStr.charAt(i)));
            } else {
                stringBuilder.append(baseStr.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s1 = "gmerjboftfnqseogigpdnlocmmhskigdtednfnjtlcrdpcjkbj";
        String s2 = "fnnafafhqkitbcdlkpiloiienikjiikdfcafisejgeldprcmhd";
        String baseStr = "ezrqfyguivmybqcsvibuvtajdvamcdjpmgcbvieegpyzdcypcx";
        System.out.println(new SmallestEquivalentString_20250605().smallestEquivalentString(s1, s2, baseStr));
    }
}
