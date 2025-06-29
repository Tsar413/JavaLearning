package com.company.javaRelearn.NIIT3.Week5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDetails {
    private static EmployeeBook[] employeeBooks = new EmployeeBook[5];

    public Integer employeeDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------Menu---------");
        System.out.println("1. Enter Data");
        System.out.println("2. Update Data");
        System.out.println("3. Display Data");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("Choose the option:");
        return scanner.nextInt();
    }

    private void enterData(String employeeName, String department, String position, Date entryDate, Date birth, String weddingSituation, Date weddingDate){
        int index = 0;
        for (int i = 0; i < employeeBooks.length; i++) {
            if(employeeBooks[i] == null){
                index = i;
                break;
            }
        }
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.setEmployeeId(index + 1);
        employeeBook.setEmployeeName(employeeName);
        employeeBook.setDepartment(department);
        employeeBook.setPosition(position);
        employeeBook.setEntryDate(entryDate);
        employeeBook.setBirth(birth);
        employeeBook.setWeddingSituation(weddingSituation);
        employeeBook.setWeddingDate(weddingDate);
        employeeBooks[index] = employeeBook;
    }

    private String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private void inputData(){
        int count = 0;
        String employeeName = null;
        String department = null;
        String position = null;
        Date entryDate = null;
        Date birth = null;
        String weddingSituation = null;
        Date weddingDate = null;
        while (count < 7){
            if(count == 0){
                System.out.println("输入姓名");
                employeeName = getInput();
                count++;
            } else if (count == 1) {
                System.out.println("输入部门");
                department = getInput();
                count++;
            } else if (count == 2) {
                System.out.println("输入职位");
                position = getInput();
                count++;
            } else if (count == 3) {
                System.out.println("输入入职日期");
                String dateOriginal = getInput();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                boolean flag = true;
                Date date = new Date();
                try {
                    date = simpleDateFormat.parse(dateOriginal);
                } catch (ParseException e) {
                    flag = false;
                    System.out.println("格式错误");
                }
                if(flag){
                    entryDate = date;
                    count++;
                }
            } else if (count == 4) {
                System.out.println("输入生日");
                String dateOriginal = getInput();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                boolean flag = true;
                Date date = new Date();
                try {
                    date = simpleDateFormat.parse(dateOriginal);
                } catch (ParseException e) {
                    flag = false;
                    System.out.println("格式错误");
                }
                if(flag){
                    birth = date;
                    count++;
                }
            } else if (count == 5){
                System.out.println("输入婚姻状况");
                weddingSituation = getInput();
                count++;
            } else {
                if(weddingSituation.equals("已婚")){
                    System.out.println("输入结婚日期");
                    String dateOriginal = getInput();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    boolean flag = true;
                    Date date = new Date();
                    try {
                        date = simpleDateFormat.parse(dateOriginal);
                    } catch (ParseException e) {
                        flag = false;
                        System.out.println("格式错误");
                    }
                    if(flag){
                        weddingDate = date;
                        count++;
                    }
                } else {
                    break;
                }
            }
        }
        enterData(employeeName, department, position, entryDate, birth, weddingSituation, weddingDate);
    }

    private void updateData(){}

    private void displayData(){
        System.out.println("输入用户ID");
        String indexString = getInput();
        int index = Integer.parseInt(indexString);
        boolean flag = false;
        for (int i = 0; i < employeeBooks.length; i++) {
            if(employeeBooks[i].getEmployeeId() == index){
                if(employeeBooks[i].getWeddingSituation().equals("已婚")){
                    System.out.println(employeeBooks[i]);
                } else {
                    System.out.println(employeeBooks[i].toString1());
                }
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("未查找到用户，请重试");
        }
    }

    private void exitMenu(){
        System.out.println("退出程序");
        System.exit(0);
    }

    public void switchMethod(Integer choice){
        switch (choice){
            case 1: inputData(); break;
            case 2: updateData(); break;
            case 3: displayData(); break;
            case 4: exitMenu(); break;
        }
    }

    public void service(){
        while (true){
            int choice = employeeDetails();
            if(choice < 0 || choice > 4){
                System.out.println("Number between 0 and 4");
            } else {
                switchMethod(choice);
            }
        }
    }

    public static void main(String[] args) {
        new EmployeeDetails().service();
    }
}
