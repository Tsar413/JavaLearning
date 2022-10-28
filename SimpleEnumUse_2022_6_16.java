package com.company.javaRelearn;

enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}

class Burrito {
    Spiciness degree;
    Burrito(Spiciness degree) {
        this.degree = degree;
    }
    void printDegree() {
        System.out.print("Burrito's degree is: ");
        switch (degree) {
            case NOT -> System.out.println("not spicy at all");
            case MEDIUM -> System.out.println("a little hot");
        }
    }
}

public class SimpleEnumUse_2022_6_16 {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot); //使用enum
        for(Spiciness s : Spiciness.values()) {
            System.out.println(s + " " + s.ordinal());
            //循环输出enum的值，并根据相关的顺序进行输出
        }
        Burrito
                plain = new Burrito(Spiciness.NOT),
                greenChile = new Burrito(Spiciness.MEDIUM);
        plain.printDegree();
        greenChile.printDegree();
    }
}
