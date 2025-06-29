package com.company.javaRelearn.UofGAssignment2;

public class MediumBattleship extends Battleship {
    private static Integer shipNum = 2;

//    public LargeBattleship() {}

    public MediumBattleship() {
        super(false,2);
    }

    public static Integer getShipNum() {
        return shipNum;
    }
}
