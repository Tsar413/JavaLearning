package com.company.javaRelearn.UofGAssignment2;

public class SmallBattleship extends Battleship {
    private static Integer shipNum = 3;

//    public LargeBattleship() {}

    public SmallBattleship() {
        super(false,1);
    }

    public static Integer getShipNum() {
        return shipNum;
    }
}
