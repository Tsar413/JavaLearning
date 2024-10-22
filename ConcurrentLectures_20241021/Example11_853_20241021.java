package com.company.javaRelearn.ConcurrentLectures_20241021;

import javax.crypto.ExemptionMechanism;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example11_853_20241021 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new Thread11_853_20241021());
        service.submit(new Thread11_853_20241021());
        service.submit(new Thread11_853_20241021());
        service.submit(new Thread11_853_20241021());
    }

}
