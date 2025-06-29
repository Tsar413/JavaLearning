package com.company.javaRelearn.NIIT3.Week4;

import java.util.Scanner;

// 学生类，展示封装
class Student {
    private String name;
    private int age;
    private String studentId;

    // 构造方法
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Getter 方法（封装）
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getStudentId() {
        return studentId;
    }

    // 显示学生信息（可被子类重写）
    public void displayInfo() {
        System.out.println("姓名: " + name + ", 年龄: " + age + ", 学号: " + studentId);
    }
}

// 继承（住宿生类继承学生类）
class BoardingStudent extends Student {
    private String dormitoryAddress;

    // 构造方法
    public BoardingStudent(String name, int age, String studentId, String dormitoryAddress) {
        super(name, age, studentId);
        this.dormitoryAddress = dormitoryAddress;
    }

    // 重写父类方法（多态）
    @Override
    public void displayInfo() {
        System.out.println("姓名: " + getName() + ", 年龄: " + getAge() + ", 学号: " + getStudentId() + ", 宿舍地址: " + dormitoryAddress);
    }
}

// 学生管理系统
public class StudentManagement {
    private static Student[] students = new Student[100]; // 存储学生信息的数组
    private static int studentCount = 0; // 当前学生数量

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. 添加学生  2. 显示所有学生  3. 退出");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 清除换行符

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    showAllStudents();
                    break;
                case 3:
                    System.out.println("退出系统");
                    scanner.close();
                    return;
                default:
                    System.out.println("无效选项，请重新输入");
            }
        }
    }

    // 方法重载：添加普通学生
    public static void addStudent(Scanner scanner) {
        if (studentCount >= students.length) {
            System.out.println("学生数量已满，无法添加更多学生。");
            return;
        }

        System.out.println("请输入学生姓名:");
        String name = scanner.nextLine();
        System.out.println("请输入学生年龄:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("请输入学生学号:");
        String studentId = scanner.nextLine();

        System.out.println("该学生是住宿生吗？(y/n)");
        String isBoarding = scanner.nextLine();

        if (isBoarding.equalsIgnoreCase("y")) {
            System.out.println("请输入该学生的宿舍地址:");
            String dormitoryAddress = scanner.nextLine();
            students[studentCount] = new BoardingStudent(name, age, studentId, dormitoryAddress);
        } else {
            students[studentCount] = new Student(name, age, studentId);
        }
        studentCount++;
        System.out.println("学生添加成功！");
    }

    // 显示所有学生
    public static void showAllStudents() {
        if (studentCount == 0) {
            System.out.println("当前没有学生信息。");
            return;
        }
        System.out.println("\n学生列表:");
        for (int i = 0; i < studentCount; i++) {
            students[i].displayInfo(); // 多态调用
        }
    }
}

