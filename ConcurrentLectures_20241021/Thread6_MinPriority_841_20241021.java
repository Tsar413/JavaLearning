package com.company.javaRelearn.ConcurrentLectures_20241021;

public class Thread6_MinPriority_841_20241021 implements Runnable {
    private int count = 10;

    @Override
    public void run() {
        while (count > 0){
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + "运行" + count);
            count--;
        }
    }
}
