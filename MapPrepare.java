package com.company.javaRelearn;

import java.util.*;

public class MapPrepare {
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

    public static void studentsLessonShow(){
        //生成名为students学生学籍管理系统
        Map<Integer, String> students = new HashMap<Integer, String>();
        //模拟存入学生数据
        students.put(1, "刘一");
        students.put(2, "陈二");
        students.put(3, "张三");
        students.put(4, "李四");
        students.put(5, "王五");
        System.out.println(students);
        // {1=刘一, 2=陈二, 3=张三, 4=李四, 5=王五}
        //获取学号为1的同学的姓名
        System.out.println(students.get(1));
        //删除学号为3的同学
        System.out.println(students.remove(3));
        System.out.println(students);
        //删除学号为4,姓名为"李四"的同学
        System.out.println(students.remove(4, "李四"));
        //System.out.println(students.remove(4, "李五"));
        System.out.println(students);
        //判断学号为2的同学是否存在
        System.out.println(students.containsKey(2));

        //使用keySet获取所有的学生的学号
        Set<Integer> setId = students.keySet();
        //将set转为list
        List<Integer> listId = new ArrayList<Integer>(setId);
        System.out.println(listId);

        //使用values获取所有学生的姓名(Value)
        Collection<String> nameValue = students.values();
        System.out.println(nameValue);

        //使用Map.Entry逐条获取所有学生的学号和信息(键值对)
        Set<Map.Entry<Integer, String>> setInfo = students.entrySet();
        //遍历输出
        for(Map.Entry<Integer, String> tuple : setInfo){
            System.out.println("Student Id: " + tuple.getKey() +
                            ", Student Name: " + tuple.getValue());
        }
    }

    public static void testInLesson(){
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        map1.put(1, 1);
        map1.put(2, 3);
        map1.put(1, 2);
        System.out.println(map1.get(1));

        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        map2.put(1, 2);
        map1.put(1, 3);
        map2.put(3, 1);
        System.out.println(map2.get(1));

        Map<Integer, Integer> map3 = new HashMap<Integer, Integer>();
        map3.put(1, 1);
        map3.put(2, 1);
        map3.put(1, 2);
        System.out.println(map3.get(3));

        Map<Integer, Integer> map4 = new HashMap<Integer, Integer>();
        map4.put(63, 87);
        map4.put(26, 32);
        map4.put(31, 98);
        System.out.println(map4.get(35));

        Map<Integer, String> map5 = new HashMap<Integer, String>();
        map5.put(1, "a");
        map5.put(2, "b");
        map5.put(3, "c");
        map5.remove(3);
        System.out.println(map5);

        Map<Integer, String> map6 = new HashMap<Integer, String>();
        map6.put(1, "a");
        map6.put(2, "b");
        map6.put(3, "c");
        map6.remove(2, "c");
        System.out.println(map6);

        Map<Integer, String> map7 = new HashMap<Integer, String>();
        map7.put(10, "a1");
        map7.put(25, "b9");
        map7.put(32, "c10");
        map7.put(25, "d11");
        map7.remove(25, "b9");
        map6.remove(32, "c10");
        System.out.println(map7);
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

    public static void mapLessonTraining(){
        //使用Map初始化账单存储
        Map<String, Double> billing = new HashMap<String, Double>();
        //向账单内添加消费种类和消费金额
        billing.put("water bill", 25.80);
        billing.put("electricity", 50.91);
        billing.put("food", 300.00);
        //使用keySet方法获取所有的消费种类(key)

        Set<String> keySet = billing.keySet();
        //将set转为list
        List<String> list = new ArrayList<String>(keySet);
        //输出list
        System.out.println(list);
    }

    public static void mapHomework(){
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        map1.put(1, 123);
        map1.put(2, 456);
        map1.put(2, 789);
        System.out.println(map1.get(2));

        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        map2.put(1, 123);
        map2.put(2, 456);
        map2.put(2, 789);
        System.out.println(map2.get(3));

        Map<Integer, String> map3 = new HashMap<Integer, String>();
        map3.put(1, "The quick brown fox");
        map3.put(2, "jumps over");
        map3.put(3, "the lazy dog");
        map3.remove(3, "the lazy dog");
        System.out.println(map3);

        Map<String, String> map5 = new HashMap<String, String>();
        map5.put("sentence 1", "The quick brown fox");
        map5.put("sentence 2", "jumps over");
        map5.put("sentence 3", "the lazy dog");
        Set<String> keySet = map5.keySet();
        List<String> keyList = new ArrayList<String>(keySet);
        map5.remove("sentence 1");
        System.out.println(keyList);
    }

    public static void main(String[] args) {
        studentsOriginal();
        studentsLessonShow();
        testInLesson();
        mapLessonTraining();
        mapHomework();
    }
}
