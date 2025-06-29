package com.company.javaRelearn.SEReview.Lab.Lab1;

public class DoB {
    private int dob_d, dob_m, dob_y = 0;

    public DoB() {}

    public DoB(int dob_d, int dob_m, int dob_y) {
        this.dob_d = dob_d;
        this.dob_m = dob_m;
        this.dob_y = dob_y;
    }

    public int getDob_d() {
        return dob_d;
    }

    public int getDob_m() {
        return dob_m;
    }

    public int getDob_y() {
        return dob_y;
    }
}
