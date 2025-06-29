package com.company.javaRelearn.NIIT3.Week5;

import java.lang.Math;

interface Shapes{
    double calArea();
}

class Rectangle implements Shapes{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calArea() {
        return length * width;
    }
}

class Square implements Shapes{
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double calArea() {
        return length * length;
    }
}

class Circle implements Shapes{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double calArea() {
        return Math.PI * r * r;
    }
}

class Area{
    public double calculateArea(Shapes shapes){
        return shapes.calArea();
    }

    public static void main(String[] args) {
        Shapes[] shapes = new Shapes[3];
        shapes[0] = new Rectangle(2,3);
        shapes[1] = new Square(4);
        shapes[2] = new Circle(5);
        for (Shapes shapes1 : shapes){
            System.out.println(shapes1.getClass().getSimpleName() + ":" + shapes1.calArea());
        }
    }
}

public class ChapterEx72 {

}
