package com.company.javaRelearn;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperations_2022_8_10 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        Collections.addAll(set,"A B C D E F".split(" "));
        set.add("M");
        System.out.println("F " + set.contains("F"));
        System.out.println("H " + set.contains("H"));
        Set<String> set2 = new HashSet<String>();
        Collections.addAll(set2,"C D E F".split(" "));
        System.out.println("set2 in set " + set.containsAll(set2));
        set.removeAll(set2);
        System.out.println("set2 removed from set " + set);
        Collections.addAll(set,"X Y Z".split(" "));
        System.out.println("'X Y Z' added to set " + set);
    }
}
