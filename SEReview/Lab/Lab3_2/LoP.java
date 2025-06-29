package com.company.javaRelearn.SEReview.Lab.Lab3_2;

import java.io.PrintStream;
import java.util.Iterator;

public class LoP implements Iterator<Person> {
    private Person[] list;
    private int i, max, it;

    public LoP() {
        max = 10;
        list = new Person[max];
        i = 0;
    }

    public void add(Person p) {
        list[i++] = p;
    }

    public void remove(Person p) {
        int j;
        for (j = 0; j < i; j++)
            if (list[j] == p)
                break;
        i--;
        for (; j < i; j++)
            list[j] = list[j + 1];
    }

    public Person find(String n) {
        for (int j = 0; j < i; j++)
            if (list[j].getName().equals(n))
                return list[j];
        return null;
    }

    public void print(PrintStream ps) {
        for (int j = 0; j < i; j++) {
            list[j].print(ps);
            ps.println();
        }
    }

    public Person[] getList() {
        return list;
    }

    public void reset() {
        it = 0;
    } //Back to the start of Workers

    public Person next() {
        return (it == i) ? null : list[it++];
    } //returns Worker or null

    public boolean hasNext() {
        return it < i;
    }
}
