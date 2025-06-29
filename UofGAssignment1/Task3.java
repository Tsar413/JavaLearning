package com.company.javaRelearn.UofGAssignment1;


import java.util.Scanner;

public class Task3 {
    public static void task3(int challenge) {
        //The core condition is who goes to zero first
        int playerHitPoint = 3; //Player's HP, Variables are global variables
        int monsterHitPoint = 3; //Monster's HP, Variables are global variables
        /*
        * This variation is used to control the hit of the monster,
        * when the monster hits for the first time, it will fail
        * and all subsequent ones will always succeed. The number
        * increases with the number of monster attacks.
        * */
        int monsterHitPlayerFlag = 0;
        /*
        * The purpose of this global variable is to determine the user's
        * input value and to ensure that there are no variable usage problems
        * caused by exception handling mechanisms.
        * */
        int playerRollPoint = 0;

        while (true) {
            System.out.println("Please enter a number between 1 and 20.");
            Scanner scanner = new Scanner(System.in);
            String playerRollTemp = scanner.nextLine();
            /*
             * The purpose of using the nextLine method with data type
             * conversion is to prevent the problem of newline symbols
             * due to the use of nextInt.
             * */
            playerRollPoint = Integer.parseInt(playerRollTemp);

            /*
            * When the player's value is greater than the challenge value,
            * the attack succeeds and the player's control parameter is -1
            * */
            if(playerRollPoint > challenge) {
                System.out.println("Hit Success");
                playerHitPoint--;
            } else if(playerHitPoint <= challenge && monsterHitPlayerFlag == 0) {
                /*
                * When the value entered by the player is less than or equal to
                * the challenge value, the attack fails, and on the first
                * failure, the monster's attack is not possible, so the global
                * control variable does not change, but the monster's attack
                * round variable is +1 and generates a valid attack on the
                * next attack.
                * */
                System.out.println("Monster Misses");
                monsterHitPlayerFlag++;
            } else {
                /*
                * Attack successful, monster's control variable -1
                * */
                System.out.println("Hit Fail");
                monsterHitPoint--;
                monsterHitPlayerFlag++;
            }
            //When either side succeeds in getting to 0,
            //the game ends and victory is counted.
            if(playerHitPoint == 0 || monsterHitPoint == 0) {
                System.out.println("Game End");
                if(playerHitPoint == 0) {
                    System.out.println("Player Win");
                    break;
                } else {
                    System.out.println("Player Fail");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 3: Player Game");
        task3(10); //Passing the challenge value
    }
}
