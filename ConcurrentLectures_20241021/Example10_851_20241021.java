package com.company.javaRelearn.ConcurrentLectures_20241021;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example10_851_20241021 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new Thread10_851_20241021());
        service.submit(new Thread10_851_20241021());
        service.submit(new Thread10_851_20241021());
        service.submit(new Thread10_851_20241021());
    }
}
