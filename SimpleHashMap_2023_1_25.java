package com.company.javaRelearn;

import java.util.*;

public class SimpleHashMap_2023_1_25<K,V> extends AbstractMap<K,V> {
    static final int SIZE = 997;
    @SuppressWarnings("unchecked")
    LinkedList<MapEntry_2023_1_24<K,V>>[] buckets = new LinkedList[SIZE];
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<MapEntry_2023_1_24<K,V>>();
        }
        LinkedList<MapEntry_2023_1_24<K,V>> bucket = buckets[index];
        MapEntry_2023_1_24<K,V> pair = new MapEntry_2023_1_24<K,V>(key, value);
        boolean found = false;
        ListIterator<MapEntry_2023_1_24<K,V>> it = bucket.listIterator();
        while (it.hasNext()) {
            MapEntry_2023_1_24<K,V> iPair = it.next();
            if (iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair);
                found = true;
                break;
            }
        }
        if (!found) {
            buckets[index].add(pair);
        }
        return oldValue;
    }

    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) return null;
        for (MapEntry_2023_1_24<K,V> iPair : buckets[index]) {
            if (iPair.getKey().equals(key)) {
                return iPair.getValue();
            }
        }
        return null;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K,V>> set = new HashSet<Map.Entry<K, V>>();
        for (LinkedList<MapEntry_2023_1_24<K,V>> bucket : buckets) {
            if (bucket == null) continue;
            for (MapEntry_2023_1_24<K,V> mpair: bucket) {
                set.add(mpair);
            }
        }
        return set;
    }
}
