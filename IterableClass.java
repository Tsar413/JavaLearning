package com.company.javaRelearn;

import java.util.Iterator;

public class IterableClass implements Iterator<String> {
    protected String[] words = ("And that is how" +
            "we know the Earth to be banana-shaped.").split(" ");
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (IterableClass it = new IterableClass(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s + " ");
        }
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }
}
