package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private int age;

    public Student(){}

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return  "Student{name='" + name + "', age=" + age + "}";
    }
}

public class PartitionArray_20250619 {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[0];
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] - min > k){
                result++;
                min = nums[i];
            }
        }
        result++;
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        Student student = new Student("zhangsan", 18);
        System.out.println(student);
    }
}
