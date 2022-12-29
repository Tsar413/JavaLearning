package com.company.javaRelearn;

import com.company.javaRelearn.Generator_2022_9_25.Generator;

import java.util.LinkedHashMap;

public class MapData_2022_12_29<K,V> extends LinkedHashMap<K,V> {
    public MapData_2022_12_29(Generator<Pair_2022_12_29<K,V>> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            Pair_2022_12_29<K,V> p = gen.next();
            put(p.key,p.value);
        }
    }

    public MapData_2022_12_29(Generator<K> genK, Generator<V> genV, int quantity) {
        for (int i = 0; i < quantity; i++) {
            put(genK.next(), genV.next());
        }
    }

    public MapData_2022_12_29(Generator<K> genK, V value, int quantity) {
        for (int i = 0; i < quantity; i++) {
            put(genK.next(), value);
        }
    }

    public MapData_2022_12_29(Iterable<K> genK, Generator<V> genV) {
        for (K key : genK) {
            put(key,genV.next());
        }
    }

    public MapData_2022_12_29(Iterable<K> genK, V value) {
        for (K key : genK) {
            put(key,value);
        }
    }

    public static <K,V> MapData_2022_12_29<K,V>
    map(Generator<Pair_2022_12_29<K,V>> gen, int quantity) {
        return new MapData_2022_12_29<K,V>(gen,quantity);
    }

    public static <K,V> MapData_2022_12_29<K,V>
    map(Generator<K> genK, Generator<V> genV, int quantity) {
        return new MapData_2022_12_29<K,V>(genK,genV,quantity);
    }

    public static <K,V> MapData_2022_12_29<K,V>
    map(Generator<K> genK, V value, int quantity) {
        return new MapData_2022_12_29<K,V>(genK,value,quantity);
    }

    public static <K,V> MapData_2022_12_29<K,V>
    map(Iterable<K> genK, Generator<V> genV) {
        return new MapData_2022_12_29<K,V>(genK,genV);
    }

    public static <K,V> MapData_2022_12_29<K,V> map(Iterable<K> genK, V value) {
        return new MapData_2022_12_29<K,V>(genK,value);
    }
}
