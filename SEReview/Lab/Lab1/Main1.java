package com.company.javaRelearn.SEReview.Lab.Lab1;

public class Main1 {
    public static void main(String[] args) {
//        Person w1 = new Person("aaa", 1, 2, 1991);
//        Person w1 = new Person("aaa", new DoB(1,2,1991));
//        w1.setType(2);
        Person w1 = new Person("aaa", new DoB(1,2,1991), 2);
//        Person w2 = new Person("bbb", 3, 4, 1993);
//        Person w2 = new Person("bbb", new DoB(3,4,1993));
//        w2.setType(2);
        Person w2 = new Person("bbb", new DoB(3,4,1993), 2);
//        Person w3 = new Person("ccc", 5, 6, 1995);
//        Person w3 = new Person("bbb", new DoB(5,6,1995));
//        w3.setType(2);
        Person w3 = new Person("bbb", new DoB(5,6,1995), 2);

//        Person b1 = new Person("ddd", 7, 8, 1997);
//        Person b1 = new Person("ddd", new DoB(7,8,1997));
//        b1.setType(1);
//        b1.setWorker(new Person[10]);
        Person b1 = new Person("ddd", new DoB(7,8,1997), 1);

//        Person b2 = new Person("eee", 9, 10, 1999);
//        Person b2 = new Person("eee", new DoB(9,10,1999));
//        b2.setType(1);
//        b2.setWorker(new Person[10]);
        Person b2 = new Person("eee", new DoB(9,10,1999), 1);

        w1.setBoss(b1);
//        b1.worker[b1.nworkers++] = w1;
        b1.addWorker(w1);
        w2.setBoss(b1);
//        b1.worker[b1.nworkers++] = w2;
        b1.addWorker(w2);
        w3.setBoss(b1);
//        b1.worker[b1.nworkers++] = w3;
        b1.addWorker(w3);

        b1.print(System.err);
        System.err.print("\n");
        b2.print(System.err);
        System.err.print("\n");
        w1.print(System.err);
        System.err.print("\n");
        w2.print(System.err);
        System.err.print("\n");
        w3.print(System.err);
        System.err.print("\n");
    }
}
