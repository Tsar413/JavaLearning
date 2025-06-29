package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordSubsets_20250613 {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<String>();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (String word2 : words2){
            Map<Character, Integer> storageMap = new HashMap<Character, Integer>();
            for (char c : word2.toCharArray()){
                if(!storageMap.containsKey(c)){
                    storageMap.put(c, 1);
                } else {
                    int t = storageMap.get(c);
                    t++;
                    storageMap.put(c, t);
                }
            }
            for (char c : storageMap.keySet()) {
                if(!map.containsKey(c)){
                    map.put(c, storageMap.get(c));
                } else {
                    map.put(c, Math.max(map.get(c), storageMap.get(c)));
                }
            }
        }
        for (String word1 : words1){
            boolean flag = true;
            Map<Character, Integer> storageMap = new HashMap<Character, Integer>();
            for (char c : word1.toCharArray()){
                if(!storageMap.containsKey(c)){
                    storageMap.put(c, 1);
                } else {
                    int t = storageMap.get(c);
                    t++;
                    storageMap.put(c, t);
                }
            }
            for (char c : map.keySet()) {
                if(!storageMap.containsKey(c)){
                    flag = false;
                    break;
                } else {
                    if(storageMap.get(c) < map.get(c)){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                list.add(word1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words1 = {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","o"};
        System.out.println(new WordSubsets_20250613().wordSubsets(words1, words2));
    }
}
