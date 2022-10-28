package com.company.javaRelearn;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker_2022_10_12<T> {
    private Class<T> kind;
    public ArrayMaker_2022_10_12(Class<T> kind) {
        this.kind = kind;
    }
    @SuppressWarnings("unchecked")
    T[] create(int size) {
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker_2022_10_12<String> stringMaker = new ArrayMaker_2022_10_12<String>(String.class);
        String[] stringArray = stringMaker.create(9);
        System.out.println(Arrays.toString(stringArray));
    }
}
