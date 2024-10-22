package com.company.javaRelearn.ConcurrentLectures_20241021;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example8_843_20241021 {
    public static void main(String[] args) {
        Thread thread1 = new Thread8_843_20241021("线程1");
        Thread thread2 = new Thread8_843_20241021("线程2");
        thread1.start();
        thread2.start();

    }
}
