package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class BasketList {
    public static void main(String[] args) {
        List<String> basket = new ArrayList<String>();

        boolean addJudge1 = basket.add("apple");
        System.out.println(addJudge1);
        basket.add("banana");
        basket.add("pear");
        basket.add(2, "chili");
        System.out.println(basket);

//        初始化
        List<Integer> anthology = new ArrayList<Integer>();
//        添加自己的出生日期
        anthology.add(24);
//        添加同桌的出生日期
        anthology.add(25);
//        在位置1添加朋友的出生年份
        anthology.add(0, 2006);
//        输出
        System.out.println(anthology);
    }
}
