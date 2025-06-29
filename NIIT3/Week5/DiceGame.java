package com.company.javaRelearn.NIIT3.Week5;

import java.util.Random;

/**
 * 幸运骰子游戏
 * 演示静态内部类的使用，包含数组和循环结构
 */
public class DiceGame {
    // 使用数组保存多个骰子
    private static Dice[] dices;

    /**
     * 静态内部类 - 骰子
     * 不需要访问外部类实例成员，因此声明为static
     */
    static class Dice {
        private int faces;  // 骰子的面数
        private int currentValue; // 当前点数

        public Dice(int faces) {
            this.faces = faces;
            roll(); // 初始化时随机掷一次
        }

        /**
         * 掷骰子方法
         * @return 返回随机点数
         */
        public int roll() {
            Random rand = new Random();
            currentValue = rand.nextInt(faces) + 1;
            return currentValue;
        }

        public int getCurrentValue() {
            return currentValue;
        }
    }

    /**
     * 初始化骰子数组
     * @param count 骰子数量
     * @param faces 每个骰子的面数
     */
    public static void initDices(int count, int faces) {
        dices = new Dice[count];
        // 使用循环初始化数组
        for(int i=0; i<count; i++){
            dices[i] = new Dice(faces);
        }
    }

    /**
     * 进行一轮游戏
     */
    public static void playGame() {
        int total = 0;
        System.out.println("=== 开始掷骰子 ===");

        // 遍历所有骰子并掷出
        for(int i=0; i<dices.length; i++){
            int result = dices[i].roll();
            System.out.println("骰子" + (i+1) + "掷出了：" + result);
            total += result;
        }

        System.out.println("=== 最终结果 ===");
        System.out.println("总点数：" + total);
        checkBonus(total);
    }

    /**
     * 检查是否中奖（趣味规则）
     * @param total 总点数
     */
    private static void checkBonus(int total) {
        // 使用简单规则增加趣味性
        if(total % 11 == 0) {
            System.out.println("🎉 哇！幸运数字组合！奖励翻倍！");
        } else if(total > 30) {
            System.out.println("🍭 不错的结果！获得糖果奖励！");
        } else {
            System.out.println("💪 继续努力！下次会更好！");
        }
    }

    public static void main(String[] args) {
        // 初始化3个6面骰子
        initDices(3, 6);

        // 进行3轮游戏
        for(int round=1; round<=3; round++){
            System.out.println("\n第" + round + "轮游戏：");
            playGame();
        }
    }
}