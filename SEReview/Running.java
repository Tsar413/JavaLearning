package com.company.javaRelearn.SEReview;

public class Running {
    public static void main(String[] args) {
        Point point1 = new Point(2, 4);
        Point point2 = new Point(6, 7);

        System.out.println(point1);
        System.out.println(point2);

        LabelledPoint lab = new LabelledPoint(3,5,"Test");
        String s = lab.getLabel();
        System.out.println(lab);

        Point lab1 = new LabelledPoint(3,5,"Test");
        System.out.println(lab1);
    }
}
