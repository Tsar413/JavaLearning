package com.company.javaRelearn;

public class SquareIsWhite_20241209 {
    public boolean squareIsWhite(String coordinates) {
        int i = ((int) coordinates.charAt(0) - 1) % 2;
        int j = ((int) coordinates.charAt(1) - '0') % 2;
        return i == j;
    }
}
