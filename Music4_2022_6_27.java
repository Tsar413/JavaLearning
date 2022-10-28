package com.company.javaRelearn;

enum Note2 {
    MIDDLE_C
}

abstract class Instrument4 {
    abstract void play(Note2 n);
    String what() {
        return "Instrument4";
    }
    abstract void adjust();
}

class Wind4 extends Instrument4 {
    void play(Note2 n) {
        System.out.println("Wind4.play()" + n);
    }
    String what() {return "Wind4";}
    void adjust() {}
}

class Percussion4 extends Instrument4 {
    void play(Note2 n) {
        System.out.println("Percussion4.play()" + n);
    }
    String what() {return "Percussion4";}
    void adjust() {}
}

class Stringed4 extends Instrument4 {
    void play(Note2 n) {
        System.out.println("Stringed4.play()" + n);
    }
    String what() {return "Stringed4";}
    void adjust() {}
}

class Woodwind4 extends Wind4 {
    void play(Note2 n) {
        System.out.println("Woodwind4.play()" + n);
    }
    String what() {return "Woodwind4";}
}

class Brass4 extends Wind4 {
    void play(Note2 n) {
        System.out.println("Brass4.play()" + n);
    }
    String what() {return "Brass4";}
}

public class Music4_2022_6_27 {
    static void tune(Instrument4 i) {
        i.play(Note2.MIDDLE_C);
    }

    static void tuneAll(Instrument4[] i) {
        for (Instrument4 s : i) {
            tune(s);
        }
    }

    public static void main(String[] args) {
        Instrument4[] instrument4 = {
                new Wind4(),
                new Percussion4(),
                new Stringed4(),
                new Woodwind4(),
                new Brass4()
        };
        tuneAll(instrument4);
    }
}
