package com.company.javaRelearn.SEReview.Lab.Lab3_2;

import java.io.PrintStream;

public class Worker extends Person {
    private Boss boss;

    public Worker(String n, Date d, Boss boss) throws LoPX {
        super(n, d);
        this.boss = boss;
        boss.add_worker(this);
    }

    public void assignBoss(Boss b) throws LoPX {
        boss = b;
        boss.add_worker(this);
    }

    public Boss get_boss() {
        return boss;
    }

    public void new_boss(Boss b) throws LoPX { //The Boss of Worker changes and the new Boss becomes b
        boss.sub_worker(this);
        boss = b;
        boss.add_worker(this);
    }

    public void print(PrintStream ps) {
        super.print(ps);
        ps.print(": bossed by " + boss.getName());
    }
}
