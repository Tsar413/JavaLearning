package com.company.javaRelearn.Teaching2DArrays_20241025;

import java.util.Scanner;

public class OrderMeals_Ready {
    static Scanner scan = new Scanner(System.in);

    //商品管理主菜单
    public static void  good() {
        System.out.println("\t校园茶社点餐系统");
        System.out.println("*****************************");
        System.out.println("\t1、查看商品信息");
        System.out.println("\t2、添加商品");
        System.out.println("\t3、修改商品");
        System.out.println("\t4、返回上一级菜单");
        goodOptions();
    }

    //商品管理选项
    public static void goodOptions() {
        System.out.print("请输入数字，选择功能：");
        int memberId = scan.nextInt();
        switch (memberId) {
            case 1:
                //查看所有商品
                selectGood();
                break;
            case 2:
                //添加新商品
                insertGood();
                break;
            case 3:
                //修改商品信息
                updateGood();
                break;
            case 4:
                System.out.println("输入回车，回到上一级主菜单");
                scan.nextLine();
                scan.nextLine();
                // systemMenu();
                break;
            default:
                break;
        }
    }

    // TODO 实训内容 1: 存储商品信息

    // TODO 实训内容 2: 初始化数据
    public static void initgoods(){
        
    }

    // 查看所有商品
    private static void selectGood() {
        System.out.println("校园茶社点餐系统");
        System.out.println("********************************");
        // TODO 实训内容 1: 遍历输出商品
        // TODO 参考表头 "编号\t商品名称\t商品价格\t商品积分"

        // TODO 拓展练习: 输出商品的最高价值

        // 输入回车返回主菜单
        System.out.println("输入回车，回到主菜单！");
        scan.nextLine();
        scan.nextLine();
        good();
    }

    // TODO 添加新商品
    private static void insertGood() {



        // 输入回车返回主菜单
        System.out.println("输入回车，回到主菜单！");
        scan.nextLine();
        scan.nextLine();
        good();
    }

    // TODO 修改商品信息
    private static void updateGood() {


        System.out.println("输入回车，回到主菜单！");
        scan.nextLine();
        scan.nextLine();
        good();
    }

    public static void main(String[] args) {
        // 初始化存储
        initgoods();
        // 主菜单执行
        good();
    }
}
