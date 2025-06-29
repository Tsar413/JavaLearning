package com.company.javaRelearn.NIIT3;

import java.util.*;

public class RandomStudent {
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

    public String randomStudentName(Map<Integer, String> map){
        Random random = new Random();
        int num = random.nextInt(map.size());
        List<Integer> integers = new ArrayList<>(map.keySet());
        return map.get(integers.get(num));
    }

    public static void main(String[] args) {
        RandomStudent randomStudent = new RandomStudent();
        System.out.println(randomStudent.randomStudentName(randomStudent.generateStudents()));
    }
}
