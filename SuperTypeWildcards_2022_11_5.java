package com.company.javaRelearn;

import java.util.*;

public class SuperTypeWildcards_2022_11_5 {

    static void writeTo(List<? super Apple3> apples) {
        apples.add(new Apple3());
        apples.add(new Jonathan3());
    }

}
