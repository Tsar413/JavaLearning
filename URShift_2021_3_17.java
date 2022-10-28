package com.company.javaRelearn;

public class URShift_2021_3_17 {
    public static void main(String[] args) {
        int i = -1;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        i >>>= 10;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        long l = -1;
        System.out.println(l);
        System.out.println(Long.toBinaryString(l));
        l >>>= 10;
        System.out.println(l);
        System.out.println(Long.toBinaryString(l));
        short s = -1;
        System.out.println(s);
        System.out.println(Integer.toBinaryString(s));
        s >>>= 10;
        System.out.println(s);
        System.out.println(Integer.toBinaryString(s));
        byte b = -1;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
        b >>>= 10;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
        b = -1;
        System.out.println(Integer.toBinaryString(b >>> 10));
    }
}
