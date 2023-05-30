package com.company.javaRelearn.Concurrency_2023_2_28;

public class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    @Override
    public int next() {
        ++ currentEvenValue;
        ++ currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecked.test(new EvenGenerator());
    }
}
