package com.company.javaRelearn.NIIT3.Week4;

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
    Game game1 = new GameDetail("黑神话:悟空", 268.0, "ARPG");
    Game gam2 = new GameDetail("米塔", 52.0, "恐怖冒险游戏");
}
