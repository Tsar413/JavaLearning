package com.company.javaRelearn;

import java.util.*;

class Hamster {
    String hamster = "Hamster";
}

public class ListFeature_2022_8_6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<String> list = Arrays.asList("Rat","Manx","Cymric","Mutt","Pug");
        List<String> list1 = new ArrayList<>(list);
        //此List 为Arrays.asList()初始化的，Arrays类继承了AbstractList抽象类，
        //只实现了get/set方法，但是没有实现add/remove方法
        //List 允许在被创建后添加，移除元素，或者自我调整尺寸
        System.out.println("1: " + list1);
        Hamster h = new Hamster();
        list1.add(h.hamster);
        System.out.println("2: " + list1);
        System.out.println("3: " + list1.contains(h.hamster));
        //contains方法被用来确定List中是否包含该元素
        list1.remove(h.hamster);
        //移除List中的元素
        System.out.println("4: " + list.get(2) + " " + list.indexOf(list.get(2)));
        //indexOf()方法被用来查找具体的元素编号
        list1.add(h.hamster);
        System.out.println("5: " + list1.indexOf(h));
        //在查重过程中，底层事实上调用了equals()方法，如果因为一些原因无法查找，会返回-1
        System.out.println("6: " + list1.remove(h.hamster));
        System.out.println("7: " + list1.remove(h));
        System.out.println("8: " + list1);
        //如果能精准匹配元素，则可以成功的删除相应的元素
        list1.add(3,new Hamster().hamster);
        System.out.println("9: " + list1);
        //对于LinkedList而言，在ArrayList中添加元素是一件效率非常低下的事情
        List<String> list2 = list1.subList(1,4);
        System.out.println("SubList: " + list2);
        //SubList方法允许从List中创建出一个新片段，具体为[1,4)
        System.out.println("10: " + list1.containsAll(list2));
        //containAll()方法允许判断一个list中的大部分是否都包含于list中
        Collections.sort(list2);
//        Collections.sort(list2, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });
        System.out.println("Sorted subList: " + list2);
        System.out.println("11: " + list1.containsAll(list2));
        //Collections.sort()方法的意义为按照系统默认的方法进行排序
        //containAll()方法不受顺序变化的影响
        //其中，可以对Collections.sort()以内部类的方式进行override，以达到自定义排序的目的
        Collections.shuffle(list2, rnd);
        System.out.println("shuffled subList: " + list2);
        System.out.println("12: " + list1.containsAll(list2));
        //Collections.shuffle()的意义为使用指定的随机性对列表元素进行随机重新排序
        List<String> copy = new ArrayList<String>(list1);
        //copy事实上底层使用了equal来赋值
        list2 = Arrays.asList(list1.get(1),list1.get(4));
        System.out.println("sub:" + list2);
        copy.retainAll(list2);
        //retainAll()方法被用来保留指定的元素
        System.out.println("13: " + copy);
        copy = new ArrayList<String>(list1);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(list2);
        System.out.println("15: " + copy);
        copy.set(1,new Hamster().hamster);
        //set()方法事实上执行了在指定位置进行替换的操作
        System.out.println("16: " + copy);
        copy.addAll(list2);
        System.out.println("17: " + copy);
        System.out.println("18: " + list1.isEmpty());
        //isEmpty()方法展示了判断List是否为空
        list1.clear();
        //clear()方法展示了清楚List中元素
        System.out.println("19: " + list1);
        System.out.println("20: " + list1.isEmpty());
        list1.addAll(Arrays.asList("Rat","Manx","Cymric","Mutt","Pug"));
        System.out.println("21: " + list1);
        Object[] o = list.toArray();
        //toArray()方法展示了如何将任意的Collections转化为一个数组
        //这是一个重载方法，如果没有对应的参数，那么将自动返回Object数组
        //toArray()可以自动创建符合对应尺寸大小的数组
        System.out.println("22: " + o[3]);
    }
}
