package com.company.javaRelearn;

public class CheckTwoChessboards_20241203 {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int c1 = (int) coordinate1.charAt(0) - '0';
        int n1 = (int) coordinate1.charAt(1) - '0';
        int c2 = (int) coordinate2.charAt(0) - '0';
        int n2 = (int) coordinate2.charAt(1) - '0';
        return (c1 % 2 == n1 % 2 && c2 % 2 == n2 % 2) || (c1 % 2 != n1 % 2 && c2 % 2 != n2 % 2);
    }

    public static void main(String[] args) {
        System.out.println(new CheckTwoChessboards_20241203().checkTwoChessboards("c2", "g4"));
    }
}
