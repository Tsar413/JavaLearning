package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Hamster1 {
    String hamster = "Hamster";
}

public class LinkedListFeature_2022_8_8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Rat","Manx","Cymric","Mutt","Pug","Cymric","Pug","Manx");
        LinkedList<String> linkedList = new LinkedList<>(list);
        System.out.println(linkedList);
        System.out.println("LinkedList.getFirst(): " + linkedList.getFirst());
        System.out.println("LinkedList.element(): " + linkedList.element());
        System.out.println("LinkedList.peek()： " + linkedList.peek());
        //getFirst()和element()方法的功能完全相同，都是返回LinkedList的头。如果List为空，则会抛出异常
        //peek()在List为空的情况下，则会返回null
        System.out.println("LinkedList.remove(): " + linkedList.remove());
        System.out.println("LinkedList.removeFirst(): " + linkedList.removeFirst());
        System.out.println("LinkedList.poll(): " + linkedList.poll());
        //remove()和removeFirst()方法的功能完全相同，都是移除并返回List的头。如果List为空，则会抛出异常
        //poll()在List为空的情况下，则会返回null
        System.out.println(linkedList);
        linkedList.addFirst(new Hamster1().hamster);
        System.out.println("After LinkedList.addFirst(): " + linkedList);
        //addFirst()方法的功能在List的最前部添加元素
        linkedList.offer(new Hamster1().hamster);
        System.out.println("After LinkedList.offer(): " + linkedList);
        //offer()方法将指定元素添加至List的最后部
        linkedList.add(2,new Hamster1().hamster);
        System.out.println("After LinkedList.add(): " + linkedList);
        //add()方法可以在最后添加元素，也可以在指定的位置添加元素，后面元素统一向右移动一位
        linkedList.addLast(new Hamster1().hamster);
        System.out.println("After LinkedList.addLast(): " + linkedList);
        //addLast()方法在最后添加元素
        System.out.println("After LinkedList.removeLast(): " + linkedList.removeLast());
    }
}
