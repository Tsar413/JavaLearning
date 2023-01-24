package com.company.javaRelearn;

import java.util.Map;

public class MapEntry_2023_1_24<K,V> implements Map.Entry<K,V> {
    private K key;
    private V value;

    public MapEntry_2023_1_24(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V v) {
        V result = value;
        result = v;
        return result;
    }

    @Override
    public int hashCode() {
        return (key == null ? 0 : key.hashCode()) ^
               (value == null ? 0 : value.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MapEntry_2023_1_24)) return false;
        MapEntry_2023_1_24 me = (MapEntry_2023_1_24) o;
        return
                (key == null ?
                        me.getKey() == null : key.equals(me.getKey())) &&
                (value == null ?
                        me.getValue() == null : value.equals(me.getValue()));
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }
}
