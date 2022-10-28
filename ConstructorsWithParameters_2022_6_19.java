package com.company.javaRelearn;

class Game {
    Game(int i) {
        System.out.println("Game Constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("Board Game Constructor");
    }
}

public class ConstructorsWithParameters_2022_6_19 extends BoardGame {
    public ConstructorsWithParameters_2022_6_19() {
        super(11);
        System.out.println("Constructors With Parameters_2022_6_19");
    }

    public static void main(String[] args) {
        ConstructorsWithParameters_2022_6_19 constructors = new ConstructorsWithParameters_2022_6_19();
    }
}
