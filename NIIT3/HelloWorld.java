package com.company.javaRelearn.NIIT3;

import java.util.Scanner;

public class HelloWorld {
    private int score;

    public HelloWorld() {
    }

    public HelloWorld(int score) {
        this.score = score;
    }

    public void writeScore(){
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
    }

    public int getScore(int score1){
        System.out.println(score);
        score += score1;
        return score;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        HelloWorld helloWorld = new HelloWorld();
        HelloWorld helloWorld2 = new HelloWorld(5);
        helloWorld.writeScore();
        System.out.println(helloWorld.getScore(2));
    }
}


