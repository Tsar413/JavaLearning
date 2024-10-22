package com.company.javaRelearn.ConcurrentLectures_20241021;

public class Thread3_822_20241021 implements Runnable {

    @Override
    public void run() {
        int count = 0;
        while (count < 10){
            System.out.println("线程" + this.getClass().getSimpleName() + "正在运行" + count);
            count++;
        }
    }
}
