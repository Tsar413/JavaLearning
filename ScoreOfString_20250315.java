package com.company.javaRelearn;

/*
* 3110. 字符串的分数
给你一个字符串 s 。一个字符串的 分数 定义为相邻字符 ASCII 码差值绝对值的和。
请你返回 s 的 分数 。

示例 1：
输入：s = "hello"
输出：13
解释：
s 中字符的 ASCII 码分别为：'h' = 104 ，'e' = 101 ，'l' = 108 ，'o' = 111 。所以 s 的分数为 |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13 。

示例 2：
输入：s = "zaz"
输出：50
解释：
s 中字符的 ASCII 码分别为：'z' = 122 ，'a' = 97 。所以 s 的分数为 |122 - 97| + |97 - 122| = 25 + 25 = 50 。
* */

public class ScoreOfString_20250315 {
    public int scoreOfString(String s) {
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            result += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return result;
    }
}
