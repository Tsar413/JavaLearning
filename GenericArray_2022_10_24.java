package com.company.javaRelearn;

public class GenericArray_2022_10_24<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    public GenericArray_2022_10_24(int sz) {
        array = (T[]) new Object[sz];
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
        GenericArray_2022_10_24<Integer> gai = new GenericArray_2022_10_24<Integer>(10);
        Object[] ga = gai.rep();
    }
}
