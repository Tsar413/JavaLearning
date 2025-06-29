package com.company.javaRelearn.SoftwareEngineeringLab.Lab0;

public class Sum {
    private int numberA;
    private int numberB;

    public void sum(int numberA, int numberB) {
        int result = numberA + numberB;
        System.out.println("sum: " + result);
    }

    public void sum(DataCoupling dataCoupling) {
        int result = dataCoupling.numberA + dataCoupling.numberB;
        System.out.println("sum: " + result);
    }

    public void sendNumberA(int numberA) {
        this.numberA  = numberA;
    }

    public void sendNumberB(int numberB) {
        this.numberB  = numberB;
    }

    public void sum() {
        int result = numberA + numberB;
        System.out.println("sum: " + result);
    }
}
