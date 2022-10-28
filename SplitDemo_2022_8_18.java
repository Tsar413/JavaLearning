package com.company.javaRelearn;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitDemo_2022_8_18 {
    public static void main(String[] args) {
        String input =
                "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input,3)));
    }
}
