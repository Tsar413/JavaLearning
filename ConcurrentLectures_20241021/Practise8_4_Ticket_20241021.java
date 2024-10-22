package com.company.javaRelearn.ConcurrentLectures_20241021;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practise8_4_Ticket_20241021 {
    private int count = 0;
    private int left = 10;
    private int time = 0;

    public void run(String people, int time1) throws InterruptedException {
        while (true){
            synchronized (this){
                if(left <= 0){
                    break;
                }
                if(time1 == 300){
                    if(count < 10){
                        Thread.sleep(300);
                        time += time1;
                        count++;
                        left--;
                        System.out.println("已抢票" + count + "次 耗时" + time);
                    }
                    if(count == 10){
                        System.out.println(people + "已抢到");
                    }
                } else {
                    if(count < 10){
                        Thread.sleep(800);
                        time += time1;
                        count++;
                        left--;
                        System.out.println("已抢票" + count + "次 耗时" + time);
                    }
                    if(count == 10){
                        System.out.println(people + "已抢到");
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Practise8_4_Ticket_20241021 practise = new Practise8_4_Ticket_20241021();
        practise.run("a", 300);
    }
}
