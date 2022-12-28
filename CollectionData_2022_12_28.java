package com.company.javaRelearn;

import com.company.javaRelearn.Generator_2022_9_25.Generator;

import java.util.ArrayList;

public class CollectionData_2022_12_28<T> extends ArrayList<T> {
    public CollectionData_2022_12_28(Generator<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionData_2022_12_28<T> list(
            Generator<T> gen, int quantity) {
        return new CollectionData_2022_12_28<T>(gen, quantity);
    }
}
