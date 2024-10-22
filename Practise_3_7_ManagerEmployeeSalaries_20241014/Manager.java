package com.company.javaRelearn.Practise_3_7_ManagerEmployeeSalaries_20241014;

public class Manager extends Employee {

    String level = "";

    public Manager(String level) {
        this.level = level;
    }

    public Manager(int id, int wage, int age, String level) {
        super(id, wage, age);
        this.level = level;
    }

    public Manager(String name, String address, int id, int wage, int age, String level) {
        super(name, address, id, wage, age);
        this.level = level;
    }

    public Manager() {}

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public void add() {
        if(level.equals("Manager")){
            super.setWage((int) (super.getWage() * 1.2));
        }
        super.setWage((int) (super.getWage() * 1.1));
    }
}
