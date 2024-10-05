package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class CanBeValid_20240902 {
    public boolean canBeValid(String s, String locked) {
        int count = 0;
        List<Integer> positiveIndex = new ArrayList<Integer>();
        List<Integer> negativeIndex = new ArrayList<Integer>();
        List<Integer> specialIndex = new ArrayList<Integer>();
        for (int i = 0; i < locked.length(); i++) {
            if(locked.charAt(i) == '1'){
                count++;
                specialIndex.add(i);
                if(s.charAt(i) == '('){
                    positiveIndex.add(i);
                } else {
                    if(positiveIndex.size() != 0){
                        positiveIndex.remove(positiveIndex.size() - 1);
                    } else {
                        negativeIndex.add(i);
                    }
                }
            }
        }
        if(positiveIndex.size() == 0 && negativeIndex.size() == 0){
            count = s.length() - count;
            if(count % 2 == 0){
                return true;
            } else {
                return false;
            }
        } else {
            if(negativeIndex.size() != 0){
                int last = negativeIndex.get(negativeIndex.size() - 1) + 1;
                if(negativeIndex.size() * 2 > last){
                    return false;
                } else {
                    count += negativeIndex.size() * 2;
                }
            }
            if(positiveIndex.size() != 0){
                int index = 0;
                int i = 0;
                boolean flag = true;
                int judge = 0;
                while (index < s.length()){
                    if(flag){
                        index = positiveIndex.get(i);
                        flag = false;
                    } else {
                        index++;
                        if(!specialIndex.contains(index)){
                            flag = true;
                            count++;
                            judge++;
                            i++;
                        }
                    }
                }
                if(judge < positiveIndex.size()){
                    return false;
                }
            }
            count = s.length() - count;
            if(count % 2 == 0){
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        String s = "())(()(()(())()())(())((())(()())((())))))(((((((())(()))))(";
        String locked = "100011110110011011010111100111011101111110000101001101001111";
        System.out.println(new CanBeValid_20240902().canBeValid(s, locked));
    }
}
