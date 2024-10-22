package com.company.javaRelearn.ConcurrentLectures_20241021;

public class Practise_8_2_SVIP_20241021 {
    class SVIP implements Runnable{
        private int second = 10;

        @Override
        public void run() {
            System.out.println("SVIP用户开始办理");
            while (second > 0){
                System.out.println(second + "秒");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                second--;
            }
            System.out.println("办理完成");
        }
    }

    class Normal implements Runnable{

        @Override
        public void run() {
            System.out.println("SVIP开始办理业务");
            Thread thread = new Thread(new SVIP());
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("普通用户继续");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Practise_8_2_SVIP_20241021().new Normal());

        thread.start();

    }
}
