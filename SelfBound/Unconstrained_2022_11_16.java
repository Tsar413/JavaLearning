package com.company.javaRelearn.SelfBound;

class Other {}
class BasicOther extends BasicHolder_2022_11_15<Other> {}

public class Unconstrained_2022_11_16 {
    public static void main(String[] args) {
        BasicOther basicOther1 = new BasicOther(), basicOther2 = new BasicOther();
        basicOther1.set(new Other());

        Other other = basicOther2.get();
        basicOther1.f();
    }
}
