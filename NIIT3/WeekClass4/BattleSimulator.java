package com.company.javaRelearn.NIIT3.WeekClass4;

// Character.java - 角色接口
interface Character {
    void attack();
}

// Warrior.java - 战士类
class Warrior implements Character {

    @Override
    public void attack() {
        System.out.println("战士进行攻击");
    }
}

// Mage.java - 法师类
class Mage implements Character {

    @Override
    public void attack() {
        System.out.println("法师进行法术攻击");
    }
}

public class BattleSimulator {
    public static void main(String[] args) {
        // 创建数组模拟攻击序列
        Character[] characters = new Character[3];
        characters[0] = new Warrior();
        characters[1] = new Mage();
        characters[2] = new Warrior();
        System.out.println("🔥 战斗开始！");
        // 创建循环模拟攻击
        for (Character c : characters){
            c.attack();
        }
    }
}
