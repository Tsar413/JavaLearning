package com.company.javaRelearn.AdvancedProgrammingLab.Lab2;

public class Dog extends Pet {
    private String breed;
    private String furColour;
    private String favouriteToy;

    public Dog(String n, int a, String breed, String furColour, String favouriteToy) {
        super(n, a);
        this.breed = breed;
        this.furColour = furColour;
        this.favouriteToy = favouriteToy;
    }

    public Dog(String name, String breed, String furColour, String favouriteToy) {
        super(name);
        this.breed = breed;
        this.furColour = furColour;
        this.favouriteToy = favouriteToy;
    }

    public void provideBone() {
        System.out.println(getName() +  " says thanks for the bone!");
    }

    @Override
    public String toString() {
        return getName() + " is a " + furColour + " " + breed + " and enjoys " +
                "playing with " + favouriteToy + " every day";

    }
}
