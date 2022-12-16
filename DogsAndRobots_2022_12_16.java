package com.company.javaRelearn;

interface Performs{
    void speak();
    void sit();
}

class PerformingDog extends Dog implements Performs {

    @Override
    public void speak() {
        System.out.println("Woof");
    }

    @Override
    public void sit() {
        System.out.println("Sitting");
    }

    public void reproduce() {}
}

class Robot implements Performs {

    @Override
    public void speak() {
        System.out.println("Click!");
    }

    @Override
    public void sit() {
        System.out.println("Clank!");
    }

    public void oilChange() {}
}

class Communicate {
    public static <T extends Performs> void perform(T performer) {
        performer.speak();
        performer.sit();
    }
}

public class DogsAndRobots_2022_12_16 {
    public static void main(String[] args) {
        PerformingDog d = new PerformingDog();
        Robot r = new Robot();
        Communicate.perform(d);
        Communicate.perform(r);
    }
}
