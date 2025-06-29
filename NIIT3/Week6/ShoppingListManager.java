package com.company.javaRelearn.NIIT3.Week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShoppingListManager {
    public static void main(String[] args) {
        // 步骤1：创建ArrayList存储购物清单
        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\n===== 购物清单管理系统 =====");
            System.out.println("1. 添加商品");
            System.out.println("2. 显示清单");
            System.out.println("3. 查找商品");
            System.out.println("4. 删除商品");
            System.out.println("5. 排序清单");
            System.out.println("6. 退出系统");
            System.out.print("请选择操作（1-6）: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 消耗换行符

            switch(choice) {
                case 1:
                    addItem(shoppingList, scanner);
                    break;
                case 2:
                    displayList(shoppingList);
                    break;
                case 3:
                    searchItem(shoppingList, scanner);
                    break;
                case 4:
                    removeItem(shoppingList, scanner);
                    break;
                case 5:
                    sortList(shoppingList);
                    break;
                case 6:
                    System.out.println("感谢使用购物清单管理系统！");
                    scanner.close();
                    return;
                default:
                    System.out.println("输入错误，请重新选择！");
            }
        }
    }

    // 步骤2：添加商品
    private static void addItem(ArrayList<String> list, Scanner scanner) {
        System.out.print("请输入要添加的商品名称: ");
        String item = scanner.nextLine();
        list.add(item); // 使用add方法添加元素
        System.out.println("'" + item + "' 已添加到清单！");
    }

    // 步骤3：显示清单
    private static void displayList(ArrayList<String> list) {
        if(list.isEmpty()) {
            System.out.println("当前清单为空！");
            return;
        }
        System.out.println("\n=== 当前购物清单 ===");
        // 使用for-each遍历列表
        for(int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + ". " + list.get(i));
        }
    }

    // 步骤4：查找商品
    private static void searchItem(ArrayList<String> list, Scanner scanner) {
        System.out.print("请输入要查找的商品名称: ");
        String item = scanner.nextLine();
        // 使用contains方法判断是否存在
        if(list.contains(item)) {
            System.out.println("'" + item + "' 在清单中存在！");
        } else {
            System.out.println("'" + item + "' 不在清单中！");
        }
    }

    // 步骤5：删除商品
    private static void removeItem(ArrayList<String> list, Scanner scanner) {
        if(list.isEmpty()) {
            System.out.println("清单为空，无法删除！");
            return;
        }
        System.out.print("请输入要删除的商品名称: ");
        String item = scanner.nextLine();
        // 使用remove方法删除元素
        if(list.remove(item)) {
            System.out.println("'" + item + "' 删除成功！");
        } else {
            System.out.println("'" + item + "' 不在清单中，删除失败！");
        }
    }

    // 步骤6：排序清单
    private static void sortList(ArrayList<String> list) {
        if(list.isEmpty()) {
            System.out.println("清单为空，无需排序！");
            return;
        }
        // 使用Collections.sort进行自然排序
        Collections.sort(list);
        System.out.println("清单已按字母顺序排序！");
    }
}
