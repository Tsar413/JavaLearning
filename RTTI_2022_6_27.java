package com.company.javaRelearn;

class Useful {
    void f() {
        System.out.println("Useful.f()");
    }
    void g() {
        System.out.println("Useful.g()");
    }
    void w() {
        System.out.println("Useful.w()");
    }
}

class MoreUseful extends Useful {
    void f() {
        System.out.println("MoreUseful.f()");
    }
    void g() {
        System.out.println("MoreUseful.g()");
    }
    void h() {
        System.out.println("MoreUseful.h()");
    }
    void j() {
        System.out.println("MoreUseful.j()");
    }
}

public class RTTI_2022_6_27 {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()};
        x[0].f();
        x[1].f();
        x[1].w();
//        x[1].h(); 错误
        MoreUseful y = new MoreUseful();
        y.h();
    }
}
