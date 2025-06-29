package com.company.javaRelearn.UofGAssignment2;

public class LargeBattleship extends Battleship {
    private static Integer shipNum = 1;

//    public LargeBattleship() {}

    public LargeBattleship() {
        super(false,3);
    }

    public static Integer getShipNum() {
        return shipNum;
    }
}
