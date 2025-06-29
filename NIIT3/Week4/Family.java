package com.company.javaRelearn.NIIT3.Week4;

class Father{
    private String name;
    private int age;

    public Father() {
    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String display(){
        return "姓名：" + name + "年龄" + age;
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Son extends Father{
    private double livingExpenses;

    public Son() {
    }

    public Son(double livingExpenses) {
        this.livingExpenses = livingExpenses;
    }

    public Son(String name, int age, double livingExpenses) {
        super(name, age);
        this.livingExpenses = livingExpenses;
    }

    public void add(){
        System.out.println(1);
    }

    @Override
    public String display() {
        return super.display() + "生活费:" + livingExpenses;
    }
}

public class Family {
    public static void main(String[] args) {
        Son son = new Son("son", 10, 5.0);
        System.out.println(son.display());
        Father father = new Son("son1", 5, 0.0);
        System.out.println(father.display());
    }
}
