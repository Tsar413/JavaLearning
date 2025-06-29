package com.company.javaRelearn.AlgorithmsDataStructuresAE1;

// Add name and id as comment
// Name: Yinlong Li, ID: 2754249L
// and import statements
import java.util.*;

public class Atom  {

    private String element;
    private List<Bond> bonds = new ArrayList<Bond>();//the bonds to child atoms
    private int valency;


    //this map has been included to help you look up valencies
    //but you can ignore it (and delete it) if you want to use something else

    private static final Map<String, Integer> VALENCY_MAP = createMap();

    private static Map<String, Integer> createMap() {
        Map<String, Integer> result = new HashMap<>();
        result.put("H", 1);// hydrogen
        result.put("C", 4);// carbon
        result.put("B", 3);// boron
        result.put("N", 3);// nitrogen
        result.put("O", 2);// oxygen
        result.put("Fl", 1);// fluorine
        result.put("P", 3);// phosphorous
        result.put("S", 2);// sulphur
        result.put("Cl", 1);// fluorine
        result.put("Br", 1);// bromine

        return Collections.unmodifiableMap(result);
    }

    //now add all of the Atom constructors and methods you require

    // By default the call to the Atom constructor only adds hydrogen atoms to it,
    // and queries and sets the valency according to VALENCY_MAP.
    public Atom() {
        this.element = "H";
        this.valency = VALENCY_MAP.get(element);
    }

    // If a new element is detected in the constructor, a new atom is formed,
    // the number of H atoms to be added is queried according to VALENCY_MAP
    // and a matching number of Bonds containing the default constructor is added
    public Atom(String type) {
        this.element = type;
        this.valency = VALENCY_MAP.get(type);
        for (int i = 0; i < this.valency; i++) {
            bonds.add(new Bond(new Atom(),1));
        }
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public List<Bond> getBonds() {
        return bonds;
    }

    public void setBonds(List<Bond> bonds) {
        this.bonds = bonds;
    }

    public int getValency() {
        return valency;
    }

    public void setValency(int valency) {
        this.valency = valency;
    }

    public static Map<String, Integer> getValencyMap() {
        return VALENCY_MAP;
    }

    @Override
    public String toString() {
//        String result = "";
//        for (int i = 0; i < bonds.size(); i++) {
//
//        }
        return element;
    }
}
