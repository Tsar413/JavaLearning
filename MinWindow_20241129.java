package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinWindow_20241129 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            if(map1.containsKey(t.charAt(i))){
                Integer i1 = map1.get(t.charAt(i));
                i1++;
                map1.put(t.charAt(i), i1);
            } else {
                map1.put(t.charAt(i), 1);
                map2.put(t.charAt(i), 0);
            }
        }
        List<Character> list = new ArrayList<Character>(map1.keySet());
        int index1 = 0;
        int index2 = 0;
        int resultIndex1 = 0;
        int resultIndex2 = 0;
        int diff = s.length();
        boolean flag2 = false;
        while (index1 < s.length()){
            if(map2.containsKey(s.charAt(index1))){
                int count1 = map1.get(s.charAt(index1));
                int count2 = map2.get(s.charAt(index1));
                if(count1 > count2){
                    count2++;
                    map2.put(s.charAt(index1), count2);
                    boolean flag = true;
                    for (int i = 0; i < list.size(); i++) {
                        if(map2.get(list.get(i)) < map1.get(list.get(i))){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        if(index1 - index2 < diff){
                            flag2 = true;
                            diff = index1 - index2;
                            resultIndex1 = index1;
                            resultIndex2 = index2;
                        }
                    }
                    index1++;
                } else {
                    count2++;
                    map2.put(s.charAt(index1), count2);
                    boolean flag = true;
                    for (int i = 0; i < list.size(); i++) {
                        if(map2.get(list.get(i)) < map1.get(list.get(i))){
                           flag = false;
                           break;
                        }
                    }
                    if(!flag){
                        count2++;
                        map2.put(s.charAt(index1), count2);
                        index1++;
                    } else {
                        while (index2 < s.length()){
                            if(map2.containsKey(s.charAt(index2))){
                                int count3 = map1.get(s.charAt(index2));
                                int count4 = map2.get(s.charAt(index2));
                                if(count4 - 1 < count3){
                                    break;
                                } else {
                                    count4--;
                                    map2.put(s.charAt(index2), count4);
                                    index2++;
                                }
                            } else {
                                index2++;
                            }
                        }
                        if(index1 - index2 < diff){
                            flag2 = true;
                            diff = index1 - index2;
                            resultIndex1 = index1;
                            resultIndex2 = index2;
                        }
                        index1++;
                    }
                }
            } else {
                index1++;
            }
        }
        while (index2 < s.length()){
            if(map2.containsKey(s.charAt(index2))){
                int count3 = map1.get(s.charAt(index2));
                int count4 = map2.get(s.charAt(index2));
                if(count4 - 1 < count3){
                    break;
                } else {
                    count4--;
                    map2.put(s.charAt(index2), count4);
                    index2++;
                }
            } else {
                index2++;
            }
        }
        if(index1 - 1 - index2 < diff){
            flag2 = true;
            diff = index1 - index2;
            resultIndex1 = index1;
            resultIndex2 = index2;
        }
        if(!flag2){
            return "";
        }
        return s.substring(resultIndex2, resultIndex1 + 1);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String s1 = "abc";
        String t1 = "b";
        System.out.println(new MinWindow_20241129().minWindow(s1, t1));
    }
}
