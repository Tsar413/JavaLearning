package com.company.javaRelearn;

import com.company.javaRelearn.Tuple_2022_9_20.*;

public class SimpleTuple_2022_10_4 {
    public static <A,B> TwoTuple<A, B> twoTuple(A a, B b) {
        return new TwoTuple<A,B>(a,b);
    }
    public static <A,B,C> ThreeTuple<A, B, C> threeTuple(A a, B b, C c) {
        return new ThreeTuple<A,B,C>(a,b,c);
    }
}
