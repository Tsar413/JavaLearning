package com.company.javaRelearn.NIIT3.Week6;

class Snack {
    private String name;
    private double price;
    private int shelfLife; // 以天为单位

    public Snack(String name, double price, int shelfLife) {
        this.name = name;
        this.price = price;
        this.shelfLife = shelfLife;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void displayInfo() {
        System.out.println("零食名称: " + name + ", 价格: " + price + " 元, 保质期: " + shelfLife + " 天");
    }
}

class SnackStore {
    public static <T extends Snack> void displaySnacks(T[] snacks) {
        for (T snack : snacks) {
            if (snack != null) {
                snack.displayInfo();
            }
        }
    }

    public static <T extends Snack> double calculateTotalPrice(T[] snacks) {
        double total = 0;
        for (T snack : snacks) {
            if (snack != null) {
                total += snack.getPrice();
            }
        }
        return total;
    }
}

// 库存管理类
public class SnackManager {
    public static void main(String[] args) {
        // 创建零食数组
        Snack[] snacks = new Snack[3];

        // 添加零食
        snacks[0] = new Snack("巧克力", 5.5, 180);
        snacks[1] = new Snack("薯片", 3.0, 90);
        snacks[2] = new Snack("软糖", 2.5, 120);

        // 显示所有零食
        System.out.println("原始零食列表:");
        SnackStore.displaySnacks(snacks);

        // 计算总价
        double totalPrice = SnackStore.calculateTotalPrice(snacks);
        System.out.println("所有零食的总价格: " + totalPrice + " 元");
    }
}
