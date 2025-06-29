package com.company.javaRelearn.NIIT3.WeekClass4;

interface Game{
    String getName();
    double getPrice();
}

interface GameType extends Game{
    String getType();
}

class GameDetail implements GameType{
    private String name;
    private double price;
    private String type;

    public GameDetail() {
    }

    public GameDetail(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

public class GameStarter {
    public static void main(String[] args) {
        GameDetail game1 = new GameDetail("aa", 10.0, "b");
        System.out.println(game1.getName() + " " + game1.getPrice() + " " + game1.getType());
    }
}
