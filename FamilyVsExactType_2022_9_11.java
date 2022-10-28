package com.company.javaRelearn;

class Base1 {}
class Derived extends Base1 {}

public class FamilyVsExactType_2022_9_11 {
    static void test(Object x) {
        System.out.println("Testing x of Type " + x.getClass());
        System.out.println("x instanceof Base " + (x instanceof Base1));
        System.out.println("x instanceof Derived " + (x instanceof Derived));
        System.out.println("Base1.isInstance(x) " + Base1.class.isInstance(x));
        System.out.println("Derived.isInstance(x) " + Derived.class.isInstance(x));
        System.out.println("x.getClass() == Base1.class " + (x.getClass() == Base1.class));
        System.out.println("x.getClass() == Derived.class " + (x.getClass() == Derived.class));
        System.out.println("x.getClass().equals(Base1.class) " + (x.getClass().equals(Base1.class)));
        System.out.println("x.getClass().equals(Derived.class) " + (x.getClass().equals(Derived.class)));
    }

    public static void main(String[] args) {
        test(new Base1());
        test(new Derived());
    }
}
