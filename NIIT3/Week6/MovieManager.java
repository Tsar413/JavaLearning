package com.company.javaRelearn.NIIT3.Week6;

import java.util.*;

class Movie {
    private String name;
    private int year;

    public Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return name + " (" + year + ")";
    }
}

public class MovieManager {
    private List<Movie> movieList; // 存储电影列表
    private Scanner scanner;

    public MovieManager() {
        movieList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // 添加电影（不检查重复）
    public void addMovie() {
        System.out.print("请输入电影名称: ");
        String name = scanner.nextLine();
        System.out.print("请输入上映年份: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // 清除换行符

        Movie movie = new Movie(name, year);
        movieList.add(movie);
        System.out.println("电影添加成功！");
    }

    // 显示电影（无序，无去重）
    public void showMovies() {
        if (movieList.isEmpty()) {
            System.out.println("当前没有电影记录！");
        } else {
            System.out.println("电影列表（无序）：");
            for (Movie movie : movieList) {
                System.out.println(movie);
            }
        }
    }

    // 显示电影（去重，无序）
    public void showUniqueMovies() {
        if (movieList.isEmpty()) {
            System.out.println("当前没有电影记录！");
        } else {
            Set<Movie> uniqueMovies = new HashSet<>(movieList);
            System.out.println("电影列表（去重）：");
            for (Movie movie : uniqueMovies) {
                System.out.println(movie);
            }
        }
    }

    // 显示电影（去重，按名称排序）
    public void showSortedMovies() {
        if (movieList.isEmpty()) {
            System.out.println("当前没有电影记录！");
        } else {
            // 使用 Comparator 进行排序
            Set<Movie> sortedMovies = new TreeSet<>(new Comparator<Movie>() {
                @Override
                public int compare(Movie m1, Movie m2) {
                    return m1.getName().compareTo(m2.getName());
                }
            });

            sortedMovies.addAll(movieList);
            System.out.println("电影列表（去重 + 按名称排序）：");
            for (Movie movie : sortedMovies) {
                System.out.println(movie);
            }
        }
    }


    // 菜单系统
    public void start() {
        while (true) {
            System.out.println("\n=== 电影收藏管理系统 ===");
            System.out.println("1. 添加电影");
            System.out.println("2. 显示电影列表（无序）");
            System.out.println("3. 显示电影列表（去重）");
            System.out.println("4. 显示电影列表（去重 + 按名称排序）");
            System.out.println("5. 退出");
            System.out.print("请选择操作: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 清除换行符

            switch (choice) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    showMovies();
                    break;
                case 3:
                    showUniqueMovies();
                    break;
                case 4:
                    showSortedMovies();
                    break;
                case 5:
                    System.out.println("系统已退出！");
                    return;
                default:
                    System.out.println("无效输入，请重新选择！");
            }
        }
    }

    public static void main(String[] args) {
        new MovieManager().start();
    }
}

