package com.company.javaRelearn;

class Art {
    Art() {
        System.out.println("Art()");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing()");
    }
}

public class BaseClassInitialisation_2022_6_19 extends Drawing {
    public BaseClassInitialisation_2022_6_19() {
        System.out.println("Cartoon()");
    }
    public static void main(String[] args) {
        BaseClassInitialisation_2022_6_19 baseClassInitialisation = new BaseClassInitialisation_2022_6_19();
    }
}
