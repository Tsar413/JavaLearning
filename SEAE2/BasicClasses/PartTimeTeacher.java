package com.company.javaRelearn.SEAE2.BasicClasses;

import java.util.Arrays;
import java.util.List;

public class PartTimeTeacher {
    private Integer id;
    private String name;
    private String subject;

    //默认日期为每一自然年的1-12月份
//    private List<String> availableMonths = ("1","2","3","4","5","6","7","8","9","10","11","12");
    private List<String> availableMonths = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12");

    public PartTimeTeacher() {}

    public PartTimeTeacher(Integer id, String name, String subject, List<String> availableMonths) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.availableMonths = availableMonths;
    }

    public PartTimeTeacher(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<String> getAvailableMonths() {
        return availableMonths;
    }

    public void setAvailableMonths(List<String> availableMonths) {
        this.availableMonths = availableMonths;
    }

    //当该教师某个月份被安排后，从availableMonths中移除该月份
    public void setUnavailableMonths(String month) {
        this.availableMonths.remove(month);
    }

    //方便打印显示所有兼职教师信息，具体格式待定
//    public String toString() {
//        return "something";
//    }

    public String printAvailableMonth() {
        StringBuilder result = new StringBuilder();
        for (String s : this.availableMonths) {
            result.append(s);
            result.append(",");
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }

    @Override
    public String toString() {
        return "PartTimeTeacher{" +
                "id=" + id +
                ", name=" + name +
                ", subject=" + subject +
                ", availableMonths=" + printAvailableMonth() +
                '}';
    }

//    public static void main(String[] args) {
//        List<String> availableMonths = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12");
//        PartTimeTeacher p1 = new PartTimeTeacher(1,"aa","CS",availableMonths);
//        PartTimeTeacher p2 = new PartTimeTeacher(2,"bb","CS",availableMonths);
//        System.out.println(p1);
//        System.out.println(p2);
//    }
}
