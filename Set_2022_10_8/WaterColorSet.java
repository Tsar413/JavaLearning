package com.company.javaRelearn.Set_2022_10_8;

import java.util.EnumSet;
import java.util.Set;

import static com.company.javaRelearn.Set_2022_10_8.Watercolors.*;
import static com.company.javaRelearn.Set_2022_10_8.Sets_2022_10_5.*;

public class WaterColorSet {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(ZINC, ORANGE);
        Set<Watercolors> set2 = EnumSet.range(MEDIUM_YELLOW, DEEP_YELLOW);
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("union(set1, set2): " + union(set1, set2));
        Set<Watercolors> subset = intersection(set1, set2);
        System.out.println("intersection(set1, set2): " + subset);
        System.out.println("difference(set1, subset): " + difference(set1, subset));
        System.out.println("difference(set2, subset): " + difference(set2, subset));
        System.out.println("complement(set1, set2): " + complement(set1, set2));
    }
}
