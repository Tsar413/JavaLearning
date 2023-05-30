package com.company.javaRelearn.Concurrency_2023_2_28;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenChecked implements Runnable {
    private IntGenerator generator;
    private final int id;

    public EvenChecked(IntGenerator generator, int id) {
        this.generator = generator;
        this.id = id;
    }

    @Override
    public void run() {
        while (!generator.isCanceled()) {
            int val = generator.next();
            if (val % 2 != 0) {
                System.out.println(val + " not even!");
                generator.cancel();
            }
        }
    }

    public static void test(IntGenerator gp, int count) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            exec.execute(new EvenChecked(gp, i));
        }
        exec.shutdown();
    }

    public static void test(IntGenerator gp) {
        test(gp, 10);
    }
}
