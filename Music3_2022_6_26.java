package com.company.javaRelearn;

enum Note {
    MIDDLE_C
}

class Instruction3 {
    public void play(Note n) {
        System.out.println("Instruction:" + n);
    }
    String what() {
        return "Instruction3";
    }
    public void adjust() {
        System.out.println("Adjusting Instruction");
    }
}

class Wind extends Instruction3 {
    public void play(Note n) {
        System.out.println("Wind:" + n);
    }
    String what() {
        return "Wind";
    }
    public void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instruction3 {
    public void play(Note n) {
        System.out.println("Percussion:" + n);
    }
    String what() {
        return "Percussion";
    }
    public void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instruction3 {
    public void play(Note n) {
        System.out.println("Stringed:" + n);
    }
    String what() {
        return "Stringed";
    }
    public void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Woodwind extends Wind {
    public void play(Note n) {
        System.out.println("Woodwind:" + n);
    }
    String what() {
        return "Woodwind";
    }
}

class Brass extends Wind {
    public void play(Note n) {
        System.out.println("Brass:" + n);
    }
    String what() {
        return "Brass";
    }
}

public class Music3_2022_6_26 {
    public static void tune(Instruction3 i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instruction3[] e) {
        for (Instruction3 s : e) {
            tune(s);
        }
    }

    public static void main(String[] args) {
        Instruction3[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
