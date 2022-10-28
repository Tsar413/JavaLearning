package com.company.javaRelearn.Generator_2022_9_25;

public class CountObject {
    private static long counter = 0;
    public final long id = counter++;
    public long id() {
        return id;
    }

    @Override
    public String toString() {
        return "CountObject{" +
                "id=" + id +
                '}';
    }
}
