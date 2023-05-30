package com.company.javaRelearn.Concurrency_2023_2_28;

public class SynchronizedEvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    @Override
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecked.test(new SynchronizedEvenGenerator());
    }
}
