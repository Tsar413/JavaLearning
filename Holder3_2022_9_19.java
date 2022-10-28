package com.company.javaRelearn;

public class Holder3_2022_9_19<T> {
    private T a;
    public Holder3_2022_9_19(T a) {
        this.a = a;
    }

    public void setA(T a) {
        this.a = a;
    }
    public T getA() {
        return a;
    }

    public static void main(String[] args) {
        Holder3_2022_9_19<Automobile> h3 =
                new Holder3_2022_9_19<Automobile>(new Automobile());
        Automobile a = h3.getA();
    }
}
