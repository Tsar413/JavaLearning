package com.company.javaRelearn;

enum Note3 {
    MIDDLE_C
}

interface Instruction5 {
    int value = 5;
    void play(Note3 n);
    void adjust();
}

class Wind5 implements Instruction5 {
    public void play(Note3 n) {
        System.out.println(this + ".play()" + n);
    }
    public String toString() {
        return "Wind5";
    }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Percussion5 implements Instruction5 {
    public void play(Note3 n) {
        System.out.println(this + ".play()" + n);
    }
    public String toString() {
        return "Percussion5";
    }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Stringed5 implements Instruction5 {
    public void play(Note3 n) {
        System.out.println(this + ".play()" + n);
    }
    public String toString() {
        return "Stringed5";
    }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Woodwind5 extends Wind5 {
    public String toString() {
        return "Woodwind5";
    }
}

class Brass5 extends Wind5 {
    public String toString() {
        return "Brass5";
    }
}

public class Music5_2022_6_28 {
    static void tune (Instruction5 i) {
        i.play(Note3.MIDDLE_C);
    }

    static void tuneAll (Instruction5[] i) {
        for (Instruction5 s : i) {
            tune(s);
        }
    }

    public static void main(String[] args) {
        Instruction5[] instruction5 = {
                new Wind5(),
                new Percussion5(),
                new Stringed5(),
                new Woodwind5(),
                new Brass5()
        };
        tuneAll(instruction5);
    }
}
