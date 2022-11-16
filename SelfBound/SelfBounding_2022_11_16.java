package com.company.javaRelearn.SelfBound;

class SelfBounded<T extends SelfBounded<T>> {
    T element;
    SelfBounded<T> set(T arg) {
        element = arg;
        return this;
    }
    T get() {
        return element;
    }
}

class A extends SelfBounded<A> {}
class B extends SelfBounded<A> {}

class C extends SelfBounded<C> {
    C setAndGet(C arg) {
        set(arg);
        return get();
    }
}

class D {}
//class E extends SelfBounded<D> {} 不可以这么写

class F extends SelfBounded {}

public class SelfBounding_2022_11_16 {
    public static void main(String[] args) {
        A a = new A();
        a.set(new A());
        a = a.set(new A()).get();
        a = a.get();
        C c = new C();
        c = c.setAndGet(new C());
    }
}
