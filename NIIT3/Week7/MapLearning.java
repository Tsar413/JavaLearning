package com.company.javaRelearn.NIIT3.Week7;

import java.util.*;

class MapFunctions{
    public void mapFunctions(){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "张二");
        map.put(2, "李四");
        map.put(3, "王五");
        map.put(4, "赵六");
        map.put(1, "张三");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.size());
        System.out.println(map.remove(3));
        System.out.println(map.remove(4, "赵六"));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.isEmpty());
    }

    public static void main(String[] args) {
        MapFunctions mapFunctions = new MapFunctions();
        mapFunctions.mapFunctions();
    }
}

class MapReading{
    private Map<Integer, String> generateMap(){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王五");
        map.put(4, "赵六");
        return map;
    }

    //方法1：获取map中所有的key值，通过key值获取value
    public <K, V> void readingMap1(Map<K, V> map){
        Set<K> keySet = map.keySet(); //通过keySet()获取全部的key值
        List<K> keySetList = new ArrayList<K>(keySet); //将对应的set转成list方便使用
        for (K key : keySetList){
            V value = map.get(key); //通过get方法获取对应的value
            System.out.println("{" + key + ":" + value + "}"); //进行输出
        }
    }

    //方法2：获取map中所有的value值，通过遍历获取
    public <K, V> void readingMap2(Map<K, V> map){
        Collection<V> values = map.values(); //通过values()获取全部的value值
        for (V value : values){
            System.out.print(value + " "); //输出
        }
        System.out.println();
    }

    //方法3：通过entrySet获取全部的map值，同时获取key与value
    public <K, V> void readingMap3(Map<K, V> map){
        Set<Map.Entry<K, V>> entries = map.entrySet(); //通过entrySet获取指定的key与value的组合
        for (Map.Entry<K, V> entry : entries){
            K key = entry.getKey(); //通过getKey方法获取key值
            V value = entry.getValue(); //通过getValue方法获取value值
            System.out.println("{" + key + ":" + value + "}"); //进行输出
        }
    }

    public static void main(String[] args) {
        MapReading mapReading = new MapReading();
        Map<Integer, String> map = mapReading.generateMap();
        mapReading.readingMap1(map);
        mapReading.readingMap2(map);
        mapReading.readingMap3(map);
    }
}

class DifferentMap{
    public void differentMap(Map<Integer, String> map){
        map.put(2, "b");
        map.put(12, "ba");
        map.put(44, "ac");
        map.put(90, "ta");
        map.put(39, "ra");
        map.put(32, "ca");
        System.out.println(map);
    }

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        Map<Integer, String> map2 = new TreeMap<Integer, String>();
        Map<Integer, String> map3 = new TreeMap<Integer, String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        new DifferentMap().differentMap(map1);
        new DifferentMap().differentMap(map2);
        new DifferentMap().differentMap(map3);
    }
}

public class MapLearning {
}
