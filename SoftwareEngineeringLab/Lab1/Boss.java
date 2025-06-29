package com.company.javaRelearn.SoftwareEngineeringLab.Lab1;

import java.io.PrintStream;

public class Boss extends Person {
    private	String	name;
    private dob birth_date;	// date of birth
    private	int	type;	// 1 = Boss, 2 = Worker
    private	Person[] worker;
    private	int	nworkers;

    private static int max_nworkers = 10;

    public Boss(String n, dob person_birth_date) {
        super(n, person_birth_date);
        this.name = n;
        this.birth_date = person_birth_date;
        nworkers = 0;
        worker = new Person[max_nworkers];
//        this.type = 2;
    }

    public void print(PrintStream ps)	{
        ps.print(String.format("%s: born on %02d/%02d/%4d", name, birth_date.get_dob_day(), birth_date.get_dob_month(), birth_date.get_dob_year()));
        ps.print(" bosses: ");
        for (int i = 0; i < nworkers; i++)
            ps.print(worker[i].getName()+" ");
    }

    public void addWorker(Person person_worker) {
        this.worker[nworkers++] = person_worker;
    }


    public void addAndSetWorker(Person person_worker) {
        this.addWorker(person_worker);
        person_worker.setBoss(this);
    }
}
