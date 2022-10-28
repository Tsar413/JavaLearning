package com.company.javaRelearn;

public class VarageType_2022_6_16 {
    static void f(Character ... args) {
        System.out.print(args.getClass()); //获得该类型的编码字符串
        System.out.println("length" + args.length);
    }

    static void g(int ... args) {
        System.out.print(args.getClass()); //获得该类型的编码字符串
        System.out.println("length" + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]:" + int[].class);
    }
}
