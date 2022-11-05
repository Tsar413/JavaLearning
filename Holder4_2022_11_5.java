package com.company.javaRelearn;

public class Holder4_2022_11_5<T> {
    private T value;
    public Holder4_2022_11_5() {}
    public Holder4_2022_11_5(T val) {
        value = val;
    }
    public void set(T val) {
        value = val;
    }
    public T get() {
        return value;
    }
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder4_2022_11_5<Apple3> Apple3 = new Holder4_2022_11_5<Apple3>(new Apple3());
        Apple3 d = Apple3.get();
        Apple3.set(d);
        Holder4_2022_11_5<? extends Fruit3> fruit = Apple3;
        Fruit3 p = fruit.get();
        d = (Apple3)fruit.get();
        try {
            Orange3 c = (Orange3)fruit.get();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(fruit.equals(d));
    }
}
