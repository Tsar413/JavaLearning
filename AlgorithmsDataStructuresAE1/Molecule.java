package com.company.javaRelearn.AlgorithmsDataStructuresAE1;

//this is the interface - do not edit this in any way!!
//you will not submit this file


public interface Molecule {

    public boolean addBond(Atom a1, Atom a2, int strength);
    // add bond between a1 and a2, provided atoms already exist and a1 is in the molecule already


    public boolean contains(Atom a);
    //return true if molecule contains atom a


    public String smilesString();
    // output the smiles string for this molecule
    // (i.e. a string without the H atoms)

    public String structuralFormula();
    // output a string for this molecule
    // (i.e. a string including the H atoms)


}
