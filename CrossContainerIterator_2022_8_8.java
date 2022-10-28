package com.company.javaRelearn;

import java.util.*;

public class CrossContainerIterator_2022_8_8 {
    public static void display(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            String p = iterator.next();
            System.out.print(p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Rat","Manx","Cymric","Mutt","Pug","Cymric","Pug","Manx");
        ArrayList<String> list1 = new ArrayList<String>(list);
        LinkedList<String> linkedList = new LinkedList<String>(list1);
        HashSet<String> hashSet = new HashSet<String>(list1);
        TreeSet<String> treeSet = new TreeSet<String>(list1);
        display(list1.iterator());
        display(linkedList.iterator());
        display(hashSet.iterator());
        display(treeSet.iterator());
    }
}
