package com.company.javaRelearn;

public class Wildcards_2022_11_9 {
    static void rawArgs(Holder4_2022_11_5 holder, Object arg) {
        Object obj = holder.get();
    }

    static void unboundedArg(Holder4_2022_11_5<?> holder, Object arg) {
        Object obj = holder.get();
    }

    static <T> T exact1(Holder4_2022_11_5<T> holder, T arg) {
        T t = holder.get();
        return t;
    }

    static <T> T exact2(Holder4_2022_11_5<T> holder, T arg) {
        holder.set(arg);
        T t = holder.get();
        return t;
    }
    static <T> T wildSubtype(Holder4_2022_11_5<? extends T> holder, T arg) {
        T t = holder.get();
        return t;
    }
    static <T> void wildSupertype(Holder4_2022_11_5<? super T> holder, T arg) {
        holder.set(arg);
        Object obj = holder.get();
    }

    public static void main(String[] args) {
        Holder4_2022_11_5 raw = new Holder4_2022_11_5<Long>();
        raw = new Holder4_2022_11_5();
        Holder4_2022_11_5<Long> qualified = new Holder4_2022_11_5<Long>();
        Holder4_2022_11_5<?> unbounded = new Holder4_2022_11_5<Long>();
        Holder4_2022_11_5<? extends Long> bounded = new Holder4_2022_11_5<Long>();
        Long lng = 1L;

        rawArgs(raw, lng);
        rawArgs(qualified, lng);
        rawArgs(unbounded, lng);
        rawArgs(bounded, lng);

        unboundedArg(raw, lng);
        unboundedArg(qualified, lng);
        unboundedArg(unbounded, lng);
        unboundedArg(bounded, lng);

    }
}
