package com.company.javaRelearn.ConcurrentLectures_20241021;

public class Thread4_823_20241021 extends Thread {
    private int count = 100;

    public void run(){
        while (count > 0){
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + "发售" + count);
            count--;
        }
    }
}
