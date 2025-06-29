package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompilerIntelligence_2022_11_2 {
    public static void main(String[] args) {
        List<? extends Fruit3> flight = Arrays.asList(new Apple3());
        flight.contains(new Apple3());
        flight.indexOf(new Apple3());
    }
}
