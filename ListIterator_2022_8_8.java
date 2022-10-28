package com.company.javaRelearn;

import java.util.*;

public class ListIterator_2022_8_8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Rat","Manx","Cymric","Mutt","Pug","Cymric","Pug","Manx");
        ArrayList<String> list1 = new ArrayList<String>(list);
        Iterator<String> iterator = list1.iterator();
        ListIterator<String> listIterator = list1.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + ", " + listIterator.nextIndex() + ", " + listIterator.previousIndex() + ", ");
        }
        System.out.println();
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();
        Stack<String> stack = new Stack<>();
    }
}
