package com.company.javaRelearn;

public class NewVarArgs_2022_6_14 {
    static void printArray(Object ... args) {
        for(Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(47, 3.14F, 11.11);
        printArray("one", 45);
        printArray((Object[])new Integer[] {1,2,3,4,5});
    }
}
