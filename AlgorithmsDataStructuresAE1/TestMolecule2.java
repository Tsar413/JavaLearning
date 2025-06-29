package com.company.javaRelearn.AlgorithmsDataStructuresAE1;

import java.util.ArrayList;

public class TestMolecule2 {
    //helper methods//
    //create an arraylist of atoms of the appropriate type
    public static  ArrayList<Atom> atomList(int len, String type){
        ArrayList<Atom> theAtoms = new ArrayList<Atom>();
        for(int i=0;i<len;i++) theAtoms.add(new Atom(type));//supply of atoms of the specified type
        return theAtoms;

    }

    //reset all of the atoms so that they are new atoms
    public static void resetAtoms(ArrayList<Atom> carbonAtoms, ArrayList<Atom> oxygenAtoms, ArrayList<Atom> nitrogenAtoms,  ArrayList<Atom> sulphurAtoms) {
        carbonAtoms.clear();
        for(int i=0;i<10;i++) carbonAtoms.add(new Atom("C"));//supply of carbon atoms
        oxygenAtoms.clear();
        for(int i=0;i<10;i++) oxygenAtoms.add(new Atom("O"));//supply of oxygen atoms
        nitrogenAtoms.clear();
        for(int i=0;i<10;i++) nitrogenAtoms.add(new Atom("N"));//supply of nitrogen atoms
        sulphurAtoms.clear();
        for(int i=0;i<10;i++) sulphurAtoms.add(new Atom("S"));//supply of oxygen atoms
    }

    //these are so that I have some stored, nothing to do with the actual implementation
    public static Molecule createMolecule(String name, ArrayList<Atom> carbonAtoms, ArrayList<Atom> oxygenAtoms, ArrayList<Atom> nitrogenAtoms,
                                          ArrayList<Atom> sulphurAtoms) {


        Molecule mol = new TreeMolecule(carbonAtoms.get(0));//all molecules contain an initial carbon atom

        if(name.equals("methane")) return mol;
        if(name.equals("ethane")) {
            mol.addBond(carbonAtoms.get(0), carbonAtoms.get(1), 1);
            return mol;
        }

        if(name.equals("ethene")) {
            mol.addBond(carbonAtoms.get(0), carbonAtoms.get(1), 2);
            return mol;
        }

        if(name.equals("ethyne")) {
            mol.addBond(carbonAtoms.get(0), carbonAtoms.get(1), 3);
            return mol;
        }

        if(name.equals("dimethyl ether")) {
            mol.addBond(carbonAtoms.get(0), oxygenAtoms.get(0), 1);
            mol.addBond(oxygenAtoms.get(0), carbonAtoms.get(1), 1);

            return mol;
        }

        if(name.equals("ethanol")) {
            mol.addBond(carbonAtoms.get(0), carbonAtoms.get(1), 1);
            mol.addBond(carbonAtoms.get(1), oxygenAtoms.get(0), 1);

            return mol;
        }

        if(name.equals("acetaldehyde")) {
            mol.addBond(carbonAtoms.get(0), carbonAtoms.get(1), 1);
            mol.addBond(carbonAtoms.get(1), oxygenAtoms.get(0), 2);

            return mol;
        }

        if(name.equals("hydrogen cyanide")) {
            mol.addBond(carbonAtoms.get(0), nitrogenAtoms.get(0), 3);
            return mol;
        }

        if(name.equals("isobutyl alcohol")) {
            mol.addBond(carbonAtoms.get(0), carbonAtoms.get(1), 1);
            mol.addBond(carbonAtoms.get(1), carbonAtoms.get(2), 1);
            mol.addBond(carbonAtoms.get(1), carbonAtoms.get(3), 1);
            mol.addBond(carbonAtoms.get(3), oxygenAtoms.get(0), 1);

            return mol;
        }

        if(name.equals("5-amino-4-methylpentanamide")) {
            mol.addBond(carbonAtoms.get(0), carbonAtoms.get(1), 1);
            mol.addBond(carbonAtoms.get(1), carbonAtoms.get(2), 1);
            mol.addBond(carbonAtoms.get(2), carbonAtoms.get(3), 1);
            mol.addBond(carbonAtoms.get(3), carbonAtoms.get(4), 1);

            mol.addBond(carbonAtoms.get(4), oxygenAtoms.get(0), 2);
            mol.addBond(carbonAtoms.get(4), nitrogenAtoms.get(0), 1);
            mol.addBond(carbonAtoms.get(1), carbonAtoms.get(5), 1);
            mol.addBond(carbonAtoms.get(5), nitrogenAtoms.get(1), 1);

            return mol;
        }

        if(name.equals("test-molecule1")) {
            mol.addBond(carbonAtoms.get(0), nitrogenAtoms.get(0), 1);

            mol.addBond(carbonAtoms.get(0), sulphurAtoms.get(0), 1);

            mol.addBond(sulphurAtoms.get(0), carbonAtoms.get(1), 1);

            mol.addBond(carbonAtoms.get(1), carbonAtoms.get(2), 1);

            mol.addBond(carbonAtoms.get(2), carbonAtoms.get(3), 1);

            mol.addBond(carbonAtoms.get(1), oxygenAtoms.get(0), 2);

            return mol;






        }

        if(name.equals("test-molecule2")) {
            mol.addBond(carbonAtoms.get(0), carbonAtoms.get(1), 3);

            mol.addBond(carbonAtoms.get(1), carbonAtoms.get(2), 1);

            mol.addBond(carbonAtoms.get(2), oxygenAtoms.get(0), 2);

            mol.addBond(carbonAtoms.get(2), carbonAtoms.get(3), 1);

            mol.addBond(carbonAtoms.get(3), nitrogenAtoms.get(0), 1);

            return mol;






        }

        return null;

    }

