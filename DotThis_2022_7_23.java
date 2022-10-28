package com.company.javaRelearn;

public class DotThis_2022_7_23 {
    void f() {
        System.out.println("DotThis.f()");
    }
    public class Inner {
        public DotThis_2022_7_23 outer() {
            return DotThis_2022_7_23.this;
        }
    }
    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis_2022_7_23 dt = new DotThis_2022_7_23();
        DotThis_2022_7_23.Inner dti = dt.inner();
        dti.outer().f();
    }
}
