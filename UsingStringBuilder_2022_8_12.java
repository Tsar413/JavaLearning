package com.company.javaRelearn;

import java.util.Random;

public class UsingStringBuilder_2022_8_12 {
    public static Random rnd = new Random(47);

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for(int i = 0; i < 25; i++) {
            result.append(rnd.nextInt(100));
            result.append(",");
        }
        result.delete(result.length() - 1, result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder_2022_8_12 usingStringBuilder = new UsingStringBuilder_2022_8_12();
        System.out.println(usingStringBuilder);
    }
}
