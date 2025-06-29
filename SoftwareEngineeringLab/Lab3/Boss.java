package com.company.javaRelearn.SoftwareEngineeringLab.Lab3;

import java.io.PrintStream;

public class Boss extends Person {
    private	String	name;
    private Date dob;
    private	Person[] worker;
    private	int	nworkers;

    public Boss(String personName, Date personDOB) {
        super(personName, personDOB);
        this.name = personName;
        this.dob = personDOB;
        worker = new Person[100];
    }

    public void print(PrintStream ps)	{
        ps.print(String.format("%s: born on %02d/%02d/%4d", name, dob.getDay(), dob.getMonth(), dob.getYear()));
        ps.print(" bosses: ");
        for (int i = 0; i < nworkers; i++)
            ps.print(worker[i].getName()+" ");
    }

    public void addWorker(Person person_worker) {
        this.worker[nworkers++] = person_worker;
    }

    public void subWorker(Person person_worker) {
        int index = 0;
        for (int i = 0; i < worker.length; i++) {
            if (worker[i].equals(person_worker)) {
                index = i;
            }
        }
        if (worker.length - index >= 0)
            System.arraycopy(worker, index + 1, worker, index, worker.length - index);

    }
}
