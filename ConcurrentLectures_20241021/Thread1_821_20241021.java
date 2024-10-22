package com.company.javaRelearn.ConcurrentLectures_20241021;

public class Thread1_821_20241021 extends Thread {
    private int count = 0;

    public void run(){
        while (count < 10){
            System.out.println("线程" + this.getClass().getSimpleName() + "正在运行" + count);
            count++;
        }
    }
}
