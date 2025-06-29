package com.company.javaRelearn;

import java.util.Arrays;

public class MaxProduct_20250607 {
    public int maxProduct(int n) {
        String data = String.valueOf(n);
        char[] chars = data.toCharArray();
        Arrays.sort(chars);

        return (chars[chars.length - 1] - '0') * (chars[chars.length - 2] - '0');
    }
}
