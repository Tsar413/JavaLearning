package com.company.javaRelearn.Teaching2DArrays_20241025;

import java.util.Scanner;

public class OrderMeals {
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
                //insertGood();
                break;
            case 3:
                //修改商品信息
                //updateGood();
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

    //存储商品信息

    static String [][] goods = new String[100][4];

    //初始化数据

    public static void initgoods(){
        goods[0][0]="1";
        goods[0][1]="森森乌龙";
        goods[0][2]="18";
        goods[0][3]="10";

        goods[1][0]="2";
        goods[1][1]="矿泉水";
        goods[1][2]="1";
        goods[1][3]="1";
    }

    //商品查询
    public static void selectGood() {
        System.out.println("校园茶社点餐系统");
        System.out.println("********************************");
        System.out.println("编号\t商品名称\t商品价格\t商品积分");

        for (int i = 0; i < goods.length; i++) {
            for (int j = 0; j < goods[0].length; j++) {
                if (goods[i][0]!=null) {
                    if(j == 0){ //当j = 0时，不需要水平制表符
                        System.out.print(goods[i][j]);
                    } else {
                        System.out.print("\t"+goods[i][j]);
                    }
                }
            }
            if (goods[i][0]!=null) {
                //对于存在数据的行，输出完要换行
                System.out.println();
            }
        }

        // 初始化最大值，值为int的最小值，防止出现负数导致Math.max失败
        int max = Integer.MIN_VALUE;

        //输出商品的最高价值
        for (int i = 0; i < goods.length; i++) {
            if (goods[i][0] != null && goods[i][2] != null) {
                //遍历数组，每次与第三列数进行比较求出最大值，注意String转Integer
                max = Math.max(max, Integer.parseInt(goods[i][2]));
            }
        }
        System.out.println("商品的最高价值是" + max);
        System.out.println("输入回车，回到主菜单！");
        scan.nextLine();
        scan.nextLine();
        good();
    }

    public static void main(String[] args) {
        initgoods();
        good();


    }
}
