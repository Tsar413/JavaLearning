package com.company.javaRelearn;

import java.util.*;

public class New_2022_9_28 {
    public static <K, V>Map<K, V> map() {
        return new HashMap<K, V>();
    }

    public static <T>List<T> list() {
        return new ArrayList<T>();
    }

    public static <T>LinkedList<T> lList() {
        return new LinkedList<T>();
    }

    public static <T>Set<T> set() {
        return new HashSet<T>();
    }

    public static <T>Queue<T> queue() {
        return new LinkedList<T>();
    }

    public static void main(String[] args) {
        Map<String, List<String>> sls = New_2022_9_28.map();
        List<String> ls = New_2022_9_28.list();
        LinkedList<String> lls = New_2022_9_28.lList();
        Set<String> ss = New_2022_9_28.set();
        Queue<String> qs = New_2022_9_28.queue();
    }
}
