package com.company.javaRelearn.UofGAssignment2;

public class Square {
    private Integer rowNum;
    private Integer colNum;
    private String ownShipSituation;
    private String squarePlayerHitSituation;
    private Battleship battleship;

    public Square() {}

    /*
    * The constructor initializes, specifying a Square's rows, columns,
    * ship cases and struck cases.
    * */
    public Square(Integer rowNum, Integer colNum, String ownShipSituation, String squarePlayerHitSituation, Battleship battleship) {
        super();
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.ownShipSituation = ownShipSituation;
        this.squarePlayerHitSituation = squarePlayerHitSituation;
        this.battleship = battleship;
    }

    /*
    *Use the getter setter method to facilitate reading and writing
    * modifications.
    * */
    public Integer getRowNum() {
        return rowNum;
    }
    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    public Integer getColNum() {
        return colNum;
    }
    public void setColNum(Integer colNum) {
        this.colNum = colNum;
    }

    public String getOwnShipSituation() {
        return ownShipSituation;
    }
    public void setOwnShipSituation(String ownShipSituation) {
        this.ownShipSituation = ownShipSituation;
    }

    public String getSquarePlayerHitSituation() {
        return squarePlayerHitSituation;
    }
    public void setSquarePlayerHitSituation(String squarePlayerHitSituation) {
        this.squarePlayerHitSituation = squarePlayerHitSituation;
    }

    public Battleship getBattleship() {
        return battleship;
    }
    public void setBattleship(Battleship battleship) {
        this.battleship = battleship;
    }

    /*
    * Use toString to normalise the output with the following logic:
    * if the vessel exists and the area has not been hit, the vessel
    * status is displayed; after the area has been hit, the then
    * modified to suit specific needs.
    * */
    @Override
    public String toString() {
        if (ownShipSituation.equals("*")) {
            return "*";
        } else {
            return squarePlayerHitSituation;
        }
    }
}
