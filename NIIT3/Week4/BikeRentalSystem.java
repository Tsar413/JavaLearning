package com.company.javaRelearn.NIIT3.Week4;

/*
* 🚗 练习1：封装 - 共享单车管理系统
目标： 通过封装实现共享单车的租借与归还

题目描述
编写一个 Bike 类，封装单车编号、状态（是否被借出）、租借次数等信息。提供方法：

rentBike() - 租借单车，修改状态，增加租借次数
returnBike() - 归还单车，修改状态
displayInfo() - 显示单车信息
在 main 方法中，创建一个包含 5 辆单车的数组，使用循环模拟租借和归还操作。
* */

// Bike.java - 共享单车类
class Bike {
    private String id; // 单车编号
    private boolean isRented; // 是否被借出
    private int rentCount; // 租借次数

    // 构造方法
    public Bike(String id) {
        this.id = id;
        this.isRented = false;
        this.rentCount = 0;
    }

    // 租借单车
    public void rentBike() {
        if (!isRented) {
            isRented = true;
            rentCount++;
            System.out.println("🚴 单车 " + id + " 成功租借！");
        } else {
            System.out.println("⚠️ 单车 " + id + " 已被借走！");
        }
    }

    // 归还单车
    public void returnBike() {
        if (isRented) {
            isRented = false;
            System.out.println("✅ 单车 " + id + " 成功归还！");
        } else {
            System.out.println("⚠️ 单车 " + id + " 未被租借！");
        }
    }

    // 显示单车信息
    public void displayInfo() {
        System.out.println("🚲 单车编号：" + id + " | 状态：" + (isRented ? "已借出" : "可用") + " | 总租借次数：" + rentCount);
    }
}

// 主类
public class BikeRentalSystem {
    public static void main(String[] args) {
        // 创建 5 辆单车
        Bike[] bikes = {
                new Bike("A001"),
                new Bike("A002"),
                new Bike("A003"),
                new Bike("A004"),
                new Bike("A005")
        };

        // 模拟租借和归还
        bikes[1].rentBike();
        bikes[3].rentBike();
        bikes[1].returnBike();
        bikes[3].returnBike();

        // 显示所有单车状态
        System.out.println("\n📋 所有单车信息：");
        for (Bike bike : bikes) {
            bike.displayInfo();
        }
    }
}

