package com.company.javaRelearn;

class Instruction {
    public void play() {}
    public static void tune(Instruction i) {
        i.play();
    }
}

public class Wind_2022_6_21 extends Instruction {
    public static void main(String[] args) {
        Wind_2022_6_21 wind = new Wind_2022_6_21();
        Instruction.tune(wind);
    }
}
