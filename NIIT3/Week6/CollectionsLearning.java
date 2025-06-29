package com.company.javaRelearn.NIIT3.Week6;

import java.util.*;

class IteratorLearning{
    public void iteratorLearning(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        for (int i : list){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(list);
    }

    public static void main(String[] args) {
        IteratorLearning iteratorLearning = new IteratorLearning();
        iteratorLearning.iteratorLearning();
    }
}

class ListLearning{
    public void listLearning(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2); // list添加
        list.add(3);
        list.add(4);
        list.add(1,3); // list在指定位置添加
        System.out.println(list.contains(3)); // 判断是否存在
        System.out.println(list.get(2)); // 获取指定索引
        list.remove(1); //删除指定索引
        System.out.println(list.subList(1, 3)); // 获取子串
        System.out.println(list.indexOf(3)); // 获取第一次出现的值
        System.out.println(list); // 输出list
    }

    public static void main(String[] args) {
        ListLearning listLearning = new ListLearning();
        listLearning.listLearning();
    }
}

class SetLearning{
    public void setLearning(){
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set.contains(2));
        System.out.println(set);
        System.out.println(new ArrayList<Integer>(set));

        Set<Integer> set1 = new TreeSet<Integer>();
        set1.add(4);
        set1.add(2);
        set1.add(5);
        set1.add(1);
        System.out.println(set1);

        Set<Integer> set2 = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        set2.add(4);
        set2.add(2);
        set2.add(5);
        set2.add(1);
        System.out.println(set2);
    }

    public static void main(String[] args) {
        SetLearning setLearning = new SetLearning();
        setLearning.setLearning();
    }
}

public class CollectionsLearning {
}
