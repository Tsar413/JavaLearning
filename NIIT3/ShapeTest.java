package com.company.javaRelearn.NIIT3;

class Shape{
    public double area;
    int size;

    public Shape(){}

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
}

class Circle extends Shape{
    private String name;
    private double area;

    public Circle(double area){
        super(area, 1);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}

public class ShapeTest {
    public int getNewId(Integer id){
        if(id == null){
            return 1;
        } else {
            return id + 1;
        }
    }

    public static void main(String[] args) {
        Shape shape = new Circle(3);
        System.out.println(shape.getArea());
    }
}
