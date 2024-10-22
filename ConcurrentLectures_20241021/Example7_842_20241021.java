package com.company.javaRelearn.ConcurrentLectures_20241021;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example7_842_20241021 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new Thread7_842_20241021());
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程运行" + i);
            Thread.sleep(3000);
        }
    }
}
