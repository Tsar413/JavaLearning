package com.company.javaRelearn.Tuple_2022_9_20;

import java.util.ArrayList;

public class TupleList_2022_10_11<A, B, C, D> extends ArrayList<FourthTuple<A, B, C, D>> {
    public static void main(String[] args) {
        TupleList_2022_10_11<Vehicle, Amphibian, String, Integer> t1 =
                new TupleList_2022_10_11<Vehicle, Amphibian, String, Integer>();
        t1.add(TupleTest.h());
        t1.add(TupleTest.h());
        for (FourthTuple<Vehicle, Amphibian, String, Integer> i : t1) {
            System.out.println(i);
        }
    }
}
