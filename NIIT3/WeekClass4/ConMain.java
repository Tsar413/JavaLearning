package com.company.javaRelearn.NIIT3.WeekClass4;

public class ConMain {
    public static void main(String[] args) {
        Father father = new Father("a", 40);
        Son son1 = new Son(1000);
        System.out.println(father);
        System.out.println(son1);
        Son son2 = new Son("a1", 15, 500);
        System.out.println(son2);
        Father father1 = new Son("a2", 18, 3000); //多态 运行时多态 向上转型
        System.out.println(father1);
    }
}
