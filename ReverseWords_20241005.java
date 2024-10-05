package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords_20241005 {
    public String reverseWords(String s) {
        List<String> list = new ArrayList<String>();
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                if(!temp.equals("")){
                    list.add(temp);
                    temp = "";
                }
            } else {
                temp += s.charAt(i);
            }
        }
        if(!temp.equals("")){
            list.add(temp);
            temp = "";
        }
        String result = "";
        for (int i = list.size() - 1; i > 0; i--) {
            result += list.get(i);
            result += " ";
        }
        result += list.get(0);
        return result;
    }
}
