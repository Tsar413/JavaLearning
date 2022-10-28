package com.company.javaRelearn.Tuple_2022_9_20;

public class FifthTuple<A, B, C, D, E> extends FourthTuple<A, B, C, D> {
    public final E fifth;
    public FifthTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        this.fifth = e;
    }

    @Override
    public String toString() {
        return "FifthTuple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", fifth=" + fifth +
                '}';
    }
}
