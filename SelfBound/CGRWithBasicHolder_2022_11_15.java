package com.company.javaRelearn.SelfBound;

class Subtype extends BasicHolder_2022_11_15<Subtype> {}

public class CGRWithBasicHolder_2022_11_15 {
    public static void main(String[] args) {
        Subtype st1 = new Subtype(), st2 = new Subtype();
        st1.set(st2);
        Subtype st3 = st1.get();
        st1.f();
    }
}
