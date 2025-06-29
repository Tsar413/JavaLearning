package com.company.javaRelearn.NIIT3.WeekClass4;

class StringLearning1{
    public static String getAddress(Object obj){
        return obj.getClass().getSimpleName() + "@" +
                Integer.toHexString(System.identityHashCode(obj));
    }

    public void equalsLearning(){
        String s3_1 = "Hello1";
        String s3_2 = "Hello";
        String s3_3 = new String("Hello1");
        String s3_4 = new String("Hello1");

        System.out.println(s3_1 == s3_2);
        System.out.println(s3_1.equals(s3_2));
        System.out.println(s3_3 == s3_4);
        System.out.println(s3_3.equals(s3_4));

        System.out.println(getAddress(s3_1));
        System.out.println(getAddress(s3_2));
        System.out.println(getAddress(s3_3));
        System.out.println(getAddress(s3_4));
    }

    public void stringFunctions(){
        String s1 = "Hello";
        char[] chars = s1.toCharArray(); // toCharArray() 将String转换成对应的字符数组
        for (char c : chars){
            System.out.print(c + " ");
        }
        System.out.println();

        for (int i = 0; i < s1.length(); i++) { // length() 获取字符串的长度
            System.out.print(s1.charAt(i) + " "); // charAt() 获取指定索引的字符
        }
        System.out.println();

        System.out.println(s1.indexOf("l")); // indexOf() 获取第一次出现的索引 从前向后
        System.out.println(s1.lastIndexOf("l")); //lastIndexOd() 获取最后一次出现的索引 从后向前

        System.out.println(s1.substring(3)); // substring()获取子串 从索引3（包括）开始向后
        System.out.println(s1.substring(1, 3)); // substring()获取子串 索引1到3（包括1不包括3） [1,3)

        String s2 = "awgauvasd";
        System.out.println(s2.indexOf("a"));
        System.out.println(s2.lastIndexOf("a"));
        System.out.println(s2.substring(6));
        System.out.println(s2.substring(3, 6));
    }

    public void stringBuilderBufferLearning(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" World");
        stringBuilder.append("aefawef");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.getClass().getSimpleName());
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.toString().getClass().getSimpleName());
    }

    public static void main(String[] args) {
        new StringLearning1().stringBuilderBufferLearning();
    }
}

public class StringLearning {
}
