package com.company.javaRelearn.NIIT3.Week7;

import java.util.*;

// 抽象基类：物品
abstract class Item {
    private static int idCounter = 1;
    private int itemID;
    private String name;
    private long storageTime;
    private int lockerNumber; // 外卖柜编号

    public Item(String name, int lockerNumber) {
        this.itemID = idCounter++;
        this.name = name;
        this.storageTime = System.currentTimeMillis();
        this.lockerNumber = lockerNumber;
    }

    public int getItemID() { return itemID; }
    public String getName() { return name; }
    public long getStorageTime() { return storageTime; }
    public int getLockerNumber() { return lockerNumber; }

    // 抽象方法，子类实现
    public abstract String getType();

    @Override
    public String toString() {
        return "ID：" + itemID + " | 名称：" + name + " | 类型：" + getType() +
                " | 外卖柜编号：" + lockerNumber + " | 存入时间：" + new Date(storageTime);
    }
}

// 具体子类：快递
class ExpressItem extends Item {
    public ExpressItem(String name, int lockerNumber) {
        super(name, lockerNumber);
    }

    @Override
    public String getType() {
        return "快递";
    }
}

// 具体子类：外卖
class FoodItem extends Item {
    public FoodItem(String name, int lockerNumber) {
        super(name, lockerNumber);
    }

    @Override
    public String getType() {
        return "外卖";
    }
}

// 快递与外卖柜管理系统
public class LockerSystem {
    private List<Item> storage = new ArrayList<>();
    private Map<Integer, List<Item>> lockerMap = new HashMap<>(); // 外卖柜编号 -> 物品列表
    private Set<Integer> allLockers = new TreeSet<>(); // 记录所有可能的外卖柜编号
    private Scanner scanner = new Scanner(System.in);

    public LockerSystem(int lockerCount) {
        for (int i = 1; i <= lockerCount; i++) {
            allLockers.add(i);
        }
    }

    // 存入物品
    public void storeItem() {
        System.out.print("输入物品名称：");
        String name = scanner.next();
        System.out.print("输入物品类型（1-快递，2-外卖）：");
        int type = scanner.nextInt();
        System.out.print("输入存入的外卖柜编号：");
        int lockerNumber = scanner.nextInt();

        if (!allLockers.contains(lockerNumber)) {
            System.out.println("该外卖柜编号无效！");
            return;
        }

        Item item = (type == 1) ? new ExpressItem(name, lockerNumber) : new FoodItem(name, lockerNumber);
        storage.add(item);

        lockerMap.putIfAbsent(lockerNumber, new ArrayList<>());
        lockerMap.get(lockerNumber).add(item);

        System.out.println("物品存入成功！ID：" + item.getItemID() + " | 外卖柜编号：" + lockerNumber);
    }

    // 取出物品
    public void removeItem() {
        System.out.print("输入要取出的物品 ID：");
        int id = scanner.nextInt();

        Iterator<Item> iterator = storage.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getItemID() == id) {
                iterator.remove();
                lockerMap.get(item.getLockerNumber()).remove(item);
                System.out.println("物品取出成功！");
                return;
            }
        }
        System.out.println("未找到该 ID 对应的物品！");
    }

    // 查询全部物品
    public void viewItems() {
        if (storage.isEmpty()) {
            System.out.println("柜子里暂无物品！");
        } else {
            for (Item item : storage) {
                System.out.println(item);
            }
        }
    }

    // 通过外卖柜编号查询物品
    public void viewByLockerNumber() {
        System.out.print("输入外卖柜编号：");
        int lockerNumber = scanner.nextInt();
        List<Item> items = lockerMap.get(lockerNumber);

        if (items == null || items.isEmpty()) {
            System.out.println("该柜子暂无物品！");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    // 查询空置外卖柜
    public void viewEmptyLockers() {
        Set<Integer> occupiedLockers = lockerMap.keySet();
        Set<Integer> emptyLockers = new TreeSet<>(allLockers);
        emptyLockers.removeAll(occupiedLockers);

        if (emptyLockers.isEmpty()) {
            System.out.println("所有外卖柜都已被占用！");
        } else {
            System.out.println("空置的外卖柜编号：" + emptyLockers);
        }
    }

    // 按照外卖柜编号排序查询物品
    public void viewItemsSortedByLocker() {
        if (storage.isEmpty()) {
            System.out.println("柜子里暂无物品！");
            return;
        }

        // 使用 new Comparator 重写比较逻辑
        Collections.sort(storage, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Integer.compare(o1.getLockerNumber(), o2.getLockerNumber());
            }
        });

        System.out.println("按外卖柜编号排序后的物品：");
        for (Item item : storage) {
            System.out.println(item);
        }
    }

    // 运行主菜单
    public void run() {
        while (true) {
            System.out.println("\n快递与外卖柜管理系统");
            System.out.println("1. 存入物品");
            System.out.println("2. 取出物品");
            System.out.println("3. 查询全部物品");
            System.out.println("4. 按外卖柜编号查询物品");
            System.out.println("5. 查询空置的外卖柜编号");
            System.out.println("6. 按外卖柜编号排序查询物品");
            System.out.println("7. 退出");
            System.out.print("请选择操作：");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> storeItem();
                case 2 -> removeItem();
                case 3 -> viewItems();
                case 4 -> viewByLockerNumber();
                case 5 -> viewEmptyLockers();
                case 6 -> viewItemsSortedByLocker();
                case 7 -> {
                    System.out.println("感谢使用，系统已退出！");
                    return;
                }
                default -> System.out.println("选择错误，请重新输入！");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("请输入外卖柜总数：");
        Scanner scanner = new Scanner(System.in);
        int lockerCount = scanner.nextInt();
        new LockerSystem(lockerCount).run();
    }
}

