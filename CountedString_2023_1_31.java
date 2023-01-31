package com.company.javaRelearn;

import java.util.*;

public class CountedString_2023_1_31 {
    private static List<String> created =
            new ArrayList<String>();
    private String s;
    private int id = 0;
    public CountedString_2023_1_31(String str) {
        s = str;
        created.add(s);
        //id代表了被引用次数
        for (String s2 : created) {
            if (s2.equals(s)) {
                id++;
            }
        }
    }

    @Override
    public String toString() {
        return "String: " + s + " id: " + id +
                " hashCode(): " + hashCode();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        return result;
    }

    @Override
    public boolean equals(Object o) {
       return o instanceof CountedString_2023_1_31 &&
               s.equals(((CountedString_2023_1_31)o).s) &&
               id == ((CountedString_2023_1_31)o).id;
    }

    public static void main(String[] args) {
        Map<CountedString_2023_1_31,Integer> map =
                new HashMap<CountedString_2023_1_31,Integer>();
        CountedString_2023_1_31[] cs = new CountedString_2023_1_31[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString_2023_1_31("h1");
            map.put(cs[i], i);
        }
        System.out.println(map);
        for (CountedString_2023_1_31 cstring : cs) {
            System.out.println("Looking up " + cstring);
            System.out.println(map.get(cstring));
        }
    }

}
