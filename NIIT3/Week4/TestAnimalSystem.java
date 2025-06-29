package com.company.javaRelearn.NIIT3.Week4;

// 定义接口：AnimalBehavior，表示所有动物的行为
interface AnimalBehavior {
    void makeSound();  // 动物叫声
    void move();       // 动物移动
}

// 抽象类：Animal，包含部分通用功能
abstract class Animal implements AnimalBehavior {
    String name;

    // 构造函数
    public Animal(String name) {
        this.name = name;
    }

    // 抽象方法：具体的动物行为由子类实现
    public abstract void eat();

    // 重写接口的方法
    @Override
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving.");
    }
}

// 子类：Dog，继承Animal并实现eat方法
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats dog food.");
    }

    // 重写接口方法makeSound，提供更具体的实现
    @Override
    public void makeSound() {
        System.out.println(name + " barks!");
    }
}

// 子类：Cat，继承Animal并实现eat方法
class Cat extends Animal {
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

// 子类：Bird，继承Animal并实现eat方法
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats bird food.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps!");
    }
}

// 主类：TestAnimalSystem，测试动物系统
public class TestAnimalSystem {

    // 方法重载：不同的参数类型来决定调用哪个版本的方法
    public static void makeSound(Animal animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {
        // 创建动物对象
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        Animal bird = new Bird("Tweetie");

        // 调用不同动物的方法
        dog.makeSound();  // 调用重写后的方法
        dog.move();
        dog.eat();  // 调用重载的eat方法

        System.out.println();

        cat.makeSound();
        cat.move();
        cat.eat();

        System.out.println();

        bird.makeSound();
        bird.move();
        bird.eat();

        // 演示方法重载
        System.out.println();
        makeSound(dog);
        makeSound(cat);
    }
}

