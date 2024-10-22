package com.company.javaRelearn.ConcurrentLectures_20241021;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example3_822_20241021 {
    public static void main(String[] args) {
        Thread3_822_20241021 thread3_822_20241021 = new Thread3_822_20241021();
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(thread3_822_20241021);
    }
}
