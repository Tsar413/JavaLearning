package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SimpleIterator_2022_8_7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Rat","Manx","Cymric","Mutt","Pug","Cymric","Manx","Rat");
        List<String> list1 = new ArrayList<String>(list);
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            String p = iterator.next();
            System.out.print(p + " ");
        }
        //Iterator不需要为后面的元素关心，那是next()和hasNext()需要注意的地方
        System.out.println();
        for (String p: list1) {
            System.out.print(p + " ");
        }
        //如果只是想遍历list而不对其进行修改，那么foreach就会非常简洁
        System.out.println();
        iterator = list1.iterator();
        for(int i = 0; i < 6; i++) {
            iterator.next();
            iterator.remove();
        }
        //Iterator可以用来移除next()调用的最后一个元素，因此必须事先调用next()后remove()
        System.out.println(list1);
    }
}
