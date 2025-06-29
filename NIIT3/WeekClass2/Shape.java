package com.company.javaRelearn.NIIT3.WeekClass2;

// 设计一个Shape类 要求：area没有访问限制 size只能在同一个包内访问
// getName()方法只能在Shape类中访问 getArea()方法能在同一个包中和子类中访问
// Shape类需要两种构造器 并且在main中进行调用
public class Shape {
    public double area;
    int size;

    public Shape() {
    }

    public Shape(double area, int size) {
        this.area = area;
        this.size = size;
    }

    private String getName(){
        return "Name";
    }

    protected double getArea(){
        return area;
    }

    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1.getName());
    }
}
