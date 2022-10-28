package com.company.javaRelearn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression_2022_8_14 {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Usage:\njava TestRegularExpression_2022_8_14 " +
                    "characterSequence regularExpression+");
            System.exit(0);
        }
        System.out.println("Input: \"" + args[0] + "\"");
        for (String s: args) {
            System.out.println("Regular expression: \"" + s + "\"");
            Pattern p = Pattern.compile(s);
            Matcher m = p.matcher(args[0]);
            while (m.find()) {
                System.out.println("Match \"" + m.group() + "\" at position " +
                        m.start() + "-" + (m.end() - 1));
            }
        }
    }
}
