package com.company.javaRelearn.NIIT3.Week5;

import java.util.Scanner;

// 父类：宠物
abstract class Pet {
    protected String name;
    protected int hunger = 50; // 0-100, 数值越高表示越饥饿
    protected int mood = 50;   // 0-100, 数值越高表示越开心

    public Pet(String name) {
        this.name = name;
    }

    public abstract void makeSound(); // 抽象方法，不同宠物叫声不同

    public void eat() {
        hunger -= 20;
        if (hunger < 0) hunger = 0;
        mood += 10;
        System.out.println(name + " 吃饱了，感觉更开心了！");
    }

    public void play() {
        mood += 15;
        hunger += 10;
        if (mood > 100) mood = 100;
        if (hunger > 100) hunger = 100;
        System.out.println(name + " 玩得很开心！");
    }

    public void showStatus() {
        System.out.println(name + " 的状态 -> 饥饿度: " + hunger + " | 心情: " + mood);
    }
}

// 子类：狗
class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " 汪汪叫！");
    }
}

// 子类：猫
class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " 喵喵叫！");
    }
}

// 子类：鸟
class Bird extends Pet {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " 叽叽喳喳叫！");
    }
}

// 主类：宠物领养互动系统
public class PetAdoptionGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet[] pets = new Pet[1]; // 存储已领养的宠物，限制为1个宠物

        System.out.println("欢迎来到宠物领养中心！请选择你想领养的宠物：");
        System.out.println("1. 狗\n2. 猫\n3. 鸟");
        int choice = scanner.nextInt();
        scanner.nextLine(); // 读取换行符

        System.out.println("请给你的宠物起一个名字：");
        String name = scanner.nextLine();

        Pet pet;
        switch (choice) {
            case 1 -> pet = new Dog(name);
            case 2 -> pet = new Cat(name);
            case 3 -> pet = new Bird(name);
            default -> {
                System.out.println("输入错误，默认领养一只狗。");
                pet = new Dog("无名狗狗");
            }
        }
        pets[0] = pet;
        System.out.println("你成功领养了一只 " + name + "！\n");

        while (true) {
            System.out.println("请选择要做的事情：");
            System.out.println("1. 让宠物叫\n2. 喂食\n3. 玩耍\n4. 查看状态\n5. 退出");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1 -> pets[0].makeSound();
                case 2 -> pets[0].eat();
                case 3 -> pets[0].play();
                case 4 -> pets[0].showStatus();
                case 5 -> {
                    System.out.println("游戏结束，感谢你的照顾！");
                    scanner.close();
                    return;
                }
                default -> System.out.println("无效输入，请重新选择。");
            }
        }
    }
}
