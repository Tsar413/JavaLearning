package com.company.javaRelearn.NIIT3.Week8;

public class TicketSale {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        // 创建3个售票窗口线程
        Thread window1 = new Thread(counter, "窗口1");
        Thread window2 = new Thread(counter, "窗口2");
        Thread window3 = new Thread(counter, "窗口3");

        window1.start();
        window2.start();
        window3.start();
    }
}

class TicketCounter implements Runnable {
    private int tickets = 100; // 总票数

    @Override
    public void run() {
        while (true) {
            // 调用同步方法卖票
            if (!sellTicket()) {
                break;
            }
        }
    }

    // 同步方法：每次卖一张票
    private synchronized boolean sellTicket() {
        if (tickets > 0) {
            try {
                Thread.sleep(50); // 模拟出票时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()
                    + "售出第" + tickets-- + "张票");
            return true;
        }
        return false;
    }
}
