package com.company.javaRelearn;

class Fruit3 {}
class Apple3 extends Fruit3 {}
class Jonathan3 extends Apple3 {}
class Orange3 extends Fruit3 {}

public class CovariantArrays_2022_11_2 {
    public static void main(String[] args) {
        Fruit3[] fruit = new Apple3[10];
        fruit[0] = new Apple3();
        fruit[1] = new Jonathan3();
        //运行时，类型是Apple3[]不是Fruit3[]
        try {
            fruit[0] = new Fruit3();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            fruit[0] = new Orange3();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
