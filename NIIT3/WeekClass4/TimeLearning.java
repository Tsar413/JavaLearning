package com.company.javaRelearn.NIIT3.WeekClass4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeLearning {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); // 获取当前的时间与日期
        System.out.println(now);
        LocalDateTime time = LocalDateTime.of(2025, 5, 1, 10, 0, 0);
        System.out.println(time);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(now.format(formatter));
        System.out.println(time.format(formatter));

        //将时间的格式转换成 XXXX年XX月XX日 XX时XX分XX秒 并输出
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(now.format(formatter1));
        System.out.println(time.format(formatter1));
    }
}
