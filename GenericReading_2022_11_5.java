package com.company.javaRelearn;

import java.util.Arrays;
import java.util.List;

public class GenericReading_2022_11_5 {
    static <T> T readExact(List<T> list) {
        return list.get(0);
    }
    static List<Apple3> apples = Arrays.asList(new Apple3());
    static List<Fruit3> fruit = Arrays.asList(new Fruit3());
    static void f1() {
        Apple3 a = readExact(apples);
        Fruit3 f = readExact(fruit);
        f = readExact(apples);
    }

    static class Reader<T> {
        T readExact(List<T> list) {
            return list.get(0);
        }
    }
    static void f2() {
        Reader<Fruit3> fruitReader = new Reader<Fruit3>();
        Fruit3 f = fruitReader.readExact(fruit);
    }

    static class CovariantReader<T> {
        T readCovariant(List<? extends T> list) {
            return list.get(0);
        }
    }
    static void f3() {
        CovariantReader<Fruit3> fruitReader =
                new CovariantReader<Fruit3>();
        Fruit3 f = fruitReader.readCovariant(fruit);
        Fruit3 a = fruitReader.readCovariant(apples);
    }

    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }
}
