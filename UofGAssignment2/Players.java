package com.company.javaRelearn.UofGAssignment2;

import java.util.Arrays;

public class Players {
    private String username;
    private Integer mark;
    private Board hitBoard;
    private Board shipsBoard;
    private String s1 = "";
    private Integer s2;

    public Players() {}

    public Players(String username, Integer mark, Board hitBoard, Board shipsBoard) {
        this.username = username;
        this.mark = mark;
        this.hitBoard = hitBoard;
        this.shipsBoard = shipsBoard;
    }

    public Players(String username, Board hitBoard) {
        this.username = username;
        this.mark = 0;
        this.hitBoard = hitBoard;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getMark() {
        return mark;
    }
    public void setMark(Integer mark) {
        this.mark = mark;
    }

    //Returns Boolean to determine if the game needs to continue
    /*
    * This method consists of two steps, the first is to replace the board
    * used to display the player's position directly with changeHitBoard();
    * the second step The second step is to find the ships and return the
    * corresponding data via the changeShipBoard() method. Also, based on
    * the Battleship array from the Board, output Battleship status and hits.
    * */
    public Boolean takeTurn(int col, int row, Board shipsBoard, Board enemyShipBoard) {

        s1 = Board.changeHitBoard(row,col,hitBoard,enemyShipBoard);
        s2 = enemyShipBoard.changeShipBoard(row,col,hitBoard,enemyShipBoard);
        int m = 0;
//        System.out.println(s2);
        Battleship[] battleships = shipsBoard.getBattleships();
        //Output Battleship
        for (Battleship b : battleships) {
            System.out.println(b);
        }
        Battleship[] battleships2 = enemyShipBoard.getBattleships();
        //Determine and Output if a hit was made and the condition of the sinking.
        if (s2 != -1) {
            System.out.println("Hit!");
            if (battleships2[s2].getSink()) {
                System.out.println("Enemy ship sunk!");
                mark++;
            }
        } else {
            System.out.println("Miss!");
        }


        //Return whether you need to continue
        if (battleships2.length == 5) {
            if (mark == 5) {
                return true;
            } else {
                return false;
            }
        } else {
            if (mark == 6) {
                return true;
            } else {
                return false;
            }
        }

//        System.out.println(s1);
//        System.out.println(shipsBoard.toString1());
//        System.out.println(enemyHitBoard.toString());
//        System.out.println(s2);

    }

    @Override
    public String toString() {
        return "Players{" +
                "username='" + username + '\'' +
                ", mark=" + mark +
                ", hitBoard=" + s1 +
//                ", battleships=" + Arrays.toString(shipsBoard.getBattleships()) +
//                ", shipsBoard=" + shipsBoard.toString1() +
                '}';
    }
}
