package com.company.javaRelearn.NIIT3.Week4;

/*
* 📦 练习5：继承 - 物流快递管理
目标： 通过继承管理不同类型的快递

题目描述
创建 Package 父类，包含快递单号、重量、收件人信息。
创建 ExpressPackage（特快件）和 StandardPackage（普通件）子类，分别实现不同的派送方式。

在 main 方法中，创建快递列表并模拟派送。
* */

// Package.java - 快递父类
class Package {
    protected String trackingNumber;
    protected double weight;
    protected String recipient;

    public Package(String trackingNumber, double weight, String recipient) {
        this.trackingNumber = trackingNumber;
        this.weight = weight;
        this.recipient = recipient;
    }

    public void deliver() {
        System.out.println("📦 快递 " + trackingNumber + " 正在派送至：" + recipient);
    }
}

// ExpressPackage.java - 特快件类
class ExpressPackage extends Package {
    public ExpressPackage(String trackingNumber, double weight, String recipient) {
        super(trackingNumber, weight, recipient);
    }

    @Override
    public void deliver() {
        System.out.println("🚀 特快件 " + trackingNumber + " 当天送达至：" + recipient);
    }
}

// StandardPackage.java - 普通快递类
class StandardPackage extends Package {
    public StandardPackage(String trackingNumber, double weight, String recipient) {
        super(trackingNumber, weight, recipient);
    }

    @Override
    public void deliver() {
        System.out.println("📭 普通快递 " + trackingNumber + " 预计 3-5 天送达至：" + recipient);
    }
}

// 主类
public class LogisticsSystem {
    public static void main(String[] args) {
        Package[] packages = {
                new ExpressPackage("EXP001", 1.2, "张三"),
                new StandardPackage("STD002", 3.5, "李四"),
                new ExpressPackage("EXP003", 0.8, "王五")
        };

        for (Package pkg : packages) {
            pkg.deliver();
        }
    }
}

