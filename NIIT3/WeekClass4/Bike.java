package com.company.javaRelearn.NIIT3.WeekClass4;

public class Bike {
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
        if(!isRented){
            isRented = true;
            rentCount++;
            System.out.println("已经借出");
        } else {
            System.out.println("没有被借走");
        }
    }

    // 归还单车
    public void returnBike() {
        if(isRented){
            isRented = false;
            System.out.println("已归还");
        } else {
            System.out.println("未被租借");
        }
    }

    // 显示单车信息
    public void displayInfo() {
        System.out.println("编号" + id + (isRented ? "已借出" : "未借出") + "租借次数" + rentCount);
    }
}
