package com.company.javaRelearn.ConcurrentLectures_20241021;

public class Example1_821_20241021 {
    public static void main(String[] args) {
        Thread1_821_20241021 thread = new Thread1_821_20241021();
        thread.run();
        thread.start();
        int count = 11;
        while (count <= 20){
            System.out.println("主线程运行" + count);
            count++;
        }

    }
}
