package com.company.javaRelearn;

import java.util.*;

public class FullJustify_20241002 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        int length = 0;
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() + count + length > maxWidth){
                map.put(i - 1, length + count - 1);
                length = words[i].length();
                count = 1;
            } else {
                length += words[i].length();
                count++;
            }
        }
        map.put(words.length - 1, length - 1);
        System.out.println(map);
        List<Integer> keyList = new ArrayList<>(map.keySet());
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < keyList.size(); i++) {
            String temp = "";
            int tempLength = map.get(keyList.get(i));
            int diff = 0;
            int mod = 0;
            if(i == 0){
                if(keyList.get(i) == 0){
                    temp += words[0];
                    for (int j = 0; j < maxWidth - words[0].length(); j++) {
                        temp += " ";
                    }
                } else {
                    diff = (maxWidth - tempLength) / keyList.get(i);
                    mod = (maxWidth - tempLength) % keyList.get(i);
                    for (int j = 0; j < keyList.get(i); j++) {
                        temp += words[j];
                        temp += " ";
                        for (int k = 0; k < diff; k++) {
                            temp += " ";
                        }
                        if(mod > 0){
                            temp += " ";
                            mod--;
                        }
                    }
                    temp += words[keyList.get(i)];
                }
                result.add(temp);
            } else if(i < keyList.size() - 1){
                if(keyList.get(i) - keyList.get(i - 1) == 1){
                    temp += words[keyList.get(i)];
                    for (int j = 0; j < maxWidth - words[keyList.get(i)].length(); j++) {
                        temp += " ";
                    }
                } else {
                    diff = (maxWidth - tempLength) / (keyList.get(i) - keyList.get(i - 1) - 1);
                    mod = (maxWidth - tempLength) % (keyList.get(i) - keyList.get(i - 1) - 1);
                    for (int j = keyList.get(i - 1) + 1; j < keyList.get(i); j++) {
                        temp += words[j];
                        temp += " ";
                        for (int k = 0; k < diff; k++) {
                            temp += " ";
                        }
                        if(mod > 0){
                            temp += " ";
                            mod--;
                        }
                    }
                    temp += words[keyList.get(i)];
                }
                result.add(temp);
            } else {
                for (int j = keyList.get(i - 1) + 1; j < keyList.get(i); j++) {
                    temp += words[j];
                    temp += " ";
                }
                temp += words[keyList.get(i)];
                int rest = maxWidth - temp.length();
                for (int j = 0; j < rest; j++) {
                    temp += " ";
                }
                result.add(temp);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"Listen","to","many,","speak","to","a","few."};
        System.out.println(new FullJustify_20241002().fullJustify(words, 6));
    }
}
