package com.company.javaRelearn;

interface Factory1<T> {
    T create();
}

class Foo2<T> {
    private T x;
    public <F extends Factory1<T>> Foo2(F factory) {
        x = factory.create();
    }
}

class IntegerFactory implements Factory1<Integer> {
    public Integer create() {
        return new Integer(0);
    }
}

class Widget {
    public static class Factory implements Factory1<Widget> {
        public Widget create() {
            return new Widget();
        }
    }
}

public class FactoryConstraint_2022_10_12 {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}
