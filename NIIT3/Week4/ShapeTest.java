package com.company.javaRelearn.NIIT3.Week4;

abstract class Shape{

    String name;

    public Shape(String name){
        this.name = name;
    }

    abstract String getName();

    abstract int calRound();

    abstract int calArea();
}

class Circle extends Shape{
    private int r;

    public Circle(String name, int r){
        super(name);
        this.r = r;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int calRound() {
        return (int) Math.PI * 2 * r;
    }

    @Override
    int calArea() {
        return (int) Math.PI * r * r;
    }
}

class Rectangle extends Shape{
    private int m;
    private int n;

    public Rectangle(String name, int m, int n) {
        super(name);
        this.m = m;
        this.n = n;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int calRound() {
        return m + n + m + n;
    }

    @Override
    int calArea() {
        return m * n;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Circle("circle", 4);
        System.out.println(shape1.getName() + shape1.calRound() + shape1.calArea());
        Shape shape2 = new Rectangle("rectangle", 2, 3);
        System.out.println(shape2.getName() + shape2.calRound() + shape2.calArea());
    }
}
