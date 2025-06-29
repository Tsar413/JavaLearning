package com.company.javaRelearn;

import java.util.*;

class FoodRatings {
    private Map<String, String[]> map;
    private Map<String, PriorityQueue<String[]>> queue;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        this.map = new HashMap<String, String[]>();
        this.queue = new HashMap<String, PriorityQueue<String[]>>();
        for (int i = 0; i < foods.length; i++) {
            this.map.put(foods[i], new String[]{cuisines[i], String.valueOf(ratings[i])});
        }
        for (int i = 0; i < cuisines.length; i++) {
            if(this.queue.containsKey(cuisines[i])){
                PriorityQueue<String[]> queue1 = this.queue.get(cuisines[i]);
                queue1.offer(new String[]{foods[i], String.valueOf(ratings[i])});
                this.queue.put(cuisines[i], queue1);
            } else {
                PriorityQueue<String[]> queue1 = new PriorityQueue<String[]>(new Comparator<String[]>() {
                    @Override
                    public int compare(String[] o1, String[] o2) {
                        if(o1[1].equals(o2[1])){
                            String temp1 = o1[0];
                            String temp2 = o2[0];
                            if(temp1.length() >= temp2.length()){
                                for (int j = 0; j < temp2.length(); j++) {
                                    if(temp2.charAt(j) != temp1.charAt(j)){
                                        return temp2.charAt(j) - temp1.charAt(j);
                                    }
                                }
                            } else {
                                for (int j = 0; j < temp1.length(); j++) {
                                    if(temp2.charAt(j) != temp1.charAt(j)){
                                        return temp1.charAt(j) - temp2.charAt(j);
                                    }
                                }
                            }
                        } else {
                            return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                        }
                        return 0;
                    }
                });
                queue1.offer(new String[]{foods[i], String.valueOf(ratings[i])});
                this.queue.put(cuisines[i], queue1);
            }
        }
    }

    public void changeRating(String food, int newRating) {
        String[] strings = this.map.get(food);
        this.map.put(food, new String[]{strings[0], String.valueOf(newRating)});
        PriorityQueue<String[]> strings1 = this.queue.get(strings[0]);
        // strings1.remove();
    }

    public String highestRated(String cuisine) {

        return null;
    }
}

public class FoodRatings_20250228 {
}
