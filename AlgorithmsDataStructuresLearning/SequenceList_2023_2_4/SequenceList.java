package com.company.javaRelearn.AlgorithmsDataStructuresLearning.SequenceList_2023_2_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SequenceList<T> {
    private T[] array;
    private Class<T> type;

    public SequenceList(Class<T> type, int length) {
        this.type = type;
        array = (T[]) Array.newInstance(type,length);
    }

    public void clear() {
        Arrays.fill(array,null);
    }

    public boolean isEmpty() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                return false;
            }
        }
        return true;
    }

    public int length() {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                result++;
            }
        }
        return result;
    }

    public T get(int i) {
        T result = null;
        result = array[i];
        return result;
    }

    public void insert(T t) {
        int n = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                n = i;
                break;
            }
        }
        if (n == -1) {
            resize(array.length * 2);
        } else {
            array[n] = t;
        }
    }

    public void insert(T t, int n) {
        if (array[array.length - 1] != null) {
            resize(array.length * 2);
        } else {
            for (int i = array.length - 1; i > n; i--) {
                array[i-1] = array[i];
            }
            array[n] = t;
        }
    }

    public T remove(int i) {
        T result = array[i];
        for (int j = i; j < array.length - 1; j++) {
            array[j] = array[j+1];
        }
        array[array.length - 1] = null;
        int n = -1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == null) {
                n = j;
                break;
            }
        }
        if (n < array.length / 4) {
            resize(array.length / 2);
        }
        return result;
    }

    public int indexOf(T t) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(t)) {
                result = i;
            }
        }
        return result;
    }

    public void resize(int newsize) {
        T[] temp = array;
        array = (T[]) Array.newInstance(type,newsize);
        System.arraycopy(temp,0,array,0,temp.length);
    }

    public int capacity() {
        return array.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        SequenceList<String> list = new SequenceList<>(String.class,1);
        list.insert("ll");
        list.insert("ee");
        list.insert("tt",1);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.length());
        list.clear();
        System.out.println(list);
        System.out.println(list.length());

    }
}
