package com.company.javaRelearn;

/*
  运行顺序为Person->Person中的eat方法->新建了一个为Apple的类，apple1的实例->调用getPeeler的方法
  ->返回Peeler中peel的方法->结束运行，打印Yummy
*/

class Person {
    public void eat(Apple apple1) {
        Apple peeled = apple1.getPeeler();
        System.out.println("Yummy");
    }
}

class Peeler {
    static Apple peel(Apple apple2) {
        return apple2;
    }
}

class Apple {
    Apple getPeeler() {
        return Peeler.peel(this);
    }
}

public class PassingThis_2022_6_12 {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
