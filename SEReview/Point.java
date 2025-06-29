package com.company.javaRelearn.SEReview;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean changePoint(int x, int y) {
        this.x = x;
        this.y = y;
        return true;
    }

    public boolean removePoint() {
        this.x = -1;
        this.y = -1;
        return true;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
