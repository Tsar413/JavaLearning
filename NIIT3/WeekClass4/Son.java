package com.company.javaRelearn.NIIT3.WeekClass4;

public class Son extends Father {
    private double livingExpenses; //生活费

    public Son(){}

    public Son(double livingExpenses) {
        this.livingExpenses = livingExpenses;
    }

    public Son(String name, int age, double livingExpenses) {
        super(name, age);
        this.livingExpenses = livingExpenses;
    }

    @Override
    public String toString() {
        return super.toString() + "生活费：" + livingExpenses;
    }
}
