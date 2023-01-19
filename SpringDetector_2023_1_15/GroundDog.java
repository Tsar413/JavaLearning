package com.company.javaRelearn.SpringDetector_2023_1_15;

public class GroundDog {
    protected int number;
    public GroundDog(int n) {
        this.number = n;
    }

    @Override
    public String toString() {
        return "GroundDog #" + number;
    }
}
