package com.company.javaRelearn.NIIT3.Week5;

import java.util.Random;

/**
 * 幸运大转盘抽奖游戏
 * 演示成员内部类的使用
 */
public class LotteryWheel {
    // 使用数组保存奖品信息
    private final String[] prizes;
    private int totalPoints; // 累计积分

    // 外部类构造方法
    public LotteryWheel() {
        // 初始化奖品数组
        prizes = new String[]{
                "谢谢惠顾",
                "积分×1",
                "可乐一瓶",
                "积分×3",
                "薯片一包",
                "积分×5"
        };
        totalPoints = 0;
    }

    /**
     * 成员内部类：处理奖品逻辑
     */
    private class Prize {
        private final int index; // 奖品索引

        public Prize(int index) {
            this.index = index;
        }

        // 处理奖品发放
        public void processPrize() {
            System.out.println("★ 抽中奖品：" + prizes[index]);

            // 使用switch处理不同奖品类型
            switch(index) {
                case 1, 3, 5 -> { // 积分类型
                    int points = index; // 积分值等于索引值
                    totalPoints += points;
                    System.out.printf("获得 %d 积分，当前总积分：%d\n", points, totalPoints);
                }
                case 2 -> System.out.println("请到柜台领取可乐！");
                case 4 -> System.out.println("请到柜台领取薯片！");
                default -> System.out.println("继续加油哦！");
            }
        }
    }

    /**
     * 执行抽奖
     * @param times 抽奖次数
     */
    public void spin(int times) {
        System.out.println("\n===== 开始抽奖 =====");
        Random rand = new Random();

        // 使用循环控制抽奖次数
        for(int i=1; i<=times; i++){
            System.out.printf("\n第 %d 次抽奖...", i);

            try {
                // 添加抽奖动画效果
                Thread.sleep(1000);
                System.out.print("\\");
                Thread.sleep(100);
                System.out.print("\b/");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int prizeIndex = rand.nextInt(prizes.length);
            Prize prize = new Prize(prizeIndex);
            prize.processPrize();
        }
    }

    public static void main(String[] args) {
        LotteryWheel wheel = new LotteryWheel();
        wheel.spin(3); // 抽奖3次
    }
}
