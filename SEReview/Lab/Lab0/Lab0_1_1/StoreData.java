package com.company.javaRelearn.SEReview.Lab.Lab0.Lab0_1_1;

public class StoreData {
    private int numberA;
    private int numberB;
    private int numberC;
    private boolean allNumbersSet;

    public StoreData() {

    }

    public StoreData(int numberA, int numberB, int numberC, boolean allNumbersSet) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
        this.allNumbersSet = allNumbersSet;
    }

    public int getNumberA() {
        return numberA;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    public int getNumberC() {
        return numberC;
    }

    public void setNumberC(int numberC) {
        this.numberC = numberC;
    }

    public boolean isAllNumbersSet() {
        return allNumbersSet;
    }

    public void setAllNumbersSet(boolean allNumbersSet) {
        this.allNumbersSet = allNumbersSet;
    }
}
