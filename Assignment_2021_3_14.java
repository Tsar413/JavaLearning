package com.company.javaRelearn;

class Tank {
    int level;
}

public class Assignment_2021_3_14 {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("t1 = " + t1.level + " t2 = " + t2.level + "\n");
        t1 = t2;
        System.out.println("t1 = " + t1.level + " t2 = " + t2.level + "\n");
        t1.level = 27;
        System.out.println("t1 = " + t1.level + " t2 = " + t2.level + "\n");
    }
}
