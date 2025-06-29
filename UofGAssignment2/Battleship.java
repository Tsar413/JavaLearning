package com.company.javaRelearn.UofGAssignment2;

public class Battleship {
    private Boolean sink;
    private Integer restHP;
    private Integer shipSize;
//    private String[] shipLocation;

    public Battleship() {

    }

    //Constructs the constructor of the Battleship class,
    // specifically in setting the properties of whether
    // the ship is sunk and the specific amount of blood.
    public Battleship(Boolean sink, Integer shipSize) {
        super();
        this.sink = sink;
        this.shipSize = shipSize;
        this.restHP = shipSize;
    }

    //getter setter to control Battleship class

    public Boolean getSink() {
        return sink;
    }
    public void setSink(Boolean sink) {
        this.sink = sink;
    }

    public Integer getRestHP() {
        return restHP;
    }
    public void setRestHP(Integer restHP) {
        this.restHP = restHP;
    }

    public Integer getShipSize() {
        return shipSize;
    }
    public void setShipSize(Integer shipSize) {
        this.shipSize = shipSize;
    }

//    public String[] getShipLocation() {
//        return shipLocation;
//    }
//
//    public void setShipLocation(Integer[] shipLocationInitialData) {
//        shipLocation = new String[shipSize];
//        for (int i = 0; i < shipSize; i++) {
//            shipLocation[i] = shipLocationInitialData[i * 2].toString() + "," + shipLocationInitialData[i * 2 + 1];
////            System.out.println(shipLocation[i]);
//        }
//    }

    @Override
    public String toString() {
        return "Battleship{" +
                "sink=" + sink +
                " restHP=" + restHP +
                " shipSize=" + shipSize +
                '}';
    }
}
