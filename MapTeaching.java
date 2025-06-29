package com.company.javaRelearn;

import java.util.*;

class createMap<K, V> {
    public Map<K, V> createMapFunction() {
        Map<K, V> map = new HashMap<K, V>();
        return map;
    }

    public Map<K, V> addNewData(Map<K, V> map, K k, V v) {
        map.put(k, v);
        System.out.println(map);
        return map;
    }

    public void deleteData(Map<K, V> map, K k, V v){
        map.remove(k);
        map.remove(k, v);
    }

    public V getData(Map<K, V> map, K k) {
        map.containsKey(k);
        return map.get(k);
    }

    public Set<K> getKeys(Map<K, V> map) {
        Set<K> set = map.keySet();
        List<K> list = new ArrayList<K>(set);
        return set;
    }

    public Collection<V> getVales(Map<K, V> map){
        Collection<V> collection = map.values();
        return collection;
    }

    public Set<Map.Entry<K, V>> getKeysValues(Map<K, V> map){
        Set<Map.Entry<K, V>> mapEntry = map.entrySet();
        return mapEntry;
    }
}

public class MapTeaching {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(0,2);
        System.out.println(list.get(0));

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(2, "c");
        System.out.println(map.containsKey(1));
        map.remove(1,"b");
        System.out.println(map);

        Map<Integer, String> students = new HashMap<Integer, String>();
        students.put(1, "刘一");
        students.put(2, "陈二");
        students.put(3, "张三");
        students.put(4, "李四");
        students.put(5, "王五");
        String firstStudentName = students.get(1);
        System.out.println(firstStudentName);
//        System.out.println(students.remove(3));
//        System.out.println(students.remove(3, "张三"));
        System.out.println(students.remove(3, "张二"));
        System.out.println(students);
        Set<Integer> set = students.keySet();
        System.out.println(set);
        Collection<String> collection = students.values();
        System.out.println(collection);
        Set<Map.Entry<Integer, String>> mapEntry = students.entrySet();
        System.out.println(mapEntry);

        Map<String, Double> billing = new HashMap<String, Double>();
        billing.put("water bill", 25.80);
        billing.put("electricity", 50.91);
        billing.put("food", 300.00);
        Set<String> billTypesSet = billing.keySet();
        List<String> billTypes = new ArrayList<String>(billTypesSet);
        System.out.println(billTypes);
    }
}
