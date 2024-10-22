package com.company.javaRelearn.ConcurrentLectures_20241021;

public class Thread10_851_20241021 implements Runnable {
    private static int count = 10;
    Object lock = new Object();

    @Override
    public void run() {
        while (count > 0){
            synchronized (lock){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(count > 0){
                    System.out.println(Thread.currentThread().getName() + "卖出" + count);
                    count--;
                }
            }
        }
    }
}
