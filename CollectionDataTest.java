package com.company.javaRelearn;

import com.company.javaRelearn.Generator_2022_9_25.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

class Government implements Generator<String> {
    String[] foundation = "strange women".split(" ");
    private int index;

    @Override
    public String next() {
        return foundation[index++];
    }
}

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>(
                new CollectionData_2022_12_28<String>(
                        new Government(),2));
        set.addAll(CollectionData_2022_12_28.list(new Government(),2));
        System.out.println(set);
    }
}
