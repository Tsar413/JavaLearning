package com.company.javaRelearn;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ForEachCollections_2022_8_11 {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<String>();
        Collections.addAll(cs,"Take the long way home".split(" "));
        for(String c : cs) {
            System.out.print("'" + c + "'");
        }

    }
}
