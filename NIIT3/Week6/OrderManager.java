package com.company.javaRelearn.NIIT3.Week6;

import java.util.*;

/*
* 第一步：创建订单类
* 订单类 Order 需要包含以下信息：
*
* 订单号 id
* 菜品名称 foodName
* 价格 price
* 下单用户 customerName
* */
class Order {
    private String id;
    private String foodName;
    private double price;
    private String customerName;

    public Order(String id, String foodName, double price, String customerName) {
        this.id = id;
        this.foodName = foodName;
        this.price = price;
        this.customerName = customerName;
    }

    public String getId() {
        return id;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getPrice() {
        return price;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "订单号：" + id + "，菜品：" + foodName + "，价格：" + price + "，顾客：" + customerName;
    }
}

/*
* 第二步：创建订单管理系统
* 我们使用 ArrayList<Order> 存储订单信息，并实现增删查功能。
* ✅ 使用 ArrayList<Order> 存储订单
* ✅ addOrder() 通过 Scanner 获取用户输入
* ✅ showOrders() 使用 for-each 遍历订单列表
* ✅ removeOrder() 使用 removeIf() 通过订单号删除订单
* */
public class OrderManager {
    private List<Order> orderList;
    private Scanner scanner;

    public OrderManager() {
        orderList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // 添加订单
    public void addOrder() {
        System.out.print("请输入订单号：");
        String id = scanner.nextLine();
        System.out.print("请输入菜品名称：");
        String foodName = scanner.nextLine();
        System.out.print("请输入价格：");
        double price = scanner.nextDouble();
        scanner.nextLine(); // 清除换行符
        System.out.print("请输入顾客姓名：");
        String customerName = scanner.nextLine();

        orderList.add(new Order(id, foodName, price, customerName));
        System.out.println("✅ 订单添加成功！");
    }

    // 显示所有订单
    public void showOrders() {
        if (orderList.isEmpty()) {
            System.out.println("⚠️ 当前没有订单！");
        } else {
            System.out.println("\n=== 订单列表 ===");
            for (Order o : orderList) {
                System.out.println(o);
            }
        }
    }

    // 删除订单
    public void removeOrder() {
        System.out.print("请输入要删除的订单号：");
        String id = scanner.nextLine();
        boolean removed = orderList.removeIf(o -> o.getId().equals(id));

        if (removed) {
            System.out.println("✅ 订单删除成功！");
        } else {
            System.out.println("⚠️ 订单未找到！");
        }
    }

    /*
    * 第三步：去重存储订单
    * 场景： 如果订单号相同，说明是重复订单，我们用 HashSet 过滤重复订单。
    * ✅ HashSet<String> 存储订单号，防止重复
    * ✅ uniqueIds.add(o.getId()) 过滤重复订单
    * */
    public void showUniqueOrders() {
        if (orderList.isEmpty()) {
            System.out.println("⚠️ 当前没有订单！");
        } else {
            Set<String> uniqueIds = new HashSet<>();
            System.out.println("\n=== 无重复订单列表 ===");

            for (Order o : orderList) {
                if (uniqueIds.add(o.getId())) {
                    System.out.println(o);
                }
            }
        }
    }

    /*
    * 第四步：按价格排序
    * 我们使用 TreeSet，并通过 Comparator 按价格排序订单。
    * ✅ TreeSet<Order> 存储订单，并使用 Comparator 按价格排序
    * ✅ 不使用 Lambda，而是 new Comparator<Order>()
    * */
    public void showSortedOrders() {
        if (orderList.isEmpty()) {
            System.out.println("⚠️ 当前没有订单！");
        } else {
            Set<Order> sortedSet = new TreeSet<>(new Comparator<Order>() {
                @Override
                public int compare(Order o1, Order o2) {
                    return Double.compare(o1.getPrice(), o2.getPrice()); // 按价格排序
                }
            });

            sortedSet.addAll(orderList);
            System.out.println("\n=== 按价格排序的订单列表 ===");
            for (Order o : sortedSet) {
                System.out.println(o);
            }
        }
    }

    /*
    * 第五步：实现菜单系统
    * 使用 while 循环 让用户可以选择功能。
    * */
    public void start() {
        while (true) {
            System.out.println("\n=== 外卖订单管理系统 ===");
            System.out.println("1. 添加订单");
            System.out.println("2. 显示所有订单");
            System.out.println("3. 删除订单");
            System.out.println("4. 显示无重复订单");
            System.out.println("5. 显示按价格排序的订单");
            System.out.println("6. 退出");
            System.out.print("请选择操作：");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 清除换行符

            switch (choice) {
                case 1: addOrder(); break;
                case 2: showOrders(); break;
                case 3: removeOrder(); break;
                case 4: showUniqueOrders(); break;
                case 5: showSortedOrders(); break;
                case 6:
                    System.out.println("🎉 系统已退出！");
                    return;
                default:
                    System.out.println("⚠️ 请输入有效选项！");
            }
        }
    }

    public static void main(String[] args) {
        new OrderManager().start();
    }


}
