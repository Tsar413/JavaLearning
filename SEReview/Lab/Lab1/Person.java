package com.company.javaRelearn.SEReview.Lab.Lab1;

import com.company.javaRelearn.SoftwareEngineeringLab.Lab1.Worker;

import java.io.PrintStream;

public class Person {
    private String name;
//    private int dob_d, dob_m, dob_y;    // date of birth
    private DoB doB;    // date of birth
    private int type;    // 1 = Boss, 2 = Worker
    private Person boss;
    private Person[] worker;
    private int nworkers;

//    public Person(String n, int d, int m, int y) {
//        name = n;
//        dob_d = d;
//        dob_m = m;
//        dob_y = y;
//
//        boss = null;
//        worker = null;
//        nworkers = 0;
//    }

//    public Person(String n, DoB doB) {
//        name = n;
//        this.doB = doB;
//
//        boss = null;
//        worker = null;
//        nworkers = 0;
//    }

    public Person(String n, DoB doB, int type) {
        name = n;
        this.doB = doB;
        this.type = type;
        this.boss = null;
        this.nworkers = 0;

        if (type == 1) {
            this.worker = new Person[10];
        } else if (type == 2) {
            this.worker = null;
        }
    }

//    public void print(PrintStream ps) {
//        ps.print(String.format("%s: born on %02d/%02d/%4d", name, dob_d, dob_m, dob_y));
//        if (type == 1) {
//            ps.print(" bosses: ");
//            for (int i = 0; i < nworkers; i++)
//                ps.print(worker[i].name + " ");
//        } else
//            ps.print(" is bossed by " + boss.name);
//    }

    public void print(PrintStream ps) {
        ps.print(String.format("%s: born on %02d/%02d/%4d", name, doB.getDob_d(), doB.getDob_m(), doB.getDob_y()));
        if (type == 1) {
            ps.print(" bosses: ");
            for (int i = 0; i < nworkers; i++)
                ps.print(worker[i].name + " ");
        } else
            ps.print(" is bossed by " + boss.name);
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    public int getDob_d() {
//        return dob_d;
//    }
//
//    public void setDob_d(int dob_d) {
//        this.dob_d = dob_d;
//    }
//
//    public int getDob_m() {
//        return dob_m;
//    }
//
//    public void setDob_m(int dob_m) {
//        this.dob_m = dob_m;
//    }
//
//    public int getDob_y() {
//        return dob_y;
//    }
//
//    public void setDob_y(int dob_y) {
//        this.dob_y = dob_y;
//    }

//    public int getType() {
//        return type;
//    }
//
    public void setType(int type) {
        this.type = type;
    }

//    public Person getBoss() {
//        return boss;
//    }

    public void setBoss(Person boss) {
        this.boss = boss;
    }

//    public Person[] getWorker() {
//        return worker;
//    }

    public void setWorker(Person[] worker) {
        this.worker = worker;
    }

//    public int getNworkers() {
//        return nworkers;
//    }
//
//    public void setNworkers(int nworkers) {
//        this.nworkers = nworkers;
//    }

    public void addWorker(Person worker) {
        this.worker[this.nworkers++] = worker;
    }
}
