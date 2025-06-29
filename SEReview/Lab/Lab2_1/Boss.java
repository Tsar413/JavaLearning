package com.company.javaRelearn.SEReview.Lab.Lab2_1;

import java.io.PrintStream;

public class Boss extends Person {
    private Person[] worker;
    private int nworkers;


    public Boss(String n, DoB person_birth_date) {
        super(n, person_birth_date);
        this.nworkers = 0;
        worker = new Person[10];
    }

    public void addWorker(Person person_worker) {
        this.worker[nworkers++] = person_worker;
    }


    public void addAndSetWorker(Worker person_worker) {
        this.addWorker(person_worker);
        person_worker.setBoss(this);
    }

    public void print(PrintStream ps) {
        ps.print(String.format("%s: born on %02d/%02d/%4d", this.getName(),
                this.getBirthDate().get_dob_day(), this.getBirthDate().get_dob_month(),
                this.getBirthDate().get_dob_year()));

        ps.print(" is boss of: ");
        for (int i = 0; i < nworkers; i++)
            ps.print(worker[i].name + " ");
    }
}
