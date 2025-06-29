package com.company.javaRelearn.SEReview.Lab.Lab2_1;

import java.io.PrintStream;

public class Worker extends Person {
    private Boss boss;

    public Worker(String n, DoB person_birth_date) {
        super(n, person_birth_date);
    }

    public void setBoss(Boss person_boss) {
        this.boss = person_boss;
    }

    public	void print(PrintStream ps)	{
        ps.print(String.format("%s: born on %02d/%02d/%4d", this.getName(),
                this.getBirthDate().get_dob_day(), this.getBirthDate().get_dob_month(),
                this.getBirthDate().get_dob_year()));

        ps.print(" is bossed by "+boss.name);
    }
}
