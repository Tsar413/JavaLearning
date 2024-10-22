package com.company.javaRelearn.ConcurrentLectures_20241021;

public class Thread5_823_20241021 implements Runnable {
    private int count = 100;

    @Override
    public void run() {
        while (count > 0){
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + "发售" + count);
            count--;
        }
    }
}
