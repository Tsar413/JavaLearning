package com.company.javaRelearn.Tuple_2022_9_20;

public class FourthTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
    public final D fourth;
    public FourthTuple(A a, B b, C c, D d) {
        super(a, b, c);
        this.fourth = d;
    }

    @Override
    public String toString() {
        return "FourthTuple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                '}';
    }
}
