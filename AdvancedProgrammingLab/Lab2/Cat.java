package com.company.javaRelearn.AdvancedProgrammingLab.Lab2;

public class Cat extends Pet {
    private String breed;
    private String furColour;
    private String favouriteSpot;

    public Cat(String n, int a, String breed, String furColour, String favouriteSpot) {
        super(n, a);
        this.breed = breed;
        this.furColour = furColour;
        this.favouriteSpot = favouriteSpot;
    }

    public Cat(String name, String breed, String furColour, String favouriteSpot) {
        super(name);
        this.breed = breed;
        this.furColour = furColour;
        this.favouriteSpot = favouriteSpot;
    }

    @Override
    public String toString() {
        return getName() + " is a " + furColour + " " + breed + " and enjoys " +
                "playing at " + favouriteSpot + " every day";

    }
}
