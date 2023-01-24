package com.company.javaRelearn.SpringDetector_2023_1_15;

public class GroundDog2 extends GroundDog {

    public GroundDog2(int n) {
        super(n);
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof GroundDog2 &&
                (number == ((GroundDog2)o).number);
    }
}
