package com.company.javaRelearn;

class Actor {
    void act() {}
}

class HappyActor extends Actor {
    void act() {
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor {
    void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    void changeActor() {
        actor = new SadActor();
    }
    void performPlay() {
        actor.act();
    }
}

public class Transmogrify_2022_6_27 {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.changeActor();
        stage.performPlay();
    }
}
