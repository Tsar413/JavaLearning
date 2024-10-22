package com.company.javaRelearn.Practise_3_8_AreaPerimeterCalculationsGraphs_20241014;

public class ShapeCalculate {
    public <T> double getPerimeter(Class<T> type, int num1, int num2){
        if(type == Circle.class){
            return new Circle(num1).getPerimeter();
        }
        return new Rectangle(num1, num2).getPerimeter();
    }

    public <T> double getArea(Class<T> type, int num1, int num2){
        if(type == Circle.class){
            return new Circle(num1).getArea();
        }
        return new Rectangle(num1, num2).getArea();
    }
}
