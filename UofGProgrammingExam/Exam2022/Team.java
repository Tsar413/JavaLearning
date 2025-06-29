package com.company.javaRelearn.UofGProgrammingExam.Exam2022;

public class Team {
    private String name;
    private int numGold;
    private int numSilver;
    private int numBronze;

    public Team() {
    }

    public Team(String name, int numGold, int numSilver, int numBronze) {
        this.name = name;
        this.numGold = numGold;
        this.numSilver = numSilver;
        this.numBronze = numBronze;
    }

    public Team(String name) { //1.a.i
        this.name = name;
        this.numGold = 0;
        this.numSilver = 0;
        this.numBronze = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumGold() {
        return numGold;
    }

    public void setNumGold(int numGold) {
        this.numGold = numGold;
    }

    public int getNumSilver() {
        return numSilver;
    }

    public void setNumSilver(int numSilver) {
        this.numSilver = numSilver;
    }

    public int getNumBronze() {
        return numBronze;
    }

    public void setNumBronze(int numBronze) {
        this.numBronze = numBronze;
    }

    public void setNumGold() {
        this.numGold += 1;
    }

    public void setNumSilver() {
        this.numSilver += 1;
    }

    public void setNumBronze() {
        this.numBronze += 1;
    }

    @Override
    public String toString() {
        String result = String.format("%-15s|%5s|%5s|%5s",name,numGold,numSilver,numBronze);
        return result;
    }
}
