package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Utilities_2023_2_1 {
    static List<String> list = Arrays.asList(
            "One Two Three Four Five Six Seven".split(" "));

    public static void main(String[] args) {
        System.out.println(list);
        //disjoint()目标在于查找并集，singletonList()只能存放唯一元素的List
        System.out.println("'list' disjoint (Four)?: " +
                Collections.disjoint(list, Collections.singletonList("Four")));
        System.out.println("max: " + Collections.max(list));
        System.out.println("min: " + Collections.min(list));
        System.out.println("max w/ comparator: " +
                Collections.max(list,String.CASE_INSENSITIVE_ORDER));
        System.out.println("min w/ comparator: " +
                Collections.min(list,String.CASE_INSENSITIVE_ORDER));
        List<String> subList = Arrays.asList("Four Five Six".split(" "));
        System.out.println("indexOfSubList: " +
                Collections.indexOfSubList(list,subList));
        System.out.println("lastIndexOfSubList: " +
                Collections.lastIndexOfSubList(list,subList));
        Collections.replaceAll(list, "One", "Yo");
        System.out.println("replaceAll: " + list);
        //reverse()实现Collections的反转
        Collections.reverse(list);
        System.out.println("reverse: " + list);
        //rotate()实现Collections部分位数的右向移动
        Collections.rotate(list,3);
        System.out.println("rotate: " + list);
        List<String> source = Arrays.asList("in the matrix".split(" "));
        //copy()方法如果存在重复则替换开始时出现的元素
        Collections.copy(list,source);
        System.out.println("copy: " + list);
        //swap()方法实现Collections指定位置的交换
        Collections.swap(list,0,list.size() - 1);
        System.out.println("swap: " + list);
        Collections.shuffle(list, new Random(47));
        System.out.println("shuffled: " + list);
        Collections.fill(list,"pop");
        System.out.println("fill: " + list);
        System.out.println("frequency of 'pop': " +
                Collections.frequency(list,"pop"));
        List<String> dups = Collections.nCopies(3,"snap");
        System.out.println(dups);
        System.out.println("'list' disjoint 'dups'?: " +
                Collections.disjoint(list,dups));
    }
}
