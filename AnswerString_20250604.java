package com.company.javaRelearn;

import java.util.*;

public class AnswerString_20250604 {
    public String answerString(String word, int numFriends) {
        if(numFriends == 1){
            return word;
        }
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < word.length(); i++) {
            if(!map.containsKey(word.charAt(i))){
                map.put(word.charAt(i), i);
            }
        }
        int index = map.get(map.firstKey());
        if(index == 0){
            return word.substring(0, word.length() - numFriends + 1);
        } else {
            if(numFriends >= word.length()){
                return String.valueOf(word.charAt(index));
            }
            if(index >= numFriends - 1){
                return word.substring(index);
            } else {
                return word.substring(index, word.length() - numFriends + index + 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new AnswerString_20250604().answerString("ajbd", 3));
    }
}
