package com.company.javaRelearn.NIIT3.WeekClass4;

import java.util.Scanner;

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

    // 完成构造器与showInfo方法的override
    public Burger(String name, double price, boolean hasCheese) {
        super(name, price);
        this.hasCheese = hasCheese;
    }

    @Override
    public void showInfo() {
        System.out.println("name" + name + "price" + price + "cheese" + hasCheese);
    }
}

// Drink.java - 饮料类
class Drink extends Food {
    private boolean isLarge; // 是否是大杯

    // 完成构造器与showInfo方法的override
    public Drink(String name, double price, boolean isLarge) {
        super(name, price);
        this.isLarge = isLarge;
    }

    @Override
    public void showInfo() {
        System.out.println("name" + name + "price" + price + "isLarge" + isLarge);
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
        //通过循环显示菜单
        for (Food food : menu){
            food.showInfo();
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