    //choose a molecule, build it and output strings
    public static void main(String[] args) {
        //create a supply of atoms - amend as necessary
        ArrayList<Atom> carbonAtoms = new ArrayList<Atom>();//supply of carbon atoms
        ArrayList<Atom> oxygenAtoms = new ArrayList<Atom>();//supply of oxygen atoms
        ArrayList<Atom> nitrogenAtoms = new ArrayList<Atom>();//supply of nitrogen atoms
        ArrayList<Atom> sulphurAtoms = new ArrayList<Atom>();//supply of sulphur atoms

        resetAtoms(carbonAtoms, oxygenAtoms, nitrogenAtoms, sulphurAtoms);



        String name0 = "acetaldehyde";
        Molecule mol0 = createMolecule(name0, carbonAtoms, oxygenAtoms, nitrogenAtoms, sulphurAtoms);
        System.out.println(name0 + " has smiles string " + mol0.smilesString());
        System.out.println(name0 + " has structure " + mol0.structuralFormula());
        System.out.println("molecule contains C(1) atom is " + mol0.contains(carbonAtoms.get(1)));
        System.out.println("molecule contains C(2) atom is " + mol0.contains(carbonAtoms.get(2)));
        System.out.println("molecule contains S(0) atom is " + mol0.contains(sulphurAtoms.get(0)));

        System.out.println();
        //reset the atoms

        resetAtoms(carbonAtoms, oxygenAtoms, nitrogenAtoms, sulphurAtoms);
        String name1 = "test-molecule1";
        Molecule mol1 = createMolecule(name1, carbonAtoms, oxygenAtoms, nitrogenAtoms, sulphurAtoms);
        System.out.println(name1 + " has smiles string " + mol1.smilesString());
        System.out.println(name1 + " has structure " + mol1.structuralFormula());
        System.out.println("molecule contains C(1) atom is " + mol1.contains(carbonAtoms.get(1)));
        System.out.println("molecule contains C(2) atom is " + mol1.contains(carbonAtoms.get(2)));
        System.out.println("molecule contains S(0) atom is " + mol1.contains(sulphurAtoms.get(0)));


        System.out.println();
        //reset the atoms

        resetAtoms(carbonAtoms, oxygenAtoms, nitrogenAtoms, sulphurAtoms);
        String name2 = "test-molecule2";
        Molecule mol2 = createMolecule(name2, carbonAtoms, oxygenAtoms, nitrogenAtoms, sulphurAtoms);
        System.out.println(name2 + " has smiles string " + mol2.smilesString());
        System.out.println(name2 + " has structure " + mol2.structuralFormula());
        System.out.println("molecule contains C(1) atom is " + mol2.contains(carbonAtoms.get(1)));
        System.out.println("molecule contains C(2) atom is " + mol2.contains(carbonAtoms.get(2)));
        System.out.println("molecule contains S(0) atom is " + mol2.contains(sulphurAtoms.get(0)));



    }
}
