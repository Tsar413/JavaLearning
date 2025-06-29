package com.company.javaRelearn.SEReview.Lab.Lab3_2;

public class LoPX extends Exception {
    private int max;
    private Person per;

    public LoPX(int m, Person p) {
        super("Lop size limit exceeded");
        max = m;
        per = p;
    }

    public LoPX() {
        super("Lop size limit exceeded");
    }

    public int getSize() {
        return max;
    }

    public Person getPerson() {
        return per;
    }
}
