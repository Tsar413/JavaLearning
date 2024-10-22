package com.company.javaRelearn.ConcurrentLectures_20241021;

public class Example9_844_20241021 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Thread9_844_20241021(), "线程1");
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程运行" + i);
            if(i == 2){
                thread.join();
            }
            Thread.sleep(500);
        }
    }
}
