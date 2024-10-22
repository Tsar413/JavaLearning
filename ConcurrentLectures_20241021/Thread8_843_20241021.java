package com.company.javaRelearn.ConcurrentLectures_20241021;

public class Thread8_843_20241021 extends Thread {
    public Thread8_843_20241021(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "运行" + i);
            if(i == 5){
                System.out.println("线程让步");
                Thread.yield();
            }
        }
    }
}
