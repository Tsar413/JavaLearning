package com.company.javaRelearn.AdvancedProgrammingAE2;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        Solution s1 = new Solution();
////        Solution s2 = new Solution();
////        System.out.println(s1.runCommand("start 10456060"));
////        System.out.println(s2.runCommand("start 72345680"));
////        System.out.println(s1.runCommand("running"));
////        System.out.println(s2.runCommand("running"));
//
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        String s;
        while ((s = stdin.readLine()) !=null && s.length() != 0) {
            System.out.println(s1.runCommand(s));
//            System.out.println(s);
        }
//        System.out.println(solution.runCommand("start 1000"));
//        System.out.println(solution.runCommand("start 114514"));
//        System.out.println(solution.runCommand("start 2000"));
//        System.out.println(solution.runCommand("running"));
//        System.out.println(solution.runCommand("cancel 1000"));
//        System.out.println(solution.runCommand("running"));
//        System.out.println(solution.runCommand("abort"));
//        System.out.println(solution.runCommand("running"));
//        System.out.println(solution.runCommand("get 114514"));
//        System.out.println(solution.runCommand("get 2000"));
//        System.out.println(solution.runCommand("start 1145202"));
//        System.out.println(solution.runCommand("start 1145206"));
//        System.out.println(solution.runCommand("running"));
//        System.out.println(solution.runCommand("cancel 1145206"));
//        System.out.println(solution.runCommand("running"));
//        System.out.println(solution.runCommand("finish"));
//        System.out.println(solution.runCommand("get 1145202"));
//        System.out.println(solution.runCommand("get 1145206"));
//        System.out.println(solution.runCommand("start 10456060"));
//        System.out.println(solution.runCommand("running"));
//        System.out.println(solution.runCommand("get 10456060"));
//        System.out.println(solution.runCommand("get 10456060"));
//        System.out.println(solution.runCommand("start 723456810"));
//        System.out.println(solution.runCommand("start 534912560"));
//        System.out.println(solution.runCommand("get 534912560"));
//        System.out.println(solution.runCommand("running"));
//        System.out.println(solution.runCommand("cancel 723456810"));
//        System.out.println(solution.runCommand("running"));
//        System.out.println(solution.runCommand("cancel 534912560"));
//        System.out.println(solution.runCommand("running"));
//        System.out.println(solution.runCommand("finish"));

    }
}
