package com.company.javaRelearn.NIIT3.WeekClass4;

public class TestUtils {
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }

    public int add(int... args){ //可变参数
        int result = 0;
        for (int i : args){
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        TestUtils testUtils = new TestUtils();
        System.out.println(testUtils.add(1, 3));
        System.out.println(testUtils.add(2.3, 4.5));
        System.out.println(testUtils.add(1,23,45,231,6574,3243));
    }
}
