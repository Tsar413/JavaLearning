package com.company.javaRelearn.NIIT3.Week8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class StreamSquareSum {
    public static void main(String[] args) {
        // 创建一个整数列表
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 使用 Stream API 进行筛选、映射和求和
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0) // 筛选偶数
                .map(n -> n * n) // 计算平方
                .reduce(0, Integer::sum); // 求和

        // 输出结果
        System.out.println("所有偶数的平方和：" + sum);
    }
}

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class StreamStudentFilter {
    public static void main(String[] args) {
        // 创建学生列表
        List<Student> students = Arrays.asList(
                new Student("小明", 85),
                new Student("小红", 45),
                new Student("小李", 76),
                new Student("小张", 59),
                new Student("小王", 92)
        );

        // 计算及格的学生人数
        long passCount = students.stream()
                .filter(s -> s.score >= 60) // 筛选及格学生
                .count(); // 计算数量

        // 输出结果
        System.out.println("及格的学生人数：" + passCount);
    }
}

class CountdownTask implements Runnable {
    private int start;

    public CountdownTask(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i > start - 5; i--) {
            System.out.println(Thread.currentThread().getName() + " 倒计时：" + i);
            try {
                Thread.sleep(500); // 让线程暂停 0.5 秒，模拟真实倒计时
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CountdownExample {
    public static void main(String[] args) {
        // 创建两个线程，一个倒计时 10~6，另一个倒计时 5~1
        Thread t1 = new Thread(new CountdownTask(10), "线程1");
        Thread t2 = new Thread(new CountdownTask(5), "线程2");

        t1.start();
        t2.start();
    }
}

class PrintTask implements Runnable {
    private static final Object lock = new Object(); // 共享锁对象
    private static boolean printA = true; // 控制打印顺序
    private String letter; // 要打印的字母

    public PrintTask(String letter) {
        this.letter = letter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) { // 每个线程打印 5 次
            synchronized (lock) { // 获取锁
                while ((letter.equals("A") && !printA) || (letter.equals("B") && printA)) {
                    try {
                        lock.wait(); // 不是当前线程的轮次，等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " 打印：" + letter);
                printA = !printA; // 交换打印顺序
                lock.notify(); // 唤醒另一个线程
            }
        }
    }
}

class SynchronizedPrintAB {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintTask("A"), "线程A");
        Thread t2 = new Thread(new PrintTask("B"), "线程B");

        t1.start();
        t2.start();
    }
}

class FileReadExample {
    public static void main(String[] args) {
        String fileName = "data.txt"; // 目标文件

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) { // 逐行读取
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("文件读取失败：" + e.getMessage());
        }
    }
}

public class WeekEx8 {
}
