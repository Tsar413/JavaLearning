package com.company.javaRelearn.NIIT3;

import java.util.*;

public class ShuffleGroup {
    public Map<Integer, String> generateStudents(){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "袁磊");
        map.put(4, "夏天");
        map.put(5, "魏晨洋");
        map.put(6, "沈宇涵");
        map.put(7, "张东民");
        map.put(8, "钱超");
        map.put(9, "陈昊南");
        map.put(10, "王怿涵");
        map.put(11, "向有成");
        map.put(14, "赵佳宇");
        map.put(15, "朱奕铭");
        map.put(16, "计传润");
        map.put(17, "叶嘉鋆");
        map.put(18, "周柯烨");
        map.put(19, "张昊天");
        map.put(21, "边柯嘉");
        map.put(23, "腾鑫");
        map.put(24, "朱加杉");
        map.put(25, "康海斌");
        map.put(26, "张宸奕");
        map.put(27, "杨一舟");
        map.put(28, "顾静怡");
        map.put(29, "高佳慧");
        map.put(30, "龚佳瑶");
        map.put(31, "黄怡之");
        map.put(32, "张铭");
        map.put(33, "白佳琦");
        map.put(34, "吴雨凡");
        map.put(35, "方品诺");
        map.put(36, "吴琳莹");
        map.put(37, "王喻菊");
        map.put(38, "戎战");
        map.put(39, "卢慧玲");
        map.put(40, "李瑾");
        return map;
    }

    public List<Map<Integer, String>> divideStudents(Map<Integer, String> map){
        List<Map<Integer, String>> list = new ArrayList<Map<Integer, String>>();
        List<Integer> keyList = new ArrayList<Integer>(map.keySet());
        Collections.shuffle(keyList);
        Map<Integer, String> map1 = new TreeMap<Integer, String>();
        Map<Integer, String> map2 = new TreeMap<Integer, String>();
        Map<Integer, String> map3 = new TreeMap<Integer, String>();
        for (int i = 0; i < 11; i++) {
            map1.put(keyList.get(i), map.get(keyList.get(i)));
        }
        list.add(map1);
        for (int i = 11; i < 22; i++) {
            map2.put(keyList.get(i), map.get(keyList.get(i)));
        }
        list.add(map2);
        for (int i = 22; i < keyList.size(); i++) {
            map3.put(keyList.get(i), map.get(keyList.get(i)));
        }
        list.add(map3);
        return list;
    }

    public void timeMinus() throws InterruptedException {
        System.out.println("倒计时3秒");
        Thread.sleep(1000);
        System.out.println("倒计时2秒");
        Thread.sleep(1000);
        System.out.println("倒计时1秒");
        Thread.sleep(1000);
    }

    public static void main(String[] args) {
        ShuffleGroup shuffleGroup = new ShuffleGroup();
        Map<Integer, String> map = shuffleGroup.generateStudents();
        List<Map<Integer, String>> list = shuffleGroup.divideStudents(map);
        try {
            shuffleGroup.timeMinus();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("第" + (i + 1) + "组");
            System.out.print(list.get(i));
            System.out.println();
        }

    }
}
