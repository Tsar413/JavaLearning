package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

class ListTeachingSub<T> {

    public List<T> makeList(Integer index, T t){
        List<T> list = new ArrayList<T>();
        list.add(t);
        list.add(index, t);
        System.out.println(list);
        list.get(index);
        list.set(index, t);
        list.remove(index);
        list.remove(t);
        return list;
    }
}

public class ListTeaching {
    public static void main(String[] args) {
        List<String> basket = new ArrayList<String>();
        basket.add("apple");
        basket.add("banana");
        basket.add("pear");
        basket.add(2, "chili");
        System.out.println(basket);
        String basketElement1 = basket.get(1);
        System.out.println(basketElement1);
        String basketElement2 = basket.get(3);
        System.out.println(basketElement2);
//        System.out.println(basket.indexOf("apple"));
//        basket.add("apple");
//        System.out.println(basket.lastIndexOf("apple"));

        boolean judge1 = basket.contains("chili");
        System.out.println(judge1);
        boolean judge2 = basket.contains("peach");
        System.out.println(judge2);
        String oldElement = basket.set(2, "peach");
        System.out.println(oldElement);
        System.out.println(basket);
        System.out.println(basket.remove(1));
        System.out.println(basket);
        System.out.println(basket.remove("apple"));
        System.out.println(basket);

//        初始化List，类型为Integer
        List<Integer> anthology = new ArrayList<Integer>();
//        添加自己的出生日期
        anthology.add(24);
//        添加同桌的出生日期
        anthology.add(25);
//        添加朋友的出生年份
        anthology.add(0, 2006);
//        输出同学录
        System.out.println(anthology);
//        索引是2，把值从25改为3
        anthology.set(2, 3);
//        输出同学录
        System.out.println(anthology);

        List<String> list = new ArrayList<String>();
        list.add("Alice");
        list.add("Tom");
        list.add(1,"Kate");
        System.out.println(list.contains("James"));
        //System.out.println(list.get(4));
        System.out.println(list);
        System.out.println(Integer.MAX_VALUE);

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(1, 3);
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(0);
        list2.add(1);
        list2.add(2);
        System.out.println(list2.get(2));

        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(24);
        list3.add(27);
        list3.add(30);
        System.out.println(list3.get(1));

        List<Integer> list4 = new ArrayList<Integer>();
        list4.add(24);
        list4.add(27);
        list4.add(30);
        //System.out.println(list4.get(3));

        List<String> list5 = new ArrayList<String>();
        list5.add("Hello");
        list5.add("World");
        list5.add("Happy");
        System.out.println(list5.contains("Wrold"));

//        List<String> list7 = new ArrayList<Integer>();
//        list7.add(3);
//        list7.add(listName);
//        System.out.println(list7.contians("World"))
//        list7.set(3, "change");
//        list7.remove(2);
//        System.out.println(list7);
    }
}
