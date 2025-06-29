package com.company.javaRelearn.AlgorithmsDataStructuresAE1;

//add name and id as comment
// Name: Yinlong Li, ID: 2754249L
//add import statement


public class TreeMolecule implements Molecule {

    private Atom first;

    //add constructor, implemented methods and any helper methods you require

    public TreeMolecule(Atom atom) {
        this.first = atom;
    }

    // This method adds a bond between two atoms with a given strength
    @Override
    public boolean addBond(Atom a1, Atom a2, int strength) {
        // First you need to determine if the atom a1 is already
        // contained in first, if not then the add step is not performed.
        if (!containHelper(first, a1)) {
            return false;
        }
        // Creates a new bond object with the second atom and given strength.
        // This bond needs to be added later to a1
        Bond bond1 = new Bond(a2,strength);
        // Initializes some variables used later
        // index refers to the number of atoms that have been deleted.
        // availableLocation refers to the number of bonds that can be deleted
        int index1 = 0;
        int index2 = 0;
        int availableLocation1 = 0;
        int availableLocation2 = 0;

        // Loops through the bonds of the first atom
        for (int i = 0; i < a1.getBonds().size(); i++) {
            // If the nodes in the list where bond is stored in a1 contain hydrogen atoms,
            // increment availableLocation1
            if (a1.getBonds().get(i).getChild().getElement().equals("H")) {
                availableLocation1++;
            }
        }
        // Loops through the bonds of the second atom
        for (int i = 0; i < a2.getBonds().size(); i++) {
            // If the nodes in the list where bond is stored in a2 contain hydrogen atoms,
            // increment availableLocation2
            if (a2.getBonds().get(i).getChild().getElement().equals("H")) {
                availableLocation2++;
            }
        }
        // If either of the two atom vacancies are found to be insufficient for actual
        // storage, the addition is rejected.
        if ((strength > availableLocation1) || (strength > availableLocation2)) {
            return false;
        }

        // Removes bonds from the first atom until there are enough available locations for the new bond
        // Get the size of bond that a1 can store.
        int temp1 = a1.getBonds().size();
        // judge refers to the position of the Bond where the hydrogen atom is located
        int judge1 = 0;
        // List of Bond stored in the first atom of the loop
        for (int i = 0; i < temp1; i++) {
            // Deletes the bond containing the hydrogen atom at the specified position.
            // Deletion requires confirmation that the bond contains hydrogen atoms and, in addition,
            // that there are sufficient positions for the deletion. index is in fact the guarantee of
            // sufficient positions. After a successful deletion of a bond, index+1.
            if (a1.getBonds().get(judge1).getChild().getElement().equals("H") && (index1 < strength)) {
                a1.getBonds().remove(judge1);
                index1++;
            } else if (!a1.getBonds().get(judge1).getChild().getElement().equals("H")) {
                judge1++;
            }
        }

        // Removes bonds from the second atom until there are enough available locations for the new bond
        // Process is similar to a1
        int temp2 = a2.getBonds().size();
        int judge2 = 0;
        for (int i = 0; i < temp2; i++) {
            if (a2.getBonds().get(judge2).getChild().getElement().equals("H") && (index2 < strength)) {
                a2.getBonds().remove(judge2);
                index2++;
            } else if (!a2.getBonds().get(judge2).getChild().getElement().equals("H")) {
                judge2++;
            }
        }
        //Add a new Bond to the first atom
        a1.getBonds().add(bond1);
        return true;
    }

    // Output contain result
    @Override
    public boolean contains(Atom a) {
        return containHelper(first, a);
    }

    // Output SMILE result
    @Override
    public String smilesString() {
        String result = "";
        result = smileHelper(first, result);
        return result;
    }

    // Output structural result
    @Override
    public String structuralFormula() {
        String result = "";
        result = structuralHelper(first, result);
        return result;
    }

    // This method checks whether the atom "a" is included in the atom to be looked up
    public boolean containHelper(Atom data, Atom a) {
        boolean result = false;
        // Check if the current Atom object is equal to the given Atom object.
        if (data.equals(a)) {
            return true;
        }
        // Iterate through all of the Atom's child objects (obtained through its bonds),
        // checks if the atam in bond contains the atam being checked for presence.
        for (int i = 0; i < data.getBonds().size(); i++) {
            // If the specified Atom object is found as a child of this Atom object,
            // set the result variable to true and exit the loop.
            if (data.getBonds().get(i).getChild().equals(a)) {
                result = true;
                break;
            } else {
                // If the specified Atom object is not found as a direct child of this Atom object,
                // Then go directly to the bond of the atam, pass the atam in the bond to the Helper,
                // and recursively call the Helper method to check it.
                result = containHelper(data.getBonds().get(i).getChild(), a);
                // If the specified Atom is found as a child of one of the child Atom objects,
                // set the result variable to true and exit the loop.
                if (result) {
                    break;
                }
            }
        }
        // Return the result of whether the specified Atom object was found within this Atom object
        // or any of its child objects.
        return result;
    }

