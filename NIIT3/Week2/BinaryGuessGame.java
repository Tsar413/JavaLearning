package com.company.javaRelearn.NIIT3.Week2;

import java.util.Random;
import java.util.Scanner;

public class BinaryGuessGame {
    /**
     * 游戏名称：二进制猜猜乐
     * 游戏规则：
     * 1. 系统生成一个4位二进制数字（对应十进制0-15）
     * 2. 玩家有5次机会猜测对应的十进制数值
     * 3. 每次猜测后会提示：
     *    - 正确的二进制位数（通过位运算计算）
     *    - 剩余尝试次数
     * 4. 猜中胜利，用完次数显示正确答案
     */

    private static final int NUMBER_NUM = 4;
    private static final int CHANCE = 5;

    private String generateNumber(){
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < NUMBER_NUM; i++) {
            stringBuilder.append(random.nextInt(2));
        }
        return stringBuilder.toString();
    }

    private int judgeNumbers(String targetNumber, int guessNumber){
        String binaryString = Integer.toBinaryString(guessNumber);
        String judge = binaryString;
        if(binaryString.length() > NUMBER_NUM){
            return -1;
        } else if(binaryString.length() < NUMBER_NUM){
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < NUMBER_NUM - binaryString.length(); i++) {
                temp.append("0");
            }
            temp.append(binaryString);
            judge = temp.toString();
        }
        int diff = 0;
        for (int i = 0; i < targetNumber.length(); i++) {
            if(targetNumber.charAt(i) != judge.charAt(i)){
                diff++;
            }
        }
        return diff;
    }

    public void gameFunction(){
        Scanner scanner = new Scanner(System.in);
        int times = 0;
        String target = generateNumber();
        boolean correct = false;
        while (times < CHANCE){
            int i = scanner.nextInt();
            int flag = judgeNumbers(target, i);
            if(flag == -1){
                System.out.println("请输入0-15以内的数字");
            } else {
                if(flag == 0){
                    System.out.println("数字是：" + i);
                    correct = true;
                    break;
                } else {
                    System.out.println("不同的数字位数是" + flag);
                    times++;
                    System.out.println("你还有" + (CHANCE - times) + "次机会");
                }
            }
        }
        if(!correct){
            System.out.println("游戏失败");
        }
    }

    public static void main(String[] args) {
        BinaryGuessGame binaryGuessGame = new BinaryGuessGame();
        binaryGuessGame.gameFunction();
    }
}
