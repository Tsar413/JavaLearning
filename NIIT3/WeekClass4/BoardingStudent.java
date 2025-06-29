package com.company.javaRelearn.NIIT3.WeekClass4;

public class BoardingStudent extends Student {
    //继承关系 继承了Student类 添加属性：房间地址 重写display方法，对地址进行添加
    private String dormitoryAddress;

    public BoardingStudent(String studentId, String studentName, int studentAge, String dormitoryAddress) {
        super(studentId, studentName, studentAge);
        this.dormitoryAddress = dormitoryAddress;
    }

    @Override
    public void display() {
        System.out.println("姓名:" + getStudentName() + "年龄:" + getStudentAge() + "学号:" + getStudentId() + "宿舍:" + dormitoryAddress);
    }
}
