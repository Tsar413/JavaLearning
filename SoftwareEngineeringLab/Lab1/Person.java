package com.company.javaRelearn.SoftwareEngineeringLab.Lab1;

import java.io.PrintStream;

public class Person {
    public	Person(String n, dob person_birth_date)	{
        name = n;
        birth_date = person_birth_date;
        boss = null;
        nworkers = 0;
    }

    public	Person(String n, dob person_birth_date, int person_type)	{
        name = n;
        birth_date = person_birth_date;
        type = person_type;
        boss = null;
        nworkers = 0;

        if(type == 1) // 1 = Boss
            worker = new Person[max_nworkers];
        else
            worker = null;
    }

    public void print(PrintStream ps)	{
        ps.print(String.format("%s: born on %02d/%02d/%4d", name, birth_date.get_dob_day(), birth_date.get_dob_month(), birth_date.get_dob_year()));
        if (type == 1)	{
            ps.print(" bosses: ");
            for (int i = 0; i < nworkers; i++)
                ps.print(worker[i].name+" ");
        }
        else
            ps.print(" is bossed by "+boss.name);
    }

    public void setBoss(Person person_boss) {
        this.boss = person_boss;
    }

    public void addWorker(Person person_worker) {
        this.worker[nworkers++] = person_worker;
    }


    public void addAndSetWorker(Person person_worker) {
        this.addWorker(person_worker);
        person_worker.setBoss(this);
    }

    public Person[] getWorker() {
        return worker;
    }

    public String getName() {
        return name;
    }

    public String getBossName() {
        return boss.name;
    }

    private	String	name;
    private	dob	birth_date;	// date of birth
    private	int	type;	// 1 = Boss, 2 = Worker
    private	Person	boss;
    private	Person[] worker;
    private	int	nworkers;

    private static int max_nworkers = 10;

}
