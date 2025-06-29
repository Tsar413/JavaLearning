package com.company.javaRelearn;

class Base5 {}
class Derived5 extends Base5 {}

interface OrdinaryGetter {
    Base5 get();
}

interface DerivedGetter extends OrdinaryGetter {
    Derived5 get();
}

public class CovariantReturnTypes_2022_11_22 {
    void test(DerivedGetter d) {
        Derived5 d2 = d.get();
    }
}
