package com.company.javaRelearn;

import java.util.Random;

class Shape2 {
    public void draw() {}
    public void erase() {}
}

class Circle2 extends Shape2 {
    public void draw() {
        System.out.println("Circle.draw()");
    }
    public void erase()  {
        System.out.println("Circle.erase()");
    }
}

class Square2 extends Shape2 {
    public void draw() {
        System.out.println("Square.draw()");
    }
    public void erase()  {
        System.out.println("Square.erase()");
    }
}

class Triangle2 extends Shape2 {
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    public void erase()  {
        System.out.println("Triangle.erase()");
    }
}

class RandomShapeGenerator {
    Random rnd = new Random();
    Shape2 next() {
        switch (rnd.nextInt(3)) {
            default:
            case 0: return new Circle2();
            case 1: return new Square2();
            case 2: return new Triangle2();
        }
    }
}

public class Shapes2_2022_6_25 {
    private static RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape2[] shape2s = new Shape2[5];
        for (int i = 0; i < shape2s.length; i++) {
            shape2s[i] = randomShapeGenerator.next();
            shape2s[i].draw();
        }
    }
}
