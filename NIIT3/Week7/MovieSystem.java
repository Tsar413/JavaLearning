package com.company.javaRelearn.NIIT3.Week7;

import java.util.*;

class MovieTicketManager {
    private HashMap<String, Double> ticketSales; // 存储电影票房数据
    private String currencyUnit; // 票房单位（字符串）

    public MovieTicketManager(String currencyUnit) {
        this.ticketSales = new HashMap<>();
        this.currencyUnit = currencyUnit;
    }

    // 1. 添加或更新电影票房
    public void addOrUpdateMovie(String movieName, double sales) {
        ticketSales.put(movieName, sales);
        System.out.println("已更新电影《" + movieName + "》的票房：" + sales + " " + currencyUnit);
    }

    // 2. 查询某部电影的票房
    public void queryMovie(String movieName) {
        if (ticketSales.containsKey(movieName)) {
            System.out.println("《" + movieName + "》的票房为：" + ticketSales.get(movieName) + " " + currencyUnit);
        } else {
            System.out.println("未找到电影《" + movieName + "》的票房数据！");
        }
    }

    // 3. 删除电影票房数据
    public void removeMovie(String movieName) {
        if (ticketSales.remove(movieName) != null) {
            System.out.println("已删除电影《" + movieName + "》的票房数据");
        } else {
            System.out.println("未找到电影《" + movieName + "》，无法删除！");
        }
    }

    // 4. 显示票房排行榜（按票房降序）
    public void showRanking() {
        if (ticketSales.isEmpty()) {
            System.out.println("暂无票房数据！");
            return;
        }

        // 将 HashMap 转换为 List
        List<Map.Entry<String, Double>> movieList = new ArrayList<>(ticketSales.entrySet());

        // 使用 Comparator 进行排序
        Collections.sort(movieList, new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return Double.compare(o2.getValue(), o1.getValue()); // 票房降序
            }
        });

        System.out.println("\n--- 电影票房排行榜 ---");
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println((i + 1) + ". 《" + movieList.get(i).getKey() + "》 - 票房：" + movieList.get(i).getValue() + " " + currencyUnit);
        }
    }
}

public class MovieSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 选择票房单位
        System.out.print("请输入票房单位（例如：万元、美元）：");
        String unit = scanner.nextLine();

        // 创建管理器
        MovieTicketManager manager = new MovieTicketManager(unit);

        while (true) {
            System.out.println("\n==== 电影票房管理系统 ====");
            System.out.println("1. 添加/更新电影票房");
            System.out.println("2. 查询电影票房");
            System.out.println("3. 删除电影票房");
            System.out.println("4. 显示票房排行榜");
            System.out.println("5. 退出系统");
            System.out.print("请选择操作（1-5）：");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 处理换行符

            switch (choice) {
                case 1:
                    System.out.print("请输入电影名称：");
                    String movie = scanner.nextLine();
                    System.out.print("请输入票房（" + unit + "）：");
                    double sales = scanner.nextDouble();
                    manager.addOrUpdateMovie(movie, sales);
                    break;
                case 2:
                    System.out.print("请输入要查询的电影名称：");
                    String queryMovie = scanner.nextLine();
                    manager.queryMovie(queryMovie);
                    break;
                case 3:
                    System.out.print("请输入要删除的电影名称：");
                    String removeMovie = scanner.nextLine();
                    manager.removeMovie(removeMovie);
                    break;
                case 4:
                    manager.showRanking();
                    break;
                case 5:
                    System.out.println("退出系统，感谢使用！");
                    scanner.close();
                    return;
                default:
                    System.out.println("输入无效，请重新选择！");
            }
        }
    }
}

