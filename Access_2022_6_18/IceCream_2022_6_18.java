package com.company.javaRelearn.Access_2022_6_18;

class Sundae {
    private Sundae() {

    }
    static Sundae makeASundae() {
        return new Sundae();
    }
}

public class IceCream_2022_6_18 {
    public static void main(String[] args) {
        Sundae sundae = Sundae.makeASundae();
    }
}
