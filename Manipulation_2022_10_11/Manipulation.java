package com.company.javaRelearn.Manipulation_2022_10_11;

import java.util.List;

class Manipulator<T extends HasF> {
    private T obj;
    public Manipulator(T x) {
        obj = x;
    }
    public void manipulate() {
        obj.f();
    }
}

public class Manipulation {
    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<HasF>(hf);
        manipulator.manipulate();
    }
}
