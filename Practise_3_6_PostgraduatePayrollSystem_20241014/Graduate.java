package com.company.javaRelearn.Practise_3_6_PostgraduatePayrollSystem_20241014;

public class Graduate implements StudentManageInterface, TeacherManageInterface {
    private String name;
    private int tuition;
    private int income;

    public Graduate() {
    }

    public Graduate(String name, int tuition, int income) {
        this.name = name;
        this.tuition = tuition;
        this.income = income;
    }

    @Override
    public int getFree() {
        return tuition;
    }

    @Override
    public void setFree(int tuition) {
        this.tuition = tuition;
    }

    @Override
    public int getPay() {
        return income;
    }

    @Override
    public void setPay(int income) {
        this.income = income;
    }

    public String getLoan(){
        if(income - tuition < 2000){
            return "provide a loan";
        }
        return "don't need a loan";
    }
}
