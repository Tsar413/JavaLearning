package com.company.javaRelearn.ConcurrentLectures_20241021;

public class Thread11_853_20241021 implements Runnable{
    private static int ticket = 10;
    @Override
    public void run() {
        while (true) {
            try {
                ticket = saleTicket(ticket);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (ticket <= 0) {
                break;
            }
        }
    }

    private synchronized int saleTicket(int ticket) throws InterruptedException {
        if(ticket > 0){
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName() + "出售" + ticket);
            ticket--;
        }
        return ticket;
    }
}
