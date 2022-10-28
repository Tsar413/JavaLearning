package com.company.javaRelearn;

class Car {}

class BenzCar extends Car {
    public BenzCar() {
        System.out.println("Produce Benz Car");
    }
}

class BMWCar extends Car {
    public BMWCar() {
        System.out.println("Produce BMW Car");
    }
}

class CarFactory<T extends Car> {
    public T create(Class<T> type) throws Exception {
        System.out.println("Produce Window");
        System.out.println("Produce Engine");
        return type.newInstance();
    }
}

public class GenericTest_2022_10_26 {
    public static void main(String[] args) throws Exception {
        CarFactory<BenzCar> carFactory1 = new CarFactory<BenzCar>();
        CarFactory<BMWCar> carFactory2 = new CarFactory<BMWCar>();
        carFactory1.create(BenzCar.class);
        System.out.println();
        carFactory2.create(BMWCar.class);
    }
}
