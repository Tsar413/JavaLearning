package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.Random;

public class RandomList_2022_9_25<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);
    public void add(T item) {
        storage.add(item);
    }
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList_2022_9_25<String> rs = new RandomList_2022_9_25<String>();
        for (String s : "The quick brown fox".split(" ")) {
            rs.add(s);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(rs.select() + " ");
        }
    }
}
