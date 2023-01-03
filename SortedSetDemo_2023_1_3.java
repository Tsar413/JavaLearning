package com.company.javaRelearn;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo_2023_1_3 {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<Integer>();
        Collections.addAll(sortedSet,1,2,3,4,5,6,7,8);
        System.out.println(sortedSet);
        Integer low = sortedSet.first(); //返回容器中的第一个元素
        Integer high = sortedSet.last(); //返回容器中最后一个元素
        System.out.println(low);
        System.out.println(high);
        Iterator<Integer> it = sortedSet.iterator();
        for (int i = 0; i <= 6; i++) {
            if (i == 3) low = it.next();
            if (i == 6) high = it.next();
            else it.next();
        }
        System.out.println(low);
        System.out.println(high);
        //生成元素的子集，范围[low,high)
        System.out.println(sortedSet.subSet(low,high));
        //生成元素的子集，范围[0,high)
        System.out.println(sortedSet.headSet(high));
        //生成元素的子集，范围[low,high]
        System.out.println(sortedSet.tailSet(low));
    }
}
