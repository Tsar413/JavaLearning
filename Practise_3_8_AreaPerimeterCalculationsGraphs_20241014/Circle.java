package com.company.javaRelearn.Practise_3_8_AreaPerimeterCalculationsGraphs_20241014;

public class Circle extends Shape {
    private double radius;
    private final static double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
