package com.company.javaRelearn;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class RandomizedSet {
    private Set<Integer> set;

    public RandomizedSet() {
        this.set = new HashSet<Integer>();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        Object[] objects = set.toArray();
        Random random = new Random();
        return (int) objects[random.nextInt(set.size())];
    }
}

public class RandomizedSet_20240923 {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        System.out.println(obj.insert(1));
        System.out.println(obj.remove(2));
        System.out.println(obj.insert(2));
        System.out.println(obj.getRandom());
        System.out.println(obj.remove(1));
        System.out.println(obj.insert(2));
        System.out.println(obj.getRandom());
    }

}
