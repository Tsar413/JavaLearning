package com.company.javaRelearn.SoftwareEngineeringLab.Lab1;

import java.io.PrintStream;

public class Worker extends Person {
    private	String	name;
    private dob birth_date;	// date of birth
    private	int	type;	// 1 = Boss, 2 = Worker
    private	Person	boss;

    public Worker(String n, dob person_birth_date) {
        super(n, person_birth_date);
        this.name = n;
        this.birth_date = person_birth_date;
//        this.type = 2;
    }

    public void setBoss(Person person_boss) {
        this.boss = person_boss;
    }

    public void print(PrintStream ps)	{
        ps.print(String.format("%s: born on %02d/%02d/%4d", name, birth_date.get_dob_day(), birth_date.get_dob_month(), birth_date.get_dob_year()));
        ps.print(" is bossed by "+boss.getBossName());
    }

    public void addAndSetWorker(Person person_worker) {
        this.addWorker(person_worker);
        person_worker.setBoss(this);
    }
}
