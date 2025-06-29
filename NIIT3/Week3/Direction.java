package com.company.javaRelearn.NIIT3.Week3;

enum Direction1{
    EAST(90), WEST(270), SOUTH(180), NORTH(0), NORTH_EAST(45), SOUTH_EAST(135), SOUTH_WEST(225), NORTH_WEST(315);
    private int degree;

    private Direction1(int degree){
        this.degree = degree;
    }

    public int getDegree(){
        return degree;
    }
}

public class Direction {
    public static void main(String[] args) {
        for (Direction1 value : Direction1.values()) {
            System.out.println(value + ":" + value.getDegree());
        }
    }
}
