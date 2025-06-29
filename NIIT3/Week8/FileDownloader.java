package com.company.javaRelearn.NIIT3.Week8;

// DownloadTask.java
class DownloadTask implements Runnable {
    private final String fileName;
    private final int downloadTime;

    public DownloadTask(String fileName, int downloadTime) {
        this.fileName = fileName;
        this.downloadTime = downloadTime;
    }

    @Override
    public void run() {
        System.out.println("开始下载：" + fileName);

        try {
            for (int i = 1; i <= downloadTime; i++) {
                // 模拟每秒下载进度
                Thread.sleep(1000);  // 暂停1秒
                int progress = (i * 100) / downloadTime;
                System.out.println(fileName + " - 已完成 " + progress + "%");
            }
        } catch (InterruptedException e) {
            System.out.println(fileName + " 下载被中断！");
        }

        System.out.println("[✓] " + fileName + " 下载完成！（总耗时" + downloadTime + "秒）");
    }
}

// FileDownloader.java
public class FileDownloader {
    public static void main(String[] args) {
        // 创建三个下载线程
        Thread[] tasks = {
                new Thread(new DownloadTask("学习资料.zip", 3)),
                new Thread(new DownloadTask("电影.mp4", 5)),
                new Thread(new DownloadTask("音乐合集", 2))
        };

        System.out.println("====== 下载管理器启动 ======");

        // 启动所有下载任务
        for (Thread task : tasks) {
            task.start();
        }

        // 等待所有线程完成
        try {
            for (Thread task : tasks) {
                task.join();
            }
        } catch (InterruptedException e) {
            System.out.println("异常：下载任务被中断！");
        }

        System.out.println("====== 所有下载任务完成 ======");
    }
}