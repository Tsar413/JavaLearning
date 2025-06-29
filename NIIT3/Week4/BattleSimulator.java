package com.company.javaRelearn.NIIT3.Week4;

/*
* 🎮 练习3：多态 - RPG 角色战斗系统
目标： 通过多态实现不同角色攻击方式

题目描述
创建 Character 接口，包含 attack() 方法。
创建 Warrior（战士）和 Mage（法师）类，实现 attack() 方法，战士使用刀剑攻击，法师使用魔法攻击。

在 main 方法中创建角色列表，并用循环模拟攻击。
* */

// Character.java - 角色接口
interface Character {
    void attack();
}

// Warrior.java - 战士类
class Warrior implements Character {
    public void attack() {
        System.out.println("⚔️ 战士挥舞大剑进行攻击！");
    }
}

// Mage.java - 法师类
class Mage implements Character {
    public void attack() {
        System.out.println("🔮 法师释放火球术！");
    }
}

public class BattleSimulator {
    public static void main(String[] args) {
        Character[] team = {
                new Warrior(),
                new Mage(),
                new Warrior()
        };

        System.out.println("🔥 战斗开始！");
        for (Character c : team) {
            c.attack();
        }
    }
}
