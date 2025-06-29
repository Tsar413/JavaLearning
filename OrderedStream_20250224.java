package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

class OrderedStream {
    private String[] array;
    private int index;

    public OrderedStream(int n) {
        this.array = new String[n];
        this.index = 1;
    }

    public List<String> insert(int idKey, String value) {
        array[idKey - 1] = value;
        List<String> result = new ArrayList<String>();
        for (int i = index - 1; i < array.length; i++) {
            if(array[i] != null){
                result.add(array[i]);
            } else {
                index = i + 1;
                break;
            }
        }
        return result;
    }
}

public class OrderedStream_20250224 {
}
