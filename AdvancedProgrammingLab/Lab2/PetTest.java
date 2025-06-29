package com.company.javaRelearn.AdvancedProgrammingLab.Lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetTest {
    @SafeVarargs
    public static <T> List<? super T> addList (List<? super T> list, T... type) {
        list.addAll(Arrays.asList(type));
        return list;
    }

    public static void main(String[] args) {
        List<Pet> list = new ArrayList<Pet>();
        list = (List<Pet>) addList(list,
                new Dog("Rex","collie","Black"," a tennis ball"),
                new Cat("Tom","collie","Blue"," a small park"));
//        Dog dog = new Dog("Rex","collie","Black"," a tennis ball");
//        dog.provideBone();
        System.out.println(list.get(0).toString());
    }
}
