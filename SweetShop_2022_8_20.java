package com.company.javaRelearn;

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gym");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop_2022_8_20 {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After loading candy");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find Gum");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After Loading Cookie");
    }
}
