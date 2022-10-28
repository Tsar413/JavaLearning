package com.company.javaRelearn;

import java.util.Random;

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 =
            ClassInitialization_2022_8_23.rand.nextInt(1000);
    static {
        System.out.println("Initialization Initable");
    }
}

class Initable2 {
    static final int staticNonFinal = 147;
    static {
        System.out.println("Initialization Initable2");
    }
}

class Initable3 {
    static final int staticFinal = 74;
    static {
        System.out.println("Initialization Initable3");
    }
}

public class ClassInitialization_2022_8_23 {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception {
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("com.company.javaRelearn.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticFinal);

    }
}
