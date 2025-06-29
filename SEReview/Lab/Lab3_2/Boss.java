package com.company.javaRelearn.SEReview.Lab.Lab3_2;

import java.io.PrintStream;

public class Boss extends Person {
    private LoP workers;

    public Boss(String n, Date d) {
        super(n, d);
        workers = new LoP();
    }

    public void add_worker(Worker w) throws LoPX {
        workers.add(w);
    }

    public void sub_worker(Worker w) {
        workers.remove(w);
    }

    public Person[] getWorkers() {
        return workers.getList();
    }

    public void print(PrintStream ps) {
        super.print(ps);
        workers.reset();
        if (workers.hasNext())
            ps.print(": bosses: " + workers.next().getName());
        while (workers.hasNext())
            ps.print(", " + workers.next().getName());
    }
}
