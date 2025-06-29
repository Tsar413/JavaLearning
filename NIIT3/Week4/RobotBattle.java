package com.company.javaRelearn.NIIT3.Week4;

import java.util.Random;

/*
* 🎯 练习6：多态 - 机器人对战游戏
目标： 通过多态实现不同机器人战斗方式

题目描述
创建 Robot 接口，包含 attack() 方法。
创建 MeleeRobot（近战机器人）和 RangedRobot（远程机器人）实现不同的攻击方式。

在 main 方法中，创建机器人对战。
* */

// Robot.java - 机器人接口
interface Robot {
    void attack();
}

// MeleeRobot.java - 近战机器人类
class MeleeRobot implements Robot {
    public void attack() {
        System.out.println("🤖 近战机器人挥舞机械臂进行攻击！");
    }
}

// RangedRobot.java - 远程机器人类
class RangedRobot implements Robot {
    public void attack() {
        System.out.println("🎯 远程机器人发射激光炮！");
    }
}

public class RobotBattle {
    public static void main(String[] args) {
        Robot[] robots = {
                new MeleeRobot(),
                new RangedRobot(),
                new MeleeRobot()
        };

        Random rand = new Random();
        System.out.println("🔥 机器人对战开始！");

        for (int round = 1; round <= 3; round++) {
            System.out.println("\n⚔️ 第 " + round + " 轮对战！");
            int attackerIndex = rand.nextInt(robots.length);
            robots[attackerIndex].attack();
        }
    }
}

