package com.company.javaRelearn.NIIT3.Week4;

import java.util.Scanner;

/*
* 🍔 练习2：继承 - 快餐店点餐系统
目标： 通过继承实现不同种类的快餐食品

题目描述
创建一个 Food 父类，包含食品名称和价格，提供 showInfo() 方法。
创建 Burger（汉堡） 和 Drink（饮料）子类，分别添加特有属性（如是否是大杯、是否加芝士）。

在 main 方法中创建菜单列表，使用循环模拟点餐。
* */

// Food.java - 食品父类
class Food {
    protected String name;
    protected double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("🍽️ " + name + " - ¥" + price);
    }
}

// Burger.java - 汉堡类
class Burger extends Food {
    private boolean hasCheese; // 是否加芝士

    public Burger(String name, double price, boolean hasCheese) {
        super(name, price);
        this.hasCheese = hasCheese;
    }

    @Override
    public void showInfo() {
        System.out.println("🍔 " + name + (hasCheese ? "（加芝士）" : "") + " - ¥" + price);
    }
}

// Drink.java - 饮料类
class Drink extends Food {
    private boolean isLarge; // 是否是大杯

    public Drink(String name, double price, boolean isLarge) {
        super(name, price);
        this.isLarge = isLarge;
    }

    @Override
    public void showInfo() {
        System.out.println("🥤 " + name + (isLarge ? "（大杯）" : "（中杯）") + " - ¥" + price);
    }
}

public class OrderSystem {
    public static void main(String[] args) {
        Food[] menu = {
                new Burger("鸡腿堡", 15.0, true),
                new Burger("牛肉堡", 18.0, false),
                new Drink("可乐", 5.0, true),
                new Drink("果汁", 6.0, false)
        };

        // 显示菜单
        System.out.println("📜 菜单：");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(i + 1 + ". ");
            menu[i].showInfo();
        }

        // 用户点餐
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n请输入你要点的菜品编号（1-4）：");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= menu.length) {
            System.out.println("\n✅ 你点了：" + menu[choice - 1].name);
        } else {
            System.out.println("❌ 无效输入！");
        }
    }
}
