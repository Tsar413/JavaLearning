package com.company.javaRelearn;

public class CaptureConversion_2022_11_9 {
    static <T> void f1(Holder4_2022_11_5<T> holder) {
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }
    static void f2(Holder4_2022_11_5<?> holder) {
        f1(holder);
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Holder4_2022_11_5 raw = new Holder4_2022_11_5<Integer>(1);
        f2(raw);
        Holder4_2022_11_5 rawBasic = new Holder4_2022_11_5();
        rawBasic.set(new Object());
        f2(rawBasic);
        Holder4_2022_11_5<?> wildcard = new Holder4_2022_11_5<Double>(1.0);
        f2(wildcard);
    }
}
