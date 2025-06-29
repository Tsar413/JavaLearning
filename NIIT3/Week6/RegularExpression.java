package com.company.javaRelearn.NIIT3.Week6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void regularExpressionLearning(){
        boolean flag = Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", "a@b.com");
        System.out.println(flag);

        Pattern myPattern = Pattern.compile("J.*n");
        Matcher matcher = myPattern.matcher("John does this, and John does that ,and John do something");
        String str = matcher.replaceFirst("sam");
        System.out.println(str);
    }

    public static void regularExpressionTest1(){
        Pattern myPattern = Pattern.compile(":");
        String[] split = myPattern.split("one:two:three:four", 2);
        for(String element:split) {
            System.out.println("element = " + element);
        }

        boolean matches = Pattern.matches("[[^d-z]&&[^0-9]]{5,}", "abcdef");
        System.out.println(matches ? "匹配":"不匹配");

    }

    public static void regularExpressionTest2(){
        Pattern myPattern = Pattern.compile("J.*n");
        Matcher matcher = myPattern.matcher("John does this, and John does that ,and John do something");
        String str = matcher.replaceFirst("sam");
        System.out.println(str);

    }

    public static void main(String[] args) {
        regularExpressionTest1();
        regularExpressionTest2();
        regularExpressionLearning();
    }
}
