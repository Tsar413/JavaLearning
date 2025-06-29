package com.company.javaRelearn.UofG;

import java.util.Random;
import java.util.Scanner;

public class Lab6Ex7 {
    public static void judgeGame() {
        /*
        * 规定0是拳头，1是剪刀，2是布，
        * */
        int playerFlag = 0;
        int environmentFlag = 0;
        while (true){
            System.out.println("0 is Stone, 1 is Scissors, 2 is Paper");
            Scanner scanner = new Scanner(System.in);
            int player = scanner.nextInt();
            Random rand = new Random();
            int environment = rand.nextInt(2);

            if(player == 0) {
                if(environment == 0) {
                    System.out.println("Tie");
                } else if(environment == 1) {
                    System.out.println("Player Win");
                    playerFlag++;
                } else {
                    System.out.println("Player Lose");
                    environmentFlag++;
                }
            } else if(player == 1) {
                if(environment == 0) {
                    System.out.println("Player Lose");
                    environmentFlag++;
                } else if(environment == 1) {
                    System.out.println("Tie");
                } else {
                    System.out.println("Player Win");
                    playerFlag++;
                }
            } else {
                if(environment == 0) {
                    System.out.println("Player Win");
                    playerFlag++;
                } else if(environment == 1) {
                    System.out.println("Player Lose");
                    environmentFlag++;
                } else {
                    System.out.println("Tie");
                }
            }
            if(playerFlag == 3 || environmentFlag == 3) {
                if(playerFlag == 3) {
                    System.out.println("Player final Win");
                } else {
                    System.out.println("Player final Lose");
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        judgeGame();

    }
}
