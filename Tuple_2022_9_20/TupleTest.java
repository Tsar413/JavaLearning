package com.company.javaRelearn.Tuple_2022_9_20;

class Amphibian {
}

class Vehicle {
}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<String, Integer>("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<Amphibian, String, Integer>(
                new Amphibian(), "h1", 47);
    }

    static FourthTuple<Vehicle, Amphibian, String, Integer> h() {
        return
                new FourthTuple<Vehicle, Amphibian, String, Integer>(
                        new Vehicle(), new Amphibian(), "h1", 47);
    }

    static FifthTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return
                new FifthTuple<Vehicle, Amphibian, String, Integer, Double>(
                        new Vehicle(), new Amphibian(), "h1", 47, 11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