    // This method takes an Atom object and a String as input and returns a SMILES string representation
    // of the Atom and its child objects through recursive calls.
    public String smileHelper(Atom data, String result) {
        // If the current Atom object's element is not "H", append its element to the result string.
        if (!data.getElement().equals("H")) {
            result += data.getElement();
        }
        // temp refers to the number of subtrees that are non-hydrogen atoms,
        // and the brackets are added or subtracted according to the value of temp.
        int temp = 0;
        // Iterate through all of the Atom's bonds to count the number of non-H child atoms.
        for (int i = 0; i < data.getBonds().size(); i++) {
            if (!data.getBonds().get(i).getChild().getElement().equals("H")) {
                temp ++;
            }
        }
        // The loop iterates through all the bonds in the atam and adds the non-hydrogen atoms
        // in the bond, outside of the measurement, and if non-hydrogen atoms are present,
        // it does a direct recursion to add the non-hydrogen atom's sub-atom.
        for (int i = 0; i < data.getBonds().size(); i++) {
            // If the child Atom is not "H", add it to the result string.
            if (!data.getBonds().get(i).getChild().getElement().equals("H")) {
                // If there is more than one non-H child Atom, append "(".
                if (temp > 1) {
                    result += "(";
                }
                // Append the bond type to the result string based on the weight of the bond
                if (data.getBonds().get(i).getWeight() == 2) {
                    result += "=";
                } else if (data.getBonds().get(i).getWeight() == 3) {
                    result += "#";
                }
                // Recursively call this method on the child Atom object
                // and append the result to the result string.
                result = smileHelper(data.getBonds().get(i).getChild(), result);
                // If there is more than one non-H child Atom, append ")".
                if (temp > 1) {
                    result += ")";
                }
            }
        }
        // Return the final SMILES string representation of the Atom object and its child objects.
        return result;
    }
    
    // This method takes an Atom object and a String as input and returns a structural formula string
    // representation of the Atom and its child objects through recursive calls.
    // The method is logically similar to smile, but takes into account the number of hydrogen atoms
    // and the number of hydrogen atoms
    public String structuralHelper(Atom data, String result) {
        // If the current Atom object's element is not "H", append its element to the result string.
        if (!data.getElement().equals("H")) {
            result += data.getElement();
        }
        // calH means counting the number of H's contained in that atom and deciding on the
        // subsequent operation based on the number of hydrogen atoms.
        int calH;
        // temp refers to the number of subtrees that are non-hydrogen atoms,
        // and the brackets are added or subtracted according to the value of temp.
        int temp = 0;
        // Iterate through all of the Atom's bonds to count the number of non-H child atoms.
        for (int i = 0; i < data.getBonds().size(); i++) {
            if (!data.getBonds().get(i).getChild().getElement().equals("H")) {
                temp ++;
            }
        }
        // Calculate the number of hydrogen atoms for the current Atom based on the difference between
        // the total number of bonds and the number of non-H child atoms.
        calH = data.getBonds().size() - temp;
        // If there is at least one hydrogen atom, append "H" to the result string.
        if (calH > 0) {
            result += "H";
        }
        // If there is more than one hydrogen atom, append the number of hydrogen atoms
        // to the result string.
        if (calH > 1) {
            result += calH;
        }
        // The loop iterates through all the bonds in the atam and adds the non-hydrogen atoms
        // in the bond, outside of the measurement, and if non-hydrogen atoms are present,
        // it does a direct recursion to add the non-hydrogen atom's sub-atom.
        for (int i = 0; i < data.getBonds().size(); i++) {
            if (!data.getBonds().get(i).getChild().getElement().equals("H")) {
                if (temp > 1) {
                    result += "(";
                }
                if (data.getBonds().get(i).getWeight() == 2) {
                    result += "=";
                } else if (data.getBonds().get(i).getWeight() == 3) {
                    result += "#";
                }
                // Recursively call this method on the child Atom object and
                // append the result to the result string.
                result = structuralHelper(data.getBonds().get(i).getChild(), result);
                if (temp > 1) {
                    result += ")";
                }
            }
        }
        // Return the final structural formula string representation of
        // the Atom object and its child objects.
        return result;
    }
}
