package com.company.javaRelearn;

class MNA {
    private void f() {}
    class A{
        private void g() {}
        public class B {
            void h() {
                f();
                g();
            }
        }
    }
}

public class MultiNestingAccess_2022_7_26 {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A aMNA = mna.new A();
        MNA.A.B bMNA = aMNA.new B();
        bMNA.h();
    }

}
