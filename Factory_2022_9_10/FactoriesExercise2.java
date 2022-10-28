package com.company.javaRelearn.Factory_2022_9_10;

import java.util.ArrayList;
import java.util.List;

interface FruitFactories<T> {
    T chooseFruit();
}

class FruitToday {
    @Override
    public String toString() {
        return "Fruit today is " + getClass().getSimpleName();
    }
    static List<FruitFactories<? extends FruitToday>> fruitList = new ArrayList<FruitFactories<? extends FruitToday>>();
    static {
        fruitList.add(new Apple.FruitFactories());
    }
    public static FruitToday eat() {
        return fruitList.get(0).chooseFruit();
    }
}

class Fruit extends FruitToday {}

class Apple extends Fruit {
    public static class FruitFactories implements com.company.javaRelearn.Factory_2022_9_10.FruitFactories<Apple> {
        @Override
        public Apple chooseFruit() {
            return new Apple();
        }
    }
}

public class FactoriesExercise2 {
    public static void main(String[] args) {
        System.out.println(FruitToday.eat());
    }
}
