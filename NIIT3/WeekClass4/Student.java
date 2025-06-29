package com.company.javaRelearn.NIIT3.WeekClass4;

public class Student {
    // 进行封装 学生类当中需要学号，姓名和年龄 提供display的方法，方便进行输出
    private String studentId;
    private String studentName;
    private int studentAge;

    public Student() {
    }

    public Student(String studentId, String studentName, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void display(){
        System.out.println("姓名:" + studentName + ", 学号:" + studentId + ", 年龄:" + studentAge);
    }
}
