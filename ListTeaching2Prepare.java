package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class ListTeaching2Prepare {
    public static void basket(){
        //生成购物车
        List<String> basket = new ArrayList<String>();
        //添加购物车
        basket.add("apple");
        basket.add("banana");
        basket.add("pear");
        basket.add(2, "chili");
        //[apple, banana, chili, pear]

        //输出
        System.out.println(basket);
    }

    public static void anthology(){
        List<Integer> anthology = new ArrayList<Integer>();
        //自己的出生日期
        anthology.add(24);
        //同桌的出生日期
        anthology.add(25);
        //在第一个位置添加朋友的出生年份
        anthology.add(0, 2006);
        //修改同桌的出生日期，将日期改为月份

        //输出
        System.out.println(anthology);
    }

    public static void main(String[] args) {
        System.out.println("Basket:");
        basket();
        System.out.println("Anthology");
        anthology();
    }
}
