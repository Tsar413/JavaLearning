package com.company.javaRelearn.APExam;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class Pet {
    String name;
    float weight;
}

class Cat extends Pet {
    String favouriteBox;
    float lengthofClaws;
}



public class Exam {
    public static void main(String[] args) throws InterruptedException {
//        Stream<String> stream = Stream.of("cat","duck","bat","sheep").filter(element -> element.contains("b"));
//        Optional<String> firstElement = stream.findFirst();
//        Optional<String> anyElement = stream.findAny();
//        System.out.print(firstElement.get());
//        System.out.print(anyElement.get());
//        Object myCat = new Cat(); // note declared type of myCa
//        Field[] fields1 = myCat.getClass().getDeclaredFields();
//        Field[] fields2 = Cat.class.getDeclaredFields();
//        System.out.println(fields1.length);
//        System.out.println(fields2.length);
//
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.remove(2);
//        System.out.println(list);

        Thread[] thread = new Thread[5];
        for (int i = 0; i < 5; i++) {
            thread[i] = new Thread();
            thread[i].start();
            thread[i].join();
        }
    }
}
