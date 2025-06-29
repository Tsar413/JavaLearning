package com.company.javaRelearn;

import java.util.*;

public class MapInLesson {
    public static void studentsOriginal(){
        Map<Integer, String> students = new HashMap<Integer, String>();
        students.put(1, "刘一");
        students.put(2, "陈二");
        students.put(3, "张三");
        students.put(4, "李四");
        students.put(5, "王五");
        System.out.println(students);
        // {1=刘一, 2=陈二, 3=张三, 4=李四, 5=王五}
        

    }

    public static void mapLessonTrainingOriginal(){
        //使用Map初始化账单存储
        Map<String, Double> billing = new HashMap<String, Double>();
        //向账单内添加消费种类和消费金额
        billing.put("water bill", 25.80);
        billing.put("electricity", 50.91);
        billing.put("food", 300.00);
        //使用keySet方法获取所有的消费种类(key)


    }

    public static void main(String[] args) {
        studentsOriginal();
        mapLessonTrainingOriginal();
    }
}
