package com.company.javaRelearn;

class Bowl {
    Bowl(int number) {
        System.out.println("Bowl's number is " + number);
    }

    void f1(int number) {
        System.out.println("f1 is " + number);
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);
    Table() {
        System.out.println("Table()");
        bowl2.f1(2);
    }

    void f2(int number) {
        System.out.println("f2 is " + number);
    }
    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int number) {
        System.out.println("f3 is " + number);
    }
    static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization_2022_6_14 {
    public static void main(String[] args) {
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
