package com.company.javaRelearn.SEReview;

class DataMax {
    private int max;

    public DataMax() {}

    public DataMax(int max) {
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        if (this.max < max) {
            this.max = max;
        } else {
            System.out.println(this.max);
        }
    }
}

public class SafeClasses {
}
