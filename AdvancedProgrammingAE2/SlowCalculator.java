package com.company.javaRelearn.AdvancedProgrammingAE2;

public class SlowCalculator implements Runnable {
    private final long N;
    private Thread thread;
    private int result1 = -1;

    public SlowCalculator(final long N) {
        this.N = N;
        thread = new Thread(this);
    }

    public long getN() {
        return N;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public int getResult1() {
        return result1;
    }

    public void setResult1(int result1) {
        this.result1 = result1;
    }

    @Override
    public void run() {
        final int result = calculate(N);

        setResult1(result);
//        System.out.println("1:" + result);  // you'll be changing this
    }

    private static int calculate(final long N) {
        // This (very inefficiently) finds and returns the number of unique prime factors of |N|
        // You don't need to think about the mathematical details; what's important is that it does some slow calculation taking N as input
        // You should not modify the calculation performed by this class, but you may want to add support for interruption
        int count = 0;
        for (long candidate = 2; candidate < N; ++candidate) {
            if (Thread.currentThread().isInterrupted()) {
                return -1;
            }

            if (isPrime(candidate)) {
                if (Math.abs(N) % candidate == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPrime(final long n) {
        // This (very inefficiently) checks whether n is prime
        // You should not modify this method
        for (long candidate = 2; candidate < Math.sqrt(n); ++candidate) {
            if (n % candidate == 0) {
                return false;
            }
        }
        return true;
    }
}
