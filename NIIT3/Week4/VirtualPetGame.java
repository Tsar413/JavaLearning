package com.company.javaRelearn.NIIT3.Week4;

import java.util.Scanner;

/*
* 🐶 练习4（替换）：封装 - 虚拟宠物系统
目标： 通过封装管理虚拟宠物的状态

题目描述
创建 Pet 类，封装宠物的名字、健康值、饱食度、快乐度。提供方法：

feed() - 喂食，提高饱食度，略微提升健康值。
play() - 玩耍，提高快乐度，降低饱食度。
checkStatus() - 显示宠物状态，健康值过低时提醒用户。
在 main 方法中，创建一个宠物，并使用循环模拟喂食和玩耍。
* */

// Pet.java - 虚拟宠物类
class Pet {
    private String name; // 宠物名字
    private int health;  // 健康值（0-100）
    private int hunger;  // 饱食度（0-100）
    private int happiness; // 快乐度（0-100）

    // 构造方法
    public Pet(String name) {
        this.name = name;
        this.health = 80;
        this.hunger = 50;
        this.happiness = 60;
    }

    // 喂食
    public void feed() {
        hunger = Math.min(100, hunger + 20);
        health = Math.min(100, health + 5);
        System.out.println("🍖 " + name + " 吃得饱饱的！");
    }

    // 玩耍
    public void play() {
        if (hunger > 10) {
            happiness = Math.min(100, happiness + 15);
            hunger -= 10;
            System.out.println("🎾 " + name + " 玩得很开心！");
        } else {
            System.out.println("⚠️ " + name + " 太饿了，不想玩！");
        }
    }

    // 检查宠物状态
    public void checkStatus() {
        System.out.println("\n🐾 宠物状态：");
        System.out.println("❤️ 健康值：" + health);
        System.out.println("🍗 饱食度：" + hunger);
        System.out.println("😄 快乐度：" + happiness);
        if (health < 30) {
            System.out.println("⚠️ " + name + " 健康状况不佳，需要照顾！");
        }
    }
}

public class VirtualPetGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的宠物名字：");
        String petName = scanner.nextLine();
        Pet myPet = new Pet(petName);

        while (true) {
            System.out.println("\n📌 请选择操作：1. 喂食  2. 玩耍  3. 查看状态  4. 退出");
            int choice = scanner.nextInt();

            if (choice == 1) {
                myPet.feed();
            } else if (choice == 2) {
                myPet.play();
            } else if (choice == 3) {
                myPet.checkStatus();
            } else if (choice == 4) {
                System.out.println("👋 游戏结束，记得照顾好 " + petName + " 哦！");
                break;
            } else {
                System.out.println("❌ 无效选项！");
            }
        }
    }
}

