package com.company.javaRelearn.NIIT3.Week2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

public class WrapperClass {
    enum Fruit{
        Apple(10), Pear(20), Orange(30);

        private int count;
        private Fruit(int count){
            this.count = count;
        }

        public int getCount(){
            return count;
        }
    }

    enum Pets{
        Dog("a", 5), Cat("b", 7);

        private String name;
        private int age;

        private Pets(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Integer a = 5;
        Integer b = null;
        // int c = null;
        //int n = Integer.parseInt("456");

        int n1 = 1;
        int n2 = 0567;
        int n3 = 0xF3;
        int n4 = 0b1101;

        double n5 = 5.67;

        char n6 = '4';

        int n7 = 1;
        int n8 = ++n7;
        int n9 = 1;
        int n10 = n9++;
        System.out.println(n8);
        System.out.println(n10);
        int m = 4, n = 15;
        while(m++ < --n){}
        System.out.println(m + " " + n);

        int c = 2;
        int d = 3;
        System.out.println(c > d ? "c大" : "d大");

        String s1 = "Hello";
        String s2 = "Hello";
        LocalDateTime time = LocalDateTime.of(2022, 3, 12, 5, 13);
        System.out.println(time);
        System.out.println(LocalDateTime.now().plusDays(100));
        System.out.println(time.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH点mm分ss秒")));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

//        Scanner scanner = new Scanner(System.in);
//        String s3 = scanner.next();
//        System.out.println(s3);
//        Scanner scanner2 = new Scanner(System.in);
//        String s4 = scanner2.nextLine();
//        System.out.println(s4);

        int score = 95;
        if(score >= 90){
            if (score >= 95){
                System.out.println("A+");
            } else {
                System.out.println("A-");
            }
        } else if (score >= 80) {
            System.out.println("B");
        } else {
            System.out.println("E");
        }

        switch (n1){
            case 1 : System.out.println(1); break;
            case 2 : System.out.println(2); break;
            default:System.out.println("并非1-2");
        }

        int n11 = 5;
        while (n11 > 0){
            System.out.println("Hello World");
            n11--;
        }

        n11 = 0;
        while (n11 <= 5){
            if(n11 % 2 == 1){
                System.out.print(n11 + "为奇数 ");
            }
            n11++;
        }

        n11 = 0;
        while (n11++ < 5){
        }
        System.out.println(n11);
        n11 = 0;
        while (++n11 < 5){
        }
        System.out.println(n11);

        n11 = 5;
        do {
            System.out.println("Hello World");
            n11--;
        } while (n11 > 0);

        n11 = 0;
        do {
            if(n11 % 2 == 1){
                System.out.print(n11 + "为奇数 ");
            }
            n11++;
        } while (n11 <= 5);

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        for (int i = 0; i <= 5; i++) {
            if(i % 2 == 1){
                System.out.print(i + "为奇数 ");
            }
        }

        int[] array = new int[]{1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int n12 : array){
            System.out.print(n12 + " ");
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 2; i <= 20; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if(i % j == 0){
                    count++;
                }
                if(count > 1){
                    break;
                }
            }
            if(count == 1){
                System.out.print(i + "为素数");
            }
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + " = " + i * j + " ");
            }
            System.out.println();
        }

        int[] array1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }
        int[][] array3 = new int[3][4];
        int num = 1;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[0].length; j++) {
                array3[i][j] = num;
                num++;
            }
        }
        System.out.println(Arrays.deepToString(array3));
        int[][] array4 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(Arrays.deepToString(array4));

        char[][] array5 = new char[3][2];
        char c1 = 'a';
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[0].length; j++) {
               array5[i][j] = c1;
               c1 += 1;
            }
        }
        System.out.println(Arrays.deepToString(array5));
        for(int num1 : array1){
            System.out.print(num1 + " ");
        }
        System.out.println();
        for (int[] num1 : array4){
            for (int num2 : num1){
                System.out.print(num2 + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (char[] c2 : array5){
            for (char c3 : c2){
                System.out.print(c3 + " ");
            }
            System.out.println();
        }
        System.out.println();

        Fruit fruit1 = Fruit.Apple;
        System.out.println(fruit1);
        System.out.println(fruit1.getCount());

        for (Fruit fruit : Fruit.values()){
            System.out.println(fruit);
            System.out.println(fruit.getCount());
        }

        for (Pets pet : Pets.values()){
            System.out.print(pet + " " + pet.getName() + " " + pet.getAge() + " ");
        }
        System.out.println();

        String s3 = "Hello";
        String s3_1 = "Hello";
        String s4 = new String("Hello");
        String s4_1 = new String("Hello");
        System.out.println(s3==s3_1);
        System.out.println(s3.equals(s3_1));
        System.out.println(s4==s4_1);
        System.out.println(s4.equals(s4_1));
        System.out.println(getAddress(s3));
        System.out.println(getAddress(s3_1));
        System.out.println(getAddress(s4));
        System.out.println(getAddress(s4_1));

        String s5 = "Hello";
        System.out.println(s5.length());

        int num1 = 5, num2 = 5;
        System.out.println(num1++);
        System.out.println(++num2);

        System.out.println(LocalDateTime.of(2025, 1,1,0,0).plusDays(50));

        char[] chars = s5.toCharArray();
        for (char c2 : chars){
            System.out.print(c2 + " ");
        }
        for (int i = 0; i < s5.length(); i++) {
            System.out.print(s5.charAt(i) + " ");
        }
        System.out.println(s5.indexOf("l"));
        System.out.println(s5.lastIndexOf("l"));

        System.out.println(s5.substring(1,3));
        System.out.println(s5.substring(2));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello ");
        stringBuilder.append("World!");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.toString());

        LocalDateTime time1 = LocalDateTime.now();
        System.out.println(time1);
        LocalDateTime time2 = LocalDateTime.of(2025, 5, 1, 12, 0);
        System.out.println(time2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(time1.format(formatter));
        String timeString1 = "2025-08-15 14:20:25";
        System.out.println(LocalDateTime.parse(timeString1, formatter));

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH点mm分ss秒");
        System.out.println(time1.format(formatter2));
        String timeString2 = "2025年08月17日 10点24分48秒";
        System.out.println(LocalDateTime.parse(timeString2, formatter2));

        Date date1 = new Date();//早
        Date date2 = new Date(System.currentTimeMillis() + 1000);//迟

        int result = date1.compareTo(date2);

        if (result < 0) {
            System.out.println("date1 在 date2 之前");
        } else if (result > 0) {
            System.out.println("date1 在 date2 之后");
        } else {
            System.out.println("date1 和 date2 相等");
        }
    }

    public static int add(int a){return 1;}
    public static double add(int a, int b){return 1;}

    public static String getAddress(Object obj){
        return obj.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(obj));
        // obj.getClass().getSimpleName() 反射，获取类名
        // Integer.toHexString 将十进制转成十六进制
        // System.identityHashCode 返回对象的默认哈希码，这个哈希码是基于对象的内存地址生成的
    }

}
