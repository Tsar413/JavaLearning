package com.company.javaRelearn.NIIT3.Week8;

class Counter {
    int num=0;
    public synchronized void add(){
        if (num==0){
            this.num++;
            System.out.println("生产者生产了一件商品");
            this.notifyAll();
        }else {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void sub(){
        if (num>0){
            this.num--;
            System.out.println("消费者生拿走了一件商品");
            this.notifyAll();
        }
        else {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producter extends Thread {
    private Counter counter;

    public Producter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (true) {
            counter.add();
        }
    }
}

class Customer extends Thread {
    private Counter counter;

    public Customer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (true) {
            counter.sub();
        }
    }
}


public class InterThreadCommunication {
    public static void main(String[] args) {
        Counter counter=new Counter();

        new Producter(counter).start();
        new Producter(counter).start();
        new Customer(counter).start();
    }
}
