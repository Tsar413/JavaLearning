package com.company.javaRelearn;

public class StringFeature_2022_8_12 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "A B C D E F G H I J K";
        //新建两个字符串
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s1);
        stringBuilder.append(s2);
        System.out.println(stringBuilder);
        //可以使用StringBuilder来构建输出内容和格式
        //append()方法为StringBuilder内置的添加内容方法
        Character[] characters = new Character[5];
        char flag = 65; //Ascii
        for(int i = 0; i < 5; i++) {
            characters[i] = flag;
            flag++;
        }
        for (Character c : characters) {
            System.out.print(c);
        }
        //构建一个字符类数组
        System.out.println();
        System.out.println("1: " + s1.length());
        //length()方法输出字符串中字符的个数
        System.out.println("2: " + s1.charAt(1));
        //charAt()方法输出指定位置上的字符
        String s3 = "";
//        System.out.println("3: " + s2.getChars(0, 1, characters, 0));
        System.out.println("4: " + s1.toCharArray());
        //生成一个char[]，用来包含String的所有字符
        System.out.println("5: " + s1.equals(s2));
        //比较两个String的内容是否完全相同
        System.out.println("6: " + s1.compareTo(s2));
        System.out.println("6: " + s1.compareTo(s3));
        //按照字典顺序比较两个String
        //compareTo()遵循以下原则
        /*
        * 1. 如果两条String的首字母不同，那么将比较首字母Ascii码的差值
        * 2. 如果两条String的首字母相同，则会同时向后比较下一位字符Ascii码的差值
        * String a1 = "aa";
        * String a2 = "ad";
        * System.out.println(a1.compareTo(a2));//结果为-3
        * 3. 如果字符串不一样长，可比较的的字符又完全一样，那么返回两个String的长度差值
        * String a1 = "aa";
        * String a2 = "aa12345678";
        * System.out.println(a1.compareTo(a2));//结果为-8
        * 4. 返回正数表示a1>a2, 返回负数表示a1<a2, 返回0表示两者完全相同
        * */
        for (Character c : characters) {
            System.out.print("7: " + s1.contains(c.toString()) + " ");
        }
        //contains()方法表示该string是否包含对应参数
        System.out.println();
        System.out.println("8: " + s1.contentEquals("Hello World"));
        System.out.println("8: " + s2.contentEquals("AB"));
        //contentEquals()方法比较两条string的内容是否完全相同，返回结果为boolean
        System.out.println("9: " + s1.equalsIgnoreCase("hello world"));
        //equalsIgnoreCase()方法会忽略比较string的大小写再进行比较，返回结果为boolean
        String s4 = "Hello";
        System.out.println("10: " + s1.regionMatches(true,0,s4,0,1));
        //regionMatches()方法的主要作用在于比较特定区域中是否包含相关元素
        /*
        * regionMatches()需要明确的元素。
        * 1. 是否需要忽视大小写
        * 2. 该String的索引偏移量
        * 3. 需要进行比较的string
        * 4. 需要进行比较的string的索引偏移量
        * 5. 比较长度
        *
        * 索引偏移量指数组中[X]，X的值
        * */
        System.out.println("11: " + s1.startsWith("Hello",0));
        //startsWith()方法判断该String的起始值，并且可以使用索引偏移量进行重载
        System.out.println("12: " + s1.endsWith("World"));
        //endsWith()方法判断该String的结束值
        System.out.println("13: " + s1.indexOf("World"));
        System.out.println("13: " + s1.lastIndexOf("Hello"));
        //indexOf()和lastIndexOf()方法的最主要作用在于返回该String中的起始索引
        //lastIndexOf()则是从后向前搜索，若该元素不存在，则返回-1
        s4 = s2.substring(1,3);
        System.out.println("14: " + s4);
        //substring()方法被用来返回一段String中的指定范围内的值。具体的为[1,3)
        s4 = s1.concat(s2);
        System.out.println("15: " + s4);
        //concat()方法被用来返回一个新的String，具体内容为两个String的结合
        System.out.println("16: " + s2.replace("K", " "));
        //replace()方法被用来使用指定的元素在指定的位置对相关元素进行替换
        System.out.println("17: " + s2.toLowerCase());
        System.out.println("17: " + s2.toUpperCase());
        //toLowerCase()方法被用来修改String的大小写，并返回一个新的String
        System.out.println("18: " + s2.replace("K", " ").trim());
        //trim()方法被用来删除String两边的空白字符串
        s4 = String.valueOf(characters);
        System.out.println("19: " + s4);
        //返回一个表示参数内容的String
    }
}
