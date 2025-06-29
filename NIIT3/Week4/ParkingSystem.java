package com.company.javaRelearn.NIIT3.Week4;

// 抽象交通工具类
abstract class Vehicle {
    protected String type;

    public Vehicle(String type) {
        this.type = type;
    }

    // 抽象方法（多态基础）
    public abstract void showFee(int hours);
}

class Car extends Vehicle {
    public Car() { super("小汽车"); }

    @Override
    public void showFee(int hours) {
        System.out.printf("%s 停车%d小时，费用：%.1f元\n",
                type, hours, hours * 5.0);
    }
}

class Bus extends Vehicle {
    public Bus() { super("公交车"); }

    @Override
    public void showFee(int hours) {
        System.out.printf("%s 停车%d小时，费用：%.1f元\n",
                type, hours, hours * 3.0);
    }
}

public class ParkingSystem {
    public static void main(String[] args) {
        Vehicle[] garage = new Vehicle[3];
        garage[0] = new Car();
        garage[1] = new Bus();
        garage[2] = new Car();

        // 模拟停车3小时
        for(Vehicle v : garage) {
            v.showFee(3); // 多态调用
        }
    }
}
