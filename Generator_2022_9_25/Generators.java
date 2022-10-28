package com.company.javaRelearn.Generator_2022_9_25;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {
    public static <T>Collection<T>
    fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(
                new ArrayList<Coffee>(), new CoffeeGenerator(), 4
        );
        for (Coffee c : coffee)
            System.out.println(c);
        Collection<Integer> fnumbers = fill(
                new ArrayList<Integer>(), new Fibonacci(), 12
        );
        for(int i : fnumbers)
            System.out.print(i + ", ");
    }
}
