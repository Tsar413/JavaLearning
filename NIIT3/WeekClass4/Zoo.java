package com.company.javaRelearn.NIIT3.WeekClass4;

interface AnimalBehavior{
    void makeSound(); //动物叫声
    void move(); //动物移动
}

abstract class Animal implements AnimalBehavior{
    String name;

    //构造器
    public Animal(String name){
        this.name = name;
    }

    //抽象方法: 由具体的子类来决定
    public abstract void eat();

    //重写接口方法
    @Override
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving.");
    }
}

//子类：Dog 继承Animal并动态调用方法
class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats dog food.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks!");
    }
}

//子类 Cat 继承Animal并动态调用方法
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats cat food.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows!");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        dog.eat();
        dog.makeSound();
        dog.move();

        cat.eat();
        cat.makeSound();
        cat.move();

        Animal[] animals = new Animal[3];
        animals[0] = dog;
        animals[1] = cat;

    }
}
