package com.company.javaRelearn.UofGAssignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Board {
    private Integer row;
    private Integer col;
    private Square[] squares;
    private StringBuffer initializeBoard = new StringBuffer();
    private StringBuffer boardWithShip = new StringBuffer();
    private Battleship[] battleships = new Battleship[6];
    private Integer[] shipsLocation;

    public Board() {}
    public Board(int row, int col) {
        super();
        this.row = row;
        this.col = col;
    }

    /*
    * Initialise the empty panel fillBoard(), this method will
    * initialise the board according to the length and width in
    * the board constructor, the goal is to achieve a board that
    * is all '-'
    * */
    public void fillBoard() {
        squares = new Square[row * col];
        /*
        * The main purpose of this loop is to initialise Square, where
        * the number of columns is the result obtained by numbering %10
        * where square is at the time, and the row number is the result
        * obtained by numbering /10 where square is at the time. In the
        * process of initialising the board, no specific Battleship
        * situation is required, so it can be left vacant and all Squares
        * are set to be output with "-".
        * */
        for (int i = 0; i < squares.length; i++) {
            squares[i] = new Square();
            squares[i].setColNum(i % 10);
            squares[i].setRowNum(i / 10);
            squares[i].setOwnShipSituation("");
            squares[i].setSquarePlayerHitSituation("-");
            squares[i].setBattleship(null);
        }

        /*
        * Use String.format() to make data together.
        * The main reason for counting from -1 is that I want
        * the number row to be -1.
        * */
        for (int i = -1; i < row; i++) {
            if (i == -1) {
                initializeBoard.append(String.format("%2s", " "));
                for (int j = 0; j < col; j++) {
                    initializeBoard.append(String.format("%3s", j));
                }
            } else {
                /*
                * Also, each line needs to be specified with a specific
                * line number before the specific Square is used, using
                * the serial number for output.
                * */
                initializeBoard.append(String.format("%2s", i));
                for (int j = 0; j < col; j++) {
                    initializeBoard.append(String.format("%3s", squares[i * 10 + j ]));
                }
            }
            initializeBoard.append("\n"); //Change line.
        }
    }

    /*
    * Creates a random ship createRandomShip(int shipFinalNumber), this method
    * aims to create a random Battleship containing Board, if a Battleship exists
    * in the region, then '*' will be used to represent the ship.
    * */
    public void createRandomShip(int shipFinalNumber) {
        squares = new Square[row * col];
        //Start by filling the Board with Square, which is the same as the previous step.
        for (int i = 0; i < squares.length; i++) {
            squares[i] = new Square();
            squares[i].setColNum(i % 10);
            squares[i].setRowNum(i / 10);
            squares[i].setOwnShipSituation("");
            squares[i].setSquarePlayerHitSituation("-");
            squares[i].setBattleship(null);
        }

        for (int i = -1; i < row; i++) {
            if (i == -1) {
                boardWithShip.append(String.format("%2s", " "));
                for (int j = 0; j < col; j++) {
                    boardWithShip.append(String.format("%3s", j));
                }
            } else {
                boardWithShip.append(String.format("%2s", i));
                for (int j = 0; j < col; j++) {
                    boardWithShip.append(String.format("%3s", squares[i * 10 + j ]));
                }
            }
            boardWithShip.append("\n");
        }
        Random rand = new Random(); //Get Random number
        int shipNum = 0; //Initial Battleship Number

        /*
        * The chain table area is used to determine if there is a repeated use
        * of coordinates when generating ship coordinates.
        * */
        //The first coordinates of the ship
        List<Integer> combineNum1 = new ArrayList<Integer>();
        //ONE coordinate to the RIGHT of the ship's head coordinates
        List<Integer> combineNum2 = new ArrayList<Integer>();
        //ONE coordinate DOWN from the ship's head coordinate
        List<Integer> combineNum3 = new ArrayList<Integer>();
        //TWO coordinates to the RIGHT of the ship's head coordinates
        List<Integer> combineNum4 = new ArrayList<Integer>();
        //TWO coordinates DOWN from the ship's head coordinate
        List<Integer> combineNum5 = new ArrayList<Integer>();
        //Storage of individual coordinates in a nested chain
        List<List<Integer>> judgeNum = new ArrayList<>();

        while (true) {
            //Using random numbers to determine the horizontal and
            // vertical condition of a boat
            boolean judgeShipDirection = rand.nextBoolean();
            int shipStartCol = 0;
            int shipStartRow = 0;

            /*
            * The shipFinalNumber in the method is used to determine the ship
            * If it is 5, it means that five ships of length 2 are generated;
            * if it is not 5, then it means that it generates ships of all types.
            *
            * A loop is used to get the position of the vessel and if a duplicate occurs,
            * it needs to be retrieved.
            * */
            if (shipFinalNumber == 5) {
                /*
                * * In terms of the specific algorithm, the initial coordinates of the
                 * ship need to be determined first so that all positions of the ship
                 * can be determined. If the ship is horizontal, in order to ensure that
                 * the ship does not go out of bounds, then it is necessary to ensure that
                 * the initial point of the ship is taken to be within the range of
                 * horizontal coordinates 0-8 and vertical coordinates 0-9, which will
                 * ensure that it does not go out of bounds, and similarly if the ship
                 * is vertical, then it is necessary to ensure that the initial point
                 * of the ship is taken to be within the range of horizontal coordinates
                 * 0-9 and vertical coordinates 0-8.
                * */
                while (true) {
                    if (judgeShipDirection) { //horizontal
                        shipStartRow = rand.nextInt(10);
                        shipStartCol = rand.nextInt(9);
                        // Arrays.asList() can combine the elements in the (), output as a list
                        combineNum1 = Arrays.asList(shipStartRow,shipStartCol);
                        combineNum2 = Arrays.asList(shipStartRow,shipStartCol + 1);
                        // contains() can judge the repetition of ships' locations
                        if (!judgeNum.contains(combineNum1) && !judgeNum.contains(combineNum2)) {
                            // If no duplication of position occurs, new coordinates
                            // need to be added to the chain table.
                            judgeNum.add(combineNum1);
                            judgeNum.add(combineNum2);
                            break;
                        }
                    } else { //vertical
                        shipStartRow = rand.nextInt(9);
                        shipStartCol = rand.nextInt(10);
                        combineNum1 = Arrays.asList(shipStartRow,shipStartCol);
                        combineNum3 = Arrays.asList(shipStartRow + 1,shipStartCol);
                        if (!judgeNum.contains(combineNum1) && !judgeNum.contains(combineNum3)) {
                            judgeNum.add(combineNum1);
                            judgeNum.add(combineNum3);
                            break;
                        }
                    }

                }

                /*
                * As the situation was initially envisaged to be the same as that of a traditional ,
                * game, provision was made for the appearance of four Boards.
                *
                * The core idea is to replace the coordinates of the ship grid, generated by random
                * numbers, with a new Square object.
                * */
                if (judgeShipDirection) { //horizontal
                    /*
                    * If the number of boats generated is 6 then stop, as the index of the array
                    * starts at 0, so here it is 5.
                    * */
                    if (shipNum == 5) {
                        break;
                    } else {
                        /*
                        * Since the ships are all the same size, it is possible to have the device
                        * automatically generate a Batteleship, and the first step in the whole
                        * algorithm is to initialise a Battleship object of size 1 x 2. The initial
                        * position generated by the random number above is then replaced with the
                        * grid to the right of the initial position.
                        * */

                        battleships[shipNum] = new Battleship(false,2); //Initialising Battleship

                        if (battleships[shipNum].getShipSize() == 2) {
                            shipsLocation = new Integer[]{shipStartCol, shipStartRow, shipStartCol + 1, shipStartRow};
                        }
//                        battleships[shipNum].setShipLocation(shipsLocation);

                        //Replace an old Square object with a new Square object
                        squares[shipStartRow * 10 + shipStartCol] = new Square(shipStartRow, shipStartCol,
                                "*", "-", battleships[shipNum]);
                        squares[shipStartRow * 10 + shipStartCol + 1] = new Square(shipStartRow, shipStartCol + 1,
                                "*", "-",battleships[shipNum]);

                        //Replace the board used to keep Battleship
                        boardWithShip.replace(((shipStartRow+1) * 11 + shipStartCol + 1)*3 + 1,((shipStartRow+1) * 11 + shipStartCol + 1)*3 + 2,
                                squares[shipStartRow * 10 + shipStartCol].toString());
                        boardWithShip.replace(((shipStartRow+1) * 11 + shipStartCol + 2)*3 + 1,((shipStartRow+1) * 11 + shipStartCol + 2)*3 + 2,
                                squares[shipStartRow * 10 + shipStartCol + 1].toString());
                        shipNum++;
                    }
                } else { //vertical
                    /*
                    * The logic is the same as above, the only difference being that here the
                    * vessels are generated vertically.
                    * */
                    /*
                     * If the number of boats generated is 6 then stop, as the index of the array
                     * starts at 0, so here it is 5.
                     * */
                    if (shipNum == 5) {
                        break;
                    } else {
                        battleships[shipNum] = new Battleship(false,2); //Initialising Battleship
                        if (battleships[shipNum].getShipSize() == 2) {
                            shipsLocation = new Integer[]{shipStartCol, shipStartRow, shipStartCol, shipStartRow + 1};
                        }
//                        battleships[shipNum].setShipLocation(shipsLocation);

                        //Replace an old Square object with a new Square object
                        squares[shipStartRow * 10 + shipStartCol] = new Square(shipStartRow, shipStartCol,
                                "*", "-", battleships[shipNum]);
                        squares[(shipStartRow + 1) * 10 + shipStartCol] = new Square(shipStartRow + 1, shipStartCol,
                                "*", "-",battleships[shipNum]);

                        //Replace the board used to keep Battleship
                        boardWithShip.replace(((shipStartRow+1) * 11 + shipStartCol + 1)*3 + 1,((shipStartRow+1) * 11 + shipStartCol + 1)*3 + 2,
                                squares[shipStartRow * 10 + shipStartCol].toString());
                        boardWithShip.replace(((shipStartRow+2) * 11 + shipStartCol + 1)*3 + 1,((shipStartRow+2) * 11 + shipStartCol + 1)*3 + 2,
                                squares[(shipStartRow + 1) * 10 + shipStartCol].toString());
                        shipNum++;
                    }
                }
            } else {
                /*
                * The second scenario, where 6 ships are generated through inheritance, has a similar generation
                * logic as the 5 ship version.
                * */
                while (true) {
                    /*
                     * If the number of generated ships is greater than 6, stop. This is greater than 5 here
                     * because of the array indexing problem.
                     * */
                    if (shipNum > 5) {
                        break;
                    }
                    /*
                    * As the boats were made specific, it was stipulated that 0 was the large boat, 1 and 2
                    * were the medium boats and 3, 4 and 5 were the small boats.
                    * */
                    if (shipNum == 0) { //large ship
                        if (judgeShipDirection) { //horizontal
                            //Large boat crossing, starting point to be found within 10 x 8
                            shipStartRow = rand.nextInt(10);
                            shipStartCol = rand.nextInt(8);
                            combineNum1 = Arrays.asList(shipStartRow, shipStartCol);
                            combineNum2 = Arrays.asList(shipStartRow, shipStartCol + 1);
                            combineNum4 = Arrays.asList(shipStartRow, shipStartCol + 2);
                            //Determining overlap and deposit
                            if (!judgeNum.contains(combineNum1) && !judgeNum.contains(combineNum2) && !judgeNum.contains(combineNum4)) {
                                judgeNum.add(combineNum1);
                                judgeNum.add(combineNum2);
                                judgeNum.add(combineNum4);
                                break;
                            }
                        } else { //vertical
                            //Large ship vertical, starting point to be found within 8 x 10
                            shipStartRow = rand.nextInt(8);
                            shipStartCol = rand.nextInt(10);
                            combineNum1 = Arrays.asList(shipStartRow, shipStartCol);
                            combineNum3 = Arrays.asList(shipStartRow + 1, shipStartCol);
                            combineNum5 = Arrays.asList(shipStartRow + 2, shipStartCol);
                            //Determining overlap and deposit
                            if (!judgeNum.contains(combineNum1) && !judgeNum.contains(combineNum3) && !judgeNum.contains(combineNum5)) {
                                judgeNum.add(combineNum1);
                                judgeNum.add(combineNum3);
                                judgeNum.add(combineNum5);
                                break;
                            }
                        }
                    } else if (shipNum == 1 || shipNum == 2) { //medium ship
                        if (judgeShipDirection) { //horizontal
                            //Medium ship crossing, starting point to be found within 10 x 9
                            shipStartRow = rand.nextInt(10);
                            shipStartCol = rand.nextInt(9);
                            combineNum1 = Arrays.asList(shipStartRow, shipStartCol);
                            combineNum2 = Arrays.asList(shipStartRow, shipStartCol + 1);
                            //Determining overlap and deposit
                            if (!judgeNum.contains(combineNum1) && !judgeNum.contains(combineNum2)) {
                                judgeNum.add(combineNum1);
                                judgeNum.add(combineNum2);
                                break;
                            }
                        } else { //vertical
                            //Medium ship vertical, starting point to be found within 9 x 10
                            shipStartRow = rand.nextInt(9);
                            shipStartCol = rand.nextInt(10);
                            combineNum1 = Arrays.asList(shipStartRow, shipStartCol);
                            combineNum3 = Arrays.asList(shipStartRow + 1, shipStartCol);
                            //Determining overlap and deposit
                            if (!judgeNum.contains(combineNum1) && !judgeNum.contains(combineNum3)) {
                                judgeNum.add(combineNum1);
                                judgeNum.add(combineNum3);
                                break;
                            }
                        }
                    } else { //small ship
                        /*
                        * Since the boat is only 1 x 1, there is no need to consider the
                        * horizontal and vertical situation
                        * */
                        shipStartRow = rand.nextInt(10);
                        shipStartCol = rand.nextInt(10);
                        combineNum1 = Arrays.asList(shipStartRow, shipStartCol);
                        //Determining overlap and deposit
                        if (!judgeNum.contains(combineNum1)) {
                            judgeNum.add(combineNum1);
                            break;
                        }
                    }
                }
                    if (judgeShipDirection) { //horizontal
                        // Stopping conditions
                        if (shipNum > 5) {
                            break;
                        }

                        if (shipNum == 0) { //Large ship
                            //Using polymorphism to initialise and store ships
                            battleships[shipNum] = new LargeBattleship();
                            shipsLocation = new Integer[]{shipStartCol, shipStartRow, shipStartCol + 1, shipStartRow, shipStartCol + 2, shipStartRow};
//                            battleships[shipNum].setShipLocation(shipsLocation);

                            //Replace an old Square object with a new Square object
                            squares[shipStartRow * 10 + shipStartCol] = new Square(shipStartRow, shipStartCol,
                                    "*", "-", battleships[shipNum]);
                            squares[shipStartRow * 10 + shipStartCol + 1] = new Square(shipStartRow, shipStartCol + 1,
                                    "*", "-", battleships[shipNum]);
                            squares[shipStartRow * 10 + shipStartCol + 2] = new Square(shipStartRow, shipStartCol + 2,
                                    "*", "-", battleships[shipNum]);

                            //Replace the board used to keep Battleship
                            boardWithShip.replace(((shipStartRow + 1) * 11 + shipStartCol + 1) * 3 + 1, ((shipStartRow + 1) * 11 + shipStartCol + 1) * 3 + 2,
                                    squares[shipStartRow * 10 + shipStartCol].toString());
                            boardWithShip.replace(((shipStartRow + 1) * 11 + shipStartCol + 2) * 3 + 1, ((shipStartRow + 1) * 11 + shipStartCol + 2) * 3 + 2,
                                    squares[shipStartRow * 10 + shipStartCol + 1].toString());
                            boardWithShip.replace(((shipStartRow + 1) * 11 + shipStartCol + 3) * 3 + 1, ((shipStartRow + 1) * 11 + shipStartCol + 3) * 3 + 2,
                                    squares[shipStartRow * 10 + shipStartCol + 2].toString());

                        } else if (shipNum == 1 || shipNum == 2) { //Medium Ship
                            //Using polymorphism to initialise and store ships
                            battleships[shipNum] = new MediumBattleship();
                            shipsLocation = new Integer[]{shipStartCol, shipStartRow, shipStartCol + 1, shipStartRow};
//                            battleships[shipNum].setShipLocation(shipsLocation);

                            //Replace an old Square object with a new Square object
                            squares[shipStartRow * 10 + shipStartCol] = new Square(shipStartRow, shipStartCol,
                                    "*", "-", battleships[shipNum]);
                            squares[shipStartRow * 10 + shipStartCol + 1] = new Square(shipStartRow, shipStartCol + 1,
                                    "*", "-", battleships[shipNum]);

                            //Replace the board used to keep Battleship
                            boardWithShip.replace(((shipStartRow + 1) * 11 + shipStartCol + 1) * 3 + 1, ((shipStartRow + 1) * 11 + shipStartCol + 1) * 3 + 2,
                                    squares[shipStartRow * 10 + shipStartCol].toString());
                            boardWithShip.replace(((shipStartRow + 1) * 11 + shipStartCol + 2) * 3 + 1, ((shipStartRow + 1) * 11 + shipStartCol + 2) * 3 + 2,
                                    squares[shipStartRow * 10 + shipStartCol + 1].toString());

                            } else { //Small Ship
                            //Using polymorphism to initialise and store ships
                            battleships[shipNum] = new SmallBattleship();
                            shipsLocation = new Integer[]{shipStartCol, shipStartRow};
//                            battleships[shipNum].setShipLocation(shipsLocation);

                            //Replace an old Square object with a new Square object
                            squares[shipStartRow * 10 + shipStartCol] = new Square(shipStartRow, shipStartCol,
                                    "*", "-", battleships[shipNum]);

                            //Replace the board used to keep Battleship
                            boardWithShip.replace(((shipStartRow + 1) * 11 + shipStartCol + 1) * 3 + 1, ((shipStartRow + 1) * 11 + shipStartCol + 1) * 3 + 2,
                                    squares[shipStartRow * 10 + shipStartCol].toString());

                            }


                    } else { //vertical
                        //Stopping conditions
                            if (shipNum > 5) {
                                break;
                            }

                            if (shipNum == 0) { //Large ship
                                //Using polymorphism to initialise and store ships
                                battleships[shipNum] = new LargeBattleship();
                                shipsLocation = new Integer[]{shipStartCol, shipStartRow, shipStartCol, shipStartRow + 1, shipStartCol, shipStartRow + 2};
//                                battleships[shipNum].setShipLocation(shipsLocation);

                                //Replace an old Square object with a new Square object
                                squares[shipStartRow * 10 + shipStartCol] = new Square(shipStartRow, shipStartCol,
                                        "*", "-", battleships[shipNum]);
                                squares[(shipStartRow + 1) * 10 + shipStartCol] = new Square(shipStartRow + 1, shipStartCol,
                                        "*", "-", battleships[shipNum]);
                                squares[(shipStartRow + 2) * 10 + shipStartCol] = new Square(shipStartRow + 2, shipStartCol,
                                        "*", "-", battleships[shipNum]);

                                //Replace the board used to keep Battleship
                                boardWithShip.replace(((shipStartRow + 1) * 11 + shipStartCol + 1) * 3 + 1, ((shipStartRow + 1) * 11 + shipStartCol + 1) * 3 + 2,
                                        squares[shipStartRow * 10 + shipStartCol].toString());
                                boardWithShip.replace(((shipStartRow + 2) * 11 + shipStartCol + 1) * 3 + 1, ((shipStartRow + 2) * 11 + shipStartCol + 1) * 3 + 2,
                                        squares[(shipStartRow + 1) * 10 + shipStartCol].toString());
                                boardWithShip.replace(((shipStartRow + 3) * 11 + shipStartCol + 1) * 3 + 1, ((shipStartRow + 3) * 11 + shipStartCol + 1) * 3 + 2,
                                        squares[(shipStartRow + 1) * 10 + shipStartCol].toString());

                            } else if (shipNum == 1 || shipNum == 2) {  //Medium ship
                                //Using polymorphism to initialise and store ships
                                battleships[shipNum] = new MediumBattleship();
                                shipsLocation = new Integer[]{shipStartCol, shipStartRow, shipStartCol, shipStartRow + 1};
//                                battleships[shipNum].setShipLocation(shipsLocation);

                                //Replace an old Square object with a new Square object
                                squares[shipStartRow * 10 + shipStartCol] = new Square(shipStartRow, shipStartCol,
                                        "*", "-", battleships[shipNum]);
                                squares[(shipStartRow + 1) * 10 + shipStartCol] = new Square(shipStartRow + 1, shipStartCol,
                                        "*", "-", battleships[shipNum]);

                                //Replace the board used to keep Battleship
                                boardWithShip.replace(((shipStartRow + 1) * 11 + shipStartCol + 1) * 3 + 1, ((shipStartRow + 1) * 11 + shipStartCol + 1) * 3 + 2,
                                        squares[shipStartRow * 10 + shipStartCol].toString());
                                boardWithShip.replace(((shipStartRow + 2) * 11 + shipStartCol + 1) * 3 + 1, ((shipStartRow + 2) * 11 + shipStartCol + 1) * 3 + 2,
                                        squares[(shipStartRow + 1) * 10 + shipStartCol].toString());

                            } else { //Small Ship
                                //Using polymorphism to initialise and store ships
                                battleships[shipNum] = new SmallBattleship();
                                shipsLocation = new Integer[]{shipStartCol, shipStartRow};
//                                battleships[shipNum].setShipLocation(shipsLocation);

                                //Replace an old Square object with a new Square object
                                squares[shipStartRow * 10 + shipStartCol] = new Square(shipStartRow, shipStartCol,
                                        "*", "-", battleships[shipNum]);

                                //Replace the board used to keep Battleship
                                boardWithShip.replace(((shipStartRow + 1) * 11 + shipStartCol + 1) * 3 + 1, ((shipStartRow + 1) * 11 + shipStartCol + 1) * 3 + 2,
                                        squares[shipStartRow * 10 + shipStartCol].toString());

                            }

                        }
                    shipNum++;
                    }
                }
//        System.out.println(judgeNum);
            }

    /*
    * This method is used to modify the display of hits to the board. The input requires two types of board,
    * one that holds the ships and one that specifically displays the hits.
    * */
    public static String changeHitBoard(int row, int col, Board hitBoard, Board enemyShipBoard) {
        /*
        * Modifies Square to x if it exists as a vessel, otherwise modifier is o
        * */
        if (enemyShipBoard.squares[row * 10 + col].getOwnShipSituation().equals("*")) {
            hitBoard.squares[row * 10 + col].setSquarePlayerHitSituation("x");
        } else {
            hitBoard.squares[row * 10 + col].setSquarePlayerHitSituation("o");
        }
        hitBoard.initializeBoard.replace(((row+1) * 11 + col + 1)*3 + 1,((row+1) * 11 + col + 1)*3 + 2,
                hitBoard.squares[row * 10 + col].toString());
        return hitBoard.toString();
//        System.out.println(enemyShipBoard.squares[26].getBattleship());

    }

    /*
    * This method is used to find a ship that has been hit, and returns the ship's
    * number if it hits, or -1 if it misses
    * */
    public Integer changeShipBoard(int row, int col, Board hitBoard, Board enemyShipBoard) { //船只情况
        int shipNum = 0;
        Battleship battleship = new Battleship();


        if (enemyShipBoard.squares[row * 10 + col].getOwnShipSituation().equals("*")) {
            enemyShipBoard.squares[row * 10 + col].setSquarePlayerHitSituation("x");
            enemyShipBoard.boardWithShip.replace(((row+1) * 11 + col + 1)*3 + 1,((row+1) * 11 + col + 1)*3 + 2,
                    hitBoard.squares[row * 10 + col].toString());
            //Get the ship object of the Square
            battleship = enemyShipBoard.squares[row * 10 + col].getBattleship();
            for (int i = 0; i < 6; i++) { //Get the index of the corresponding ship
                if(battleships[i] == battleship) {
                    shipNum = i;
                }
            }

            //Modification of blood and sinking of ships
            battleships[shipNum].setRestHP(battleships[shipNum].getRestHP() - 1);
            if (battleships[shipNum].getRestHP() == 0) {
                battleships[shipNum].setSink(true);
            }
//            System.out.println(battleship);
        } else {
            enemyShipBoard.squares[row * 10 + col].setSquarePlayerHitSituation("o");
            enemyShipBoard.boardWithShip.replace(((row+1) * 11 + col + 1)*3 + 1,((row+1) * 11 + col + 1)*3 + 2,
                    enemyShipBoard.squares[row * 10 + col].toString());
        }
        //If the battleship class is not empty, return the ship index. Otherwise return -1.
        if (battleship.getShipSize() != null){
//            return shipNum + "," + Arrays.toString(battleships) + "," + enemyShipBoard.toString1();
            return shipNum;
        } else {
            return -1;
        }


//        System.out.println(enemyShipBoard.squares[26].getBattleship());

    }

    //Expose the Battleship interface to the outside.
    public Battleship[] getBattleships() {
        return battleships;
    }

    public Integer getBattleshipNumber() {
        int n = 0;
        for (Battleship b : battleships) {
            if (b != null) {
                n++;
            }
        }
        return n;
    }

    @Override
    public String toString() {
        return "Board{" +
                "hitBoard=" + "\n" + initializeBoard + "\n" +
                '}';
    }

    public String toString1() {
        return "Board{" +
                "boardWithShip=" + "\n" + boardWithShip + "\n" +
                '}';
    }

}
