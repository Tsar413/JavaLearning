package com.company.javaRelearn.SoftwareEngineeringLab.Lab1;

public class Main1 {
    public static void main(String[] args)	{


        Person	w1 = new Person("aaa", new dob(1, 2, 1991), 2);
        Person	w2 = new Person("bbb", new dob(3, 4, 1993), 2);
        Person	w3 = new Person("ccc", new dob(5, 6, 1995), 2);

        Person	b1 = new Person("ddd", new dob(7, 8, 1997), 1);
        Person	b2 = new Person("eee", new dob(9,10, 1999), 1);

        b1.addAndSetWorker(w1);
        b1.addAndSetWorker(w2);
        b1.addAndSetWorker(w3);

        b1.print(System.err); System.err.print("\n");
        b2.print(System.err); System.err.print("\n");
        w1.print(System.err); System.err.print("\n");
        w2.print(System.err); System.err.print("\n");
        w3.print(System.err); System.err.print("\n");
    }
}
