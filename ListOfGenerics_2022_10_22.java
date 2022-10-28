package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class ListOfGenerics_2022_10_22<T> {
    private List<T> array = new ArrayList<T>();
    public void add(T item) {
        array.add(item);
    }
    public T get(int index){
        return array.get(index);
    }
}
