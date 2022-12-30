package com.company.javaRelearn;

import com.company.javaRelearn.Generator_2022_9_25.Generator;

import java.util.Iterator;

class Letters implements Generator<Pair_2022_12_29<Integer,String>>, Iterable<Integer> {
    private int size = 9;
    private int number = 1;
    private char letter = 'A';
    @Override
    public Pair_2022_12_29<Integer, String> next() {
        return new Pair_2022_12_29<Integer, String>(
                number++, "" + letter++);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return number < size;
            }

            @Override
            public Integer next() {
                return number++;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}

public class MapDataTest_2022_12_29 {
    public static void main(String[] args) {
        System.out.println(MapData_2022_12_29.map(new Letters(),11));
        System.out.println(MapData_2022_12_29.map(new CountingGenerator_2022_12_25.Character(),
                "Value",6));
        System.out.println(MapData_2022_12_29.map(new Letters(),"Pop"));
    }

}
