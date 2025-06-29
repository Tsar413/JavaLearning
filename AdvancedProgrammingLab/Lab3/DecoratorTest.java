package com.company.javaRelearn.AdvancedProgrammingLab.Lab3;

public class DecoratorTest {
    public static void main(String[] args) {
        Car base = new BasicCar();
        System.out.println("Polo costs " + base.getPrice() + " and is " + base.getDescription());

        Car alloys = new AlloyDecorator(new BasicCar());
        System.out.println("GolfSport costs " + alloys.getPrice() + " and is " + alloys.getDescription());

        Car cd = new CDDecorator(new BasicCar());
        System.out.println("GolfBeats costs " + cd.getPrice() + " and is " + cd.getDescription());

        Car all = new CDDecorator(new AlloyDecorator(new BasicCar()));
        System.out.println("SuperGolf costs " + all.getPrice() + " and is " + all.getDescription());

        Car cd2 = new CDDecorator(new LuxuryCar());
        System.out.println("BMW costs " + cd2.getPrice() + " and is " + cd2.getDescription());

    }
}
