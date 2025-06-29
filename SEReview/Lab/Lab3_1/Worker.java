package com.company.javaRelearn.SEReview.Lab.Lab3_1;

public class Worker extends Person {
    private Boss boss;

    public Worker(String personName, Date personDOB, Boss boss) {
        super(personName, personDOB);
        this.boss = boss;
        this.boss.add_worker(this);
    }

    public void new_boss(Boss b) {
        this.boss.sub_worker(this);
        this.boss = b;
        this.boss.add_worker(this);
    }

    public Boss get_boss() {
        return boss;
    }
}
