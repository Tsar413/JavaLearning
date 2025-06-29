package com.company.javaRelearn.NIIT3.Week8;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class DiffBetweenThreads implements Runnable{
    private static int index = 0;

    public void add() throws InterruptedException {
        long startTime = System.nanoTime();
        while (index < 20){
            index++;
            System.out.println(Thread.currentThread().getName() + ":" + index);
            Thread.sleep(1000);
        }
        long endTime = System.nanoTime();
        System.out.println("持续时间：" + (endTime - startTime) / 1_000_000_000);
    }

    @Override
    public void run() {
        try {
            add();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class RunDiffThreads{
    public static void main(String[] args) {
        DiffBetweenThreads diffBetweenThreads = new DiffBetweenThreads();
        if(true){
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.submit(diffBetweenThreads);
            executorService.submit(diffBetweenThreads);
            executorService.submit(diffBetweenThreads);
            executorService.submit(diffBetweenThreads);
            executorService.shutdown();
        } else {
            try {
                diffBetweenThreads.add();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadFunction extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class RunnableFunction implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class RunMilThreads{
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            new ThreadFunction().start();
//        }
//        Thread[] threads = new Thread[5];
//        for (int i = 0; i < 5; i++) {
//            threads[i] = new Thread(new RunnableFunction());
//            threads[i].start();
//        }

        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            service.submit(new RunnableFunction());
        }
        service.shutdown();
    }
}

class ThreadsEx1 extends Thread{
    private String bird;

    ThreadsEx1(String bird){
        this.bird = bird;
    }

    public void birdSing(){
        System.out.println(bird + " is singing");
    }

    public void birdFly(){
        System.out.println(bird + " is flying");
    }

    @Override
    public void run(){
        birdSing();
        birdFly();
    }
}

class ThreadsEx2 implements Runnable{
    private String bird;

    ThreadsEx2(String bird){
        this.bird = bird;
    }

    public void birdSing(){
        System.out.println(bird + " is singing");
    }

    public void birdFly(){
        System.out.println(bird + " is flying");
    }

    @Override
    public void run(){
        birdSing();
        birdFly();
    }
}

class ThreadExWork{
    public static void main(String[] args) {
//        ThreadsEx1 thread1 = new ThreadsEx1("bird1");
//        ThreadsEx1 thread2 = new ThreadsEx1("bird2");
//        thread1.start();
//        thread2.start();

        ThreadsEx2 thread1 = new ThreadsEx2("bird1");
        ThreadsEx2 thread2 = new ThreadsEx2("bird2");
//        Thread[] threads = new Thread[6];
//        for (int i = 0; i < threads.length; i+=2) {
//            threads[i] = new Thread(thread1);
//            threads[i + 1] = new Thread(thread2);
//            threads[i].start();
//            threads[i + 1].start();
//        }

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(thread1);
        executorService.submit(thread2);
        executorService.shutdown();
    }
}

class JoinLearning{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            int index = 0;
            @Override
            public void run() {
                while (index < 10){
                    System.out.println(Thread.currentThread().getName() + ":" + index);
                    index++;
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " is running");
                }
            }
        });

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}

class ThreadJoinEx1 implements Runnable {
    private int index = 0;

    public int getIndex() {
        return index;
    }

    @Override
    public void run() {
        while (index < 20){
            System.out.println(Thread.currentThread().getName() + ":" + index);
            index++;
        }
    }
}

class ThreadJoinEx2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
}

class ThreadJoinMain{
    public static void main(String[] args) {
        ThreadJoinEx1 fun1 = new ThreadJoinEx1();
        ThreadJoinEx2 fun2 = new ThreadJoinEx2();

        Thread thread1 = new Thread(fun1);
        Thread thread2 = new Thread(fun2);
        thread1.start();
        thread2.start();

//        if(fun1.getIndex() == 5){
//            try {
//                thread1.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}

class ThreadPriority{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " is running " + Thread.currentThread().getPriority());
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " is running " + Thread.currentThread().getPriority());
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " is running " + Thread.currentThread().getPriority());
                }
            }
        });

        thread3.setPriority(10);
        thread1.setPriority(1);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class SynchronizedUsing1 implements Runnable{
    private static int index = 0;
    private Object object;

    SynchronizedUsing1(Object object){
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object){
            while (index < 20){
                System.out.println(Thread.currentThread().getName() + ":" + index);
                index++;
            }
        }
    }
}

class SynchronizedUsing2 implements Runnable{
    private static int index = 0;

    private synchronized void method(){
        System.out.println(Thread.currentThread().getName() + ":" + "开始");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + ":" + "结束");
    }

    @Override
    public void run() {
        method();
    }
}

class SynchronizedUsingMain{
    public static void main(String[] args) {
//        Object o = new Object();
//        SynchronizedUsing1 using1 = new SynchronizedUsing1(o);
//        SynchronizedUsing1 using2 = new SynchronizedUsing1(o);
//
//        new Thread(using1).start();
//        new Thread(using2).start();
        SynchronizedUsing2 using1 = new SynchronizedUsing2();
        new Thread(using1).start();
        new Thread(using1).start();
    }
}

class Passenger extends Thread{
    String name;
    Passenger(String name){
        this.name = name;
    }
    public void takeBus() {
        System.out.println(name + " arrives at the bus stop");
        System.out.println(name + " leaves the bus stop");
    }
    public void run() {
        this.takeBus();
    }
    public static void main(String[] args) {
        Passenger tom = new Passenger("tom");
        Passenger jerry = new Passenger("jerry");
        tom.start();
        jerry.start();
    }
}

public class ThreadLearning {
}
