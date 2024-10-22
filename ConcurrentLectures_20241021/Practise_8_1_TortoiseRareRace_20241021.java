package com.company.javaRelearn.ConcurrentLectures_20241021;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practise_8_1_TortoiseRareRace_20241021 {
    private static int length1 = 0;
    private static int length2 = 0;

    class Tortoise implements Runnable{
        @Override
        public void run() {
            while (length1 <= 800 || length2 <= 800){
                if(length2 == 700){
                    System.out.println("兔子在睡觉，乌龟爬行" + length1);
                    length1++;
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    length1++;
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(length1 % 100 == 0 || length2 % 100 == 0){
                    System.out.println("兔子奔跑" + length2 + "乌龟爬行" + length1);
                }
                if(length1 == 800){
                    System.out.println("乌龟赢了");
                    break;
                }
                if(length2 == 800){
                    System.out.println("兔子赢了");
                    break;
                }
            }
        }
    }

    class Rare implements Runnable{
        @Override
        public void run() {
            while (length1 <= 800 || length2 <= 800){
                if(length2 == 700){
                    try {
                        Thread.sleep(10000);
                        length2++;
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    length2++;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(length1 % 100 == 0 || length2 % 100 == 0){
                    System.out.println("兔子奔跑" + length2 + "乌龟爬行" + length1);
                }
                if(length1 == 800){
                    System.out.println("乌龟赢了");
                    break;
                }
                if(length2 == 800){
                    System.out.println("兔子赢了");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new Practise_8_1_TortoiseRareRace_20241021().new Tortoise());
        service.submit(new Practise_8_1_TortoiseRareRace_20241021().new Rare());
    }
}
