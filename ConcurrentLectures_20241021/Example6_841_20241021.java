package com.company.javaRelearn.ConcurrentLectures_20241021;

public class Example6_841_20241021 {
    public static void main(String[] args) {
        Thread6_MaxPriority_841_20241021 thread1 = new Thread6_MaxPriority_841_20241021();
        Thread6_MinPriority_841_20241021 thread2 = new Thread6_MinPriority_841_20241021();
        Thread thread1_1 = new Thread(thread1);
        Thread thread2_1 = new Thread(thread2);
        thread1_1.setPriority(Thread.MAX_PRIORITY);
        thread2_1.setPriority(Thread.MIN_PRIORITY);
        thread1_1.start();
        thread2_1.start();
    }
}
