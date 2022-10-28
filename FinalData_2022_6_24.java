package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Random;

class Value1 {
    int i;
    public Value1(int i) {
        this.i = i;
    }
}

public class FinalData_2022_6_24 {
    private static Random rand = new Random(47);
    private String id;
    public FinalData_2022_6_24(String id) {
        this.id = id;
    }
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    public static final int VALUE_THREE = 39;
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value1 v1 = new Value1(11);
    private final Value1 v2 = new Value1(22);
    private static final Value1 VAL_3 = new Value1(33);
    private final int[] a = { 1, 2, 3, 4, 5, 6 };

    @Override
    public String toString() {
        return "FinalData_2022_6_24{" +
                "id='" + id + '\'' +
                ", valueOne=" + valueOne +
                ", i4=" + i4 +
                ", v1=" + v1 +
                ", v2=" + v2 +
                ", a=" + Arrays.toString(a) +
                '}';
    }

    public static void main(String[] args) {
        FinalData_2022_6_24 fd1 = new FinalData_2022_6_24("fd1");
//        fd1.valueOne++; final不可以修改
        fd1.v2.i++; //可以对实例化的对象的值进行修改，类不是恒定的
        fd1.v1 = new Value1(9); //可以修改非final类的
        for(int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }
//        fd1.v2 = new Value1(0);
//        fd1.VAL_3 = new Value1(1);
//        fd1.a = new int[3];
        System.out.println(fd1);
    }
}
