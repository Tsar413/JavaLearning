package com.company.javaRelearn.NIIT3.Week6;

import java.lang.reflect.Array;
import java.util.Arrays;

class MyArray<T>{
    private T[] array;
    private int index;
    private int length;

    public MyArray(Class<T> type, int size){
        this.array = (T[]) Array.newInstance(type, size);
        this.index = 0;
        this.length = size;
    }

    public T get(int index){
        if(index > this.index) throw new RuntimeException("超出大小");
        return array[index];
    }

    public void add(T t){
        if(index + 1 > length) throw new RuntimeException("超出大小");
        array[index] = t;
        index++;
    }

    public boolean set(T t, int index){
        if(index > this.index - 1){
            return false;
        }
        array[index] = t;
        return true;
    }

    public T remove(T t){
        int removeIndex = -1;
        for (int i = 0; i < index; i++) {
            if(array[i].equals(t)){
                removeIndex = i;
                break;
            }
        }
        if(removeIndex == -1) throw new RuntimeException("对象不存在");
        return remove(removeIndex);
    }

    public T remove(int index){
        if(index > this.index - 1) throw new RuntimeException("超出大小");
        T t = array[index];
        for (int i = index; i < this.index - 1; i++) {
            array[i] = array[i + 1];
        }
        array[this.index - 1] = null;
        this.index--;
        return t;
    }

    public int size(){
        return index + 1;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("{");
        for (T t : array) {
            if (t != null) {
                output.append(t);
                output.append(",");
            } else {
                break;
            }
        }
        output.deleteCharAt(output.length() - 1);
        output.append("}");
        return "MyArray" + output.toString();
    }

    public static void main(String[] args) {
        MyArray<Integer> myArray = new MyArray<Integer>(Integer.class, 5);
        myArray.add(1);
        myArray.add(5);
        myArray.set(4, 1);
        myArray.remove(1);
        System.out.println(myArray);

        MyArray<Double> myArray1 = new MyArray<Double>(Double.class, 5);
        myArray1.add(1.0);
        myArray1.add(3.5);
        myArray1.remove(1.0);
        myArray1.add(3.5);
        myArray1.add(3.5);
        System.out.println(myArray1.get(2));
        System.out.println(myArray1);
    }
}

class Pair<K, V>{
    private K first;
    private V second;

    public Pair() {
    }

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

class GenericFunction{
    public static <T> T[] getGenericArray(Class<T> type, T... args){
        T[] array = (T[]) Array.newInstance(type, args.length);
        int index = 0;
        for (T t : args){
            array[index] = t;
            index++;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getGenericArray(String.class, "a", "b", "c", "d")));
        System.out.println(Arrays.toString(getGenericArray(Integer.class, 3, 6, 8, 0)));
    }
}

public class GenericLearning {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<Integer, String>(2, "a");
        System.out.println(pair.getFirst().getClass().getSimpleName() + ":" + pair.getFirst());
        System.out.println(pair.getSecond().getClass().getSimpleName() + ":" + pair.getSecond());
    }
}
