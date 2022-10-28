package com.company.javaRelearn;

class Window {
    Window(int market) {
        System.out.println("Window(" + market + ")");
    }
}

class House {
    Window w1 = new Window(1);
    House() {
        System.out.println("House");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f() {
        System.out.println("f()");
    }
    Window w3 = new Window(3);

}

public class OrderOfInitialization_2022_6_13 {
    public static void main(String[] args) {
        House house = new House();
        house.f();
    }
}
