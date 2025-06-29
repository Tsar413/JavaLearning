package com.company.javaRelearn.UofG;

import java.util.Random;
import java.util.Scanner;

public class Lab6Ex3 {
    public static void judgeNumber(int rangNumber){
        for(int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            int guessNumber = scanner.nextInt();

            if(guessNumber == rangNumber) {
                System.out.println("Correct");
                break;
            } else if(guessNumber > rangNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int randNumber = rand.nextInt(100);

        judgeNumber(randNumber);
    }
}
