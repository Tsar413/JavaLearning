package com.company.javaRelearn.AlgorithmsDataStructuresAE1;

//add name and id as comment
// Name: Yinlong Li, ID: 2754249L
//add import statements

//a bond is a pair (Atom, weight)
public class Bond {

    private Atom child;
    private int weight;

    //add constructor, getters setters
    //and any other methods you require (if any)

    public Bond() { }

    public Bond(Atom child) {
        this.child = child;
    }

    public Bond(Atom child, int weight) {
        this.child = child;
        this.weight = weight;
    }

    public Atom getChild() {
        return child;
    }

    public void setChild(Atom child) {
        this.child = child;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return child.toString();
    }
}