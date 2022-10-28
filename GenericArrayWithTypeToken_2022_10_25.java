package com.company.javaRelearn;

import java.lang.reflect.Array;

public class GenericArrayWithTypeToken_2022_10_25<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    public GenericArrayWithTypeToken_2022_10_25(Class<T> type, int sz) {
        array = (T[]) Array.newInstance(type,sz);
    }
    public void put(int index, T item) {
        array[index] = item;
    }
    public T get(int index) {
        return array[index];
    }
    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArrayWithTypeToken_2022_10_25<Integer> gai =
                new GenericArrayWithTypeToken_2022_10_25<Integer>(
                        Integer.class, 10);
        Integer[] ia = gai.rep();
    }
}
