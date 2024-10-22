package com.company.javaRelearn.ConcurrentLectures_20241021;

public class Example5_823_20241021 {
    public static void main(String[] args) {
        Thread5_823_20241021 thread5_823_20241021 = new Thread5_823_20241021();
        new Thread(thread5_823_20241021, "窗口1").start();
        new Thread(thread5_823_20241021, "窗口2").start();
        new Thread(thread5_823_20241021, "窗口3").start();
        new Thread(thread5_823_20241021, "窗口4").start();
    }
}
