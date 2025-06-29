package com.company.javaRelearn.SEReview.Lab.Lab3_1;

import java.io.PrintStream;

public class Boss extends Person {
    private Lop workers;

    public Boss(String personName, Date personDOB) {
        super(personName, personDOB);
        workers = new Lop();
    }

    public void add_worker(Worker w) {
        workers.add(w);
    }

    public void sub_worker(Worker w) {
        workers.remove(w);
    }

    public void print(PrintStream ps) {

        ps.println();
    }
}
