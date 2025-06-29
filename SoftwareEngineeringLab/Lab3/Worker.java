package com.company.javaRelearn.SoftwareEngineeringLab.Lab3;

import java.io.PrintStream;

public class Worker extends Person {
    private	String	name;
    private Date dob;
    private	int	type;	// 1 = Boss, 2 = Worker
    private Person boss;

    public Worker(String personName, Date personDOB) {
        super(personName, personDOB);
    }

    public void print(PrintStream ps)	{
        ps.print(String.format("%s: born on %02d/%02d/%4d", name, dob.getDay(), dob.getMonth(), dob.getYear()));
        ps.print(" is bossed by "+boss.getName());
    }

    public Worker next() {
        return this;
    }

    public void Reset() {

    }
}
