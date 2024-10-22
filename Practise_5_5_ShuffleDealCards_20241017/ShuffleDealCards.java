package com.company.javaRelearn.Practise_5_5_ShuffleDealCards_20241017;

import java.util.*;

public class ShuffleDealCards {
    public List<List<String>> shuffleDealCards(){
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Map<Integer, String> data = new HashMap<Integer, String>();
        int index = 0;
        for (String suit : suits) {
            for (String number : numbers) {
                data.put(index++, suit + number);
            }
        }
        data.put(index++, "小☺");
        data.put(index++, "大☻");
        List<Integer> keyList = new ArrayList<>(data.keySet());
        Collections.shuffle(keyList);
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        List<String> list3 = new ArrayList<String>();
        List<String> listRest = new ArrayList<String>();
        int count = (keyList.size() - 3) / 3;
        int count1 = 0;
        index = 0;
        int people = 1;
        while (index < keyList.size()){
            if(count1 < count && people <= 3){
                if(people == 1){
                    list1.add(data.get(keyList.get(index)));
                    count1++;
                } else if(people == 2){
                    list2.add(data.get(keyList.get(index)));
                    count1++;
                } else if(people == 3){
                    list3.add(data.get(keyList.get(index)));
                    count1++;
                }
                index++;
            } else {
                people++;
                count1 = 0;
            }
            if(people >= 4){
                listRest.add(data.get(keyList.get(index)));
                index++;
            }
        }
        List<List<String>> result = new ArrayList<List<String>>();
        
        result.add(list1);
        result.add(list2);
        result.add(list3);
        result.add(listRest);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ShuffleDealCards().shuffleDealCards());
    }
}
