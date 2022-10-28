package com.company.javaRelearn.Review;

import java.util.Arrays;
import java.util.List;

abstract class Shape5 {
    void draw() {
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle5 extends Shape5 {
    @Override
    public String toString() {
        return "Circle";
    }
}

class Rectangle5 extends Shape5 {
    @Override
    public String toString() {
        return "Rectangle";
    }
}

public class Shapes5 {
    public static void draw2(Shape5 shape5) {
        shape5.draw();
    }

    public static void draws2(Shape5[] shapes5) {
        for (Shape5 shape5 : shapes5)
            draw2(shape5);
    }

    public static void main(String[] args) {
        List<Shape5> list = Arrays.asList(new Circle5(),new Rectangle5());
        for (Shape5 shape5 : list)
            shape5.draw();

        Shape5[] shape5s = new Shape5[] {
                new Circle5(),
                new Rectangle5()
        };
        draws2(shape5s);
    }
}
